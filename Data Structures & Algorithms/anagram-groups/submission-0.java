class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String joined = new String(ch);
            if(!map.containsKey(joined)){
                map.put(joined, new ArrayList<>());
            }
            map.get(joined).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
