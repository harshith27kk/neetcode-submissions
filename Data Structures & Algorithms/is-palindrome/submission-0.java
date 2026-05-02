class Solution {
    public boolean isPalindrome(String s) {
        String original = s.replaceAll("\\W","").toLowerCase();
        String reverseString = new StringBuilder(original).reverse().toString();
        if(original.equals(reverseString)) return true;
        return false;
    }
}
