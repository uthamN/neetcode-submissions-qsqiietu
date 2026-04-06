class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(char c: s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            } else if(c >= '0' && c<='9') {
                sb.append(c);
            }
        }

        int start = 0, end = sb.length() - 1;
        String us = sb.toString();
        while (start < end) {
            if(us.charAt(start) == us.charAt(end)) {
                start += 1;
                end -= 1;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
