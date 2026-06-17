class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);

         char[] charArrayt = t.toCharArray();
        Arrays.sort(charArrayt);
        System.out.println(charArrayt);

        if(Arrays.equals(charArrayt,charArray)){
            return true;
        } else{
             return false;
        }
    }   
}
