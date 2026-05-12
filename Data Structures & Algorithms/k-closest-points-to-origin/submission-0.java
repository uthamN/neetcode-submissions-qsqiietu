class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        Map<Integer, Integer> dists = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            int dist = point[0] * point[0] + point[1] * point[1];
            dists.put(i, dist);
        }

        Map<Integer, Integer> sortedMap =
            dists.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (e1, e2) -> e1,
                    LinkedHashMap::new
                ));

        int[][] res = new int[k][2];
        
        int index = 0;
        for (Integer pointIndex : sortedMap.keySet()) {
            if (index == k) break;

            res[index] = points[pointIndex];
            index++;
        }

        return res;
    }
}
