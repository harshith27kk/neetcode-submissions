class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = Arrays.stream(strs)
            .collect(Collectors.groupingBy(s -> {
                char[] sortedS = s.toCharArray();
                Arrays.sort(sortedS);
                return new String(sortedS);
            }));
        return new ArrayList<>(res.values());
    }
}
