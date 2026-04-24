class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
    char[] s1 = s.toCharArray();
    Arrays.sort(s1);
    // String results = toString(s1);
    // char[] chars = s1.toCharArray();
    System.out.println(s1);

    char[] s2 = t.toCharArray();
    Arrays.sort(s2);
    // String results = toString(s1);
    // char[] chars = s1.toCharArray();
    System.out.println(s2);
    if(Arrays.equals(s1,s2)){
        return true;
    } else
    return false;
    }
}
