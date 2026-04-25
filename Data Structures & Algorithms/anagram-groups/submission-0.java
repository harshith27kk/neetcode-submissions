class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String resultStr = new String(sortedS);
            System.out.println(resultStr);
            res.putIfAbsent(resultStr, new ArrayList<>());
            res.get(resultStr).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
