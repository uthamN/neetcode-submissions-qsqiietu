class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookup = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (lookup.containsKey(k)) {
                return new int[]{lookup.get(k), i};
            }

            lookup.put(nums[i], i);
        }

        return new int[]{0};
    }
}
