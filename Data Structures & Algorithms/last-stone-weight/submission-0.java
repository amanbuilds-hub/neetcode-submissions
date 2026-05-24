

class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones into heap
        for (int stone : stones) {
            pq.add(stone);
        }

        // Smash stones until one or none remains
        while (pq.size() > 1) {

            int y = pq.poll(); // heaviest
            int x = pq.poll(); // second heaviest

            // If weights are different
            if (y != x) {
                pq.add(y - x);
            }
        }

        // Return remaining stone or 0
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
