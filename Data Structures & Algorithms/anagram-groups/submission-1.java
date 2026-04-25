class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String result = new String(sortedS);
            res.putIfAbsent(result, new ArrayList<>());
            res.get(result).add(s);
        }
        // System.out.println(<=res.getValue()>);
        return new ArrayList<>(res.values());
    }
}
