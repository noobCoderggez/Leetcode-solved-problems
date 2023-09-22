class Solution {
    public int[] leftRightDifference(int[] nums) {
    int leftsum[]=new int[nums.length];
    int rightsum[]=new int[nums.length];
    
    leftsum[0]=0;
    rightsum[rightsum.length-1]=0;
    
    int sum=0;
    int sum1=0;
    
    int k=1;
    int l=nums.length-2;
    for(int i=0;i<nums.length-1;i++){
      sum=sum+nums[i];
      leftsum[k]=sum;
      k++;
      
    }
    
     for(int i=nums.length-1;i>0;i--){
      sum1=sum1+nums[i];
      rightsum[l]=sum1;
      l--;
    }
     
     int result[]=new int[nums.length];
     for(int i=0;i<rightsum.length;i++){
       result[i]=Math.abs(leftsum[i]-rightsum[i]);
     }
     
   return result;
    }
}