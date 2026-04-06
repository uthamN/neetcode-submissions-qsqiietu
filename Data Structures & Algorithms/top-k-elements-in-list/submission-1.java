class Solution {
    private int returnMax(HashMap<Integer, Integer> n) {
        int maxKey = -1;
        int maxFreq = -1;

        for (int key : n.keySet()) {
            if (n.get(key) > maxFreq) {
                maxFreq = n.get(key);
                maxKey = key;
            }
        }

        return maxKey;
    }
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer, Integer> n = new HashMap<>();
        for(int i: nums) {
            if(n.containsKey(i)) {
                n.put(i, n.get(i)+1);
            } else {
                n.put(i, 1);
            }
        }

        int res[];
        res = new int[k];

        for(int i=0;i< k;i++) {
            int max = returnMax(n);
            res[i] = max;
            n.put(max, -1);
        }

        return res;     
    }
}
