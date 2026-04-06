class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();

        for(String t: tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int e2 = Integer.parseInt(s.pop());
                int e1 = Integer.parseInt(s.pop());
                if(t.equals("+")) {
                    s.push(Integer.toString(e1 + e2));
                } else if (t.equals("-")) {
                    s.push(Integer.toString(e1 - e2));
                } else if (t.equals("*")) {
                    s.push(Integer.toString(e1 * e2));
                } else {
                    s.push(Integer.toString(e1 / e2));
                }
            } else {
                s.push(t);
            }
        }

        if(s.empty()) {
            return 0;
        } else {
            return Integer.parseInt(s.peek());
        }
    }
}
