class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums) {
            s.add(i);
        }
        int maxLen = 0;
        int l = nums.length;
        for(int i = 0;i < l;i++) {
            int ml = 0;
            if(s.contains(nums[i] - 1)) {
                continue;
            } else {
                ml += 1;
                int temp = nums[i];
                while (s.contains(temp + 1)) {
                    ml += 1;
                    temp += 1;
                }
                maxLen = (maxLen > ml) ? maxLen : ml; 
            }
        }
        return maxLen;
    }
}
