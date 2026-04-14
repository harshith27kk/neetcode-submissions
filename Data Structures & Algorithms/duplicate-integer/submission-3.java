class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> number = new HashSet<>();
       int n = nums.length;

        for(int i = 0; i< n; i++){
            if(number.contains(nums[i]))
                return true;
            number.add(nums[i]);
        }
        return false;
    }
}