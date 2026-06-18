class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sortedS = s.toCharArray();
        // Arrays.sort(sortedS);
        // char[] sortedT = t.toCharArray();
        // Arrays.sort(sortedT);

        // return Arrays.equals(sortedS,sortedT);

        // java streams
        //  String sortedS = s.chars()
        //  .sorted()
        //  .mapToObj(c -> String.valueOf((char) c))
        //  .collect(Collectors.joining());

        // String sortedT = t.chars()
        // .sorted()
        // .mapToObj(c -> String.valueOf((char) c))
        // .collect(Collectors.joining());

        // return sortedS.equals(sortedT);


//O(n) complexity solution
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
