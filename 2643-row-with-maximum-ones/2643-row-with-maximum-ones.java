class Solution {
    public int[] rowAndMaximumOnes(int[][] nums) {
            int arr[]=new int[2];
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
      
      arr[0]=index;
      arr[1]=max;
    
     
    }
    
   return arr;
    }
}