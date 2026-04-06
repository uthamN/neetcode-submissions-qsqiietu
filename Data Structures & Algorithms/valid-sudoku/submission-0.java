class Solution {
    private boolean hasDupes(List<Character> a) {
        HashSet<Character> hs = new HashSet<>();
        for(char c: a) {
            if(!hs.add(c)) {
                return true;
            }
        }
        return false;
    }

    private List<Character> cleanList(List<Character> a) {
        List<Character> res = new ArrayList<>();
        for(char c: a) {
            if(c != '.') {
                res.add(c);
            }
        }
        return res;
    }

    public boolean isValidSudoku(char[][] board) {
        for(char[] cArr: board) {
            List<Character> a = new ArrayList<>();
            for(char c: cArr) {
                a.add(c);
            }
            a = cleanList(a);
            if(hasDupes(a)) {
                return false;
            }
        }

        for(int i = 0;i < board[0].length; i++) {
            List<Character> a = new ArrayList<>();
            for(int j = 0; j < board.length;j++) {
                a.add(board[j][i]);
            }
            a = cleanList(a);
            if(hasDupes(a)) {
                return false;
            }
        }

        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                List<Character> a = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        a.add(board[blockRow * 3 + i][blockCol * 3 + j]);
                    }
                }
                a = cleanList(a);
                if(hasDupes(a)) {
                    return false;
                }
            }
        }
        return true;
    }
}
