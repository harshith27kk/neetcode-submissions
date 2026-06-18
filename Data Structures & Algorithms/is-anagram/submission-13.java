class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sortedS = s.toCharArray();
        // Arrays.sort(sortedS);
        // char[] sortedT = t.toCharArray();
        // Arrays.sort(sortedT);

        // return Arrays.equals(sortedS,sortedT);

        String sortedS = s.chars()
        .sorted()
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining());

        String sortedT = t.chars()
        .sorted()
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining());

        return sortedS.equals(sortedT);

    }
}
