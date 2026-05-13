class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // find max pile
        for (int bananas : piles) {
            high = Math.max(high, bananas);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if (hours <= h) {
                ans = mid;
                high = mid - 1; // try smaller speed
            } else {
                low = mid + 1; // need faster speed
            }
        }

        return ans;
    }

    private long calculateHours(int[] piles, int speed) {

        long totalHours = 0;

        for (int bananas : piles) {

            // ceil(bananas / speed)
            totalHours += (bananas + speed - 1) / speed;
        }

        return totalHours;
    }
}