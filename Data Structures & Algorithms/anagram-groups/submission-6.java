class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for(String s:strs){
            char[] value = s.toCharArray();
            Arrays.sort(value);
            String sortedS = new String(value);
            result.putIfAbsent(sortedS, new ArrayList<>());
            result.get(sortedS).add(s);
            
        }return new ArrayList<>(result.values());
    }
}
