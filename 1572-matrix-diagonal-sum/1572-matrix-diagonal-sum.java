class Solution {
    public int diagonalSum(int[][] nums) {
           int sum=0;
    
    for(int i=0;i<nums.length;i++){
     sum+=(nums[i][i])+(nums[i][nums.length-1-i]);
    }
    
  
    if(nums.length%2!=0){
      sum-=nums[nums.length/2][nums.length/2];
    }
    
    
    return sum;
    }
}