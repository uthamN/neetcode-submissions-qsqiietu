class Solution {
    public boolean isValid(String s) {
        List<Character> n = new ArrayList<>();
        for(int i = 0; i < s.length() ;i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                n.add(s.charAt(i));
            } else {
                if (n.size() == 0) {
                    return false;
                }
                if (s.charAt(i) == ']' && n.get(n.size() - 1) != '[') {
                    return false;
                }
                if (s.charAt(i) == ')' && n.get(n.size() - 1) != '(') {
                    return false;
                }
                if (s.charAt(i) == '}' && n.get(n.size() - 1) != '{') {
                    return false;
                }
                n.remove(n.size() - 1);
            }
        }
        if (n.size() == 0) {
            return true;
        }
        return false;
    }
}
