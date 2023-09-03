class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       
        int c1=nums[0]*nums[1]*nums[nums.length-1];
        int c2 =nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int res = Math.max(c1,c2);
        return res;
        
    }
}