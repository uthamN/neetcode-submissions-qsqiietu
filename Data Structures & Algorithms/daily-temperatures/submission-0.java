class Solution {
    public int[] dailyTemperatures(int[] t) {
        int l = t.length;
        int[] res = new int[l];
        for(int i = 0; i < l ;i++) {
            int c = 0;
            for(int j = i; j < l ;j++) {
                if (t[j] > t[i]) {
                    c = j - i;
                    res[i] = c;
                    break;
                }
            }
            res[i] = c;
        }
        return res;
    }
}
