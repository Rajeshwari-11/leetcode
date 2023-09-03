class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
       
        int res=0;
        for(int i=0;i<nums.length-2;i++){
            int ans =nums[nums.length-1];
            ans= ans*nums[i]*nums[i+1];
            if(Math.abs(ans)>res){
                res=ans;
            }
        }
        return res;
        
    }
}