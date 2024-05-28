class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k=k%len;
        logic(nums,0,len-1);
        logic(nums,0,k-1);
        logic(nums,k,len-1);
    }    
        
    public void logic(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
        
    }
}