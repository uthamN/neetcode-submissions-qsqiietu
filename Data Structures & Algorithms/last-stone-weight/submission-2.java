class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : stones) {
            maxHeap.add(i);
        }

        while(maxHeap.size() > 1) {
            int maxS1 = maxHeap.poll();
            int maxS2 = maxHeap.poll();

            maxHeap.add((maxS1 - maxS2) > 0 ? (maxS1 - maxS2) : -1*(maxS1 - maxS2));
        }

        return maxHeap.poll();
    }
}
