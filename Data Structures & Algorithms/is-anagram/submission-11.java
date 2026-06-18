class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        String sortedS = s.chars()
        .sorted()
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining());
        System.out.println(sortedS);

        String sortedT = t.chars()
        .sorted()
        .mapToObj(c -> String.valueOf((char) c))
        .collect(Collectors.joining());

        return sortedS.equals(sortedT);
    }
}
