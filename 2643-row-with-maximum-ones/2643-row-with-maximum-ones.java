class Solution {
    public int[] rowAndMaximumOnes(int[][] nums) {

    int max=0;
    int index=0;
    for(int i=0;i<nums.length;i++){
      int count=0;
      for(int j=0;j<nums[i].length;j++){
        if(nums[i][j]==1){
          count++;
        }
      }
      if(count>max){
        max=count;
         index=i;
      }
    }

    
   return new int[] {index,max};
    }
}