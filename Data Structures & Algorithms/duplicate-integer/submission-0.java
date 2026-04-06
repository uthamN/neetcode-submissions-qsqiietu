class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int a : nums) {
            if(n.contains(a)) {
                return true;
            }
            n.add(a);
        }
        return false;
    }
}