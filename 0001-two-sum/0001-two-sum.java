class Solution {
    public int[] twoSum(int[] nums, int ta) {
        int sum=0;
     for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
             sum=nums[i]+nums[j];
        
        if(sum==ta){
            return new int []{i,j};
        }
        }
     }
    return new int []{-1,-1};
    }
}