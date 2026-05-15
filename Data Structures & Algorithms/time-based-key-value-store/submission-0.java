

class TimeMap {

    // Pair class to store timestamp and value
    class Pair {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    // Map<Key, List of Pair>
    HashMap<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        // If key doesn't exist, create new list
        map.putIfAbsent(key, new ArrayList<>());

        // Add timestamp-value pair
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {

        // If key not found
        if (!map.containsKey(key)) {
            return "";
        }

        List<Pair> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;

        String result = "";

        // Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {

                // possible answer
                result = list.get(mid).value;

                // search on right for larger valid timestamp
                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return result;
    }
}