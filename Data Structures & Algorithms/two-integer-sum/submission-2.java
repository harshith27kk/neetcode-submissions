class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> number = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];
            if(number.containsKey(diff)){
                return new int[]{number.get(diff),i};
            }
            number.put(nums[i],i);
        }
        return new int[]{};
    }
}
