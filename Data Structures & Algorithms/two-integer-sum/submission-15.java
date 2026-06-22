class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int n = target - nums[i];
            if(result.containsKey(n)){
                return new int[]{result.get(n),i};
            }result.put(nums[i],i);
        }return new int[]{};
    }
}
