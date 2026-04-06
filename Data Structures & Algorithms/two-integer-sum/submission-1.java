class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookup = new HashMap<>();

        for(int i = 0; i< nums.length; i++) {
            lookup.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (lookup.containsKey(k) && lookup.get(k) != i) {
                return new int[]{i, lookup.get(k)};
            }
        }

        return new int[]{0};
    }
}
