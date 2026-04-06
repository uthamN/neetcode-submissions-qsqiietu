class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int maxVol = 0;
        while(l <= r) {
            int vol = (h[l] > h[r] ? h[r] : h[l]) * (r - l);
            maxVol = maxVol > vol ? maxVol : vol;
            
            if(h[l] < h[r]) {
                l += 1;
            } else {
                r -= 1;
            }
        }
        return maxVol;
    }
}
