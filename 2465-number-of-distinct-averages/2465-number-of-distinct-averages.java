class Solution {
    public int distinctAverages(int[] nums) {
  
        
    Arrays.sort(nums);
    
    int start=0;
    int end=nums.length-1;
    
    double sum=0;
    int count=0;
    int k=0;
    double array[]=new double[nums.length/2];
    while(start<end){
     
      sum=(double)(nums[start]+nums[end])/2;
      array[k]=sum;
      start++;
      end--;
      k++;
    }
    
    Arrays.sort(array);
    
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]==array[j]){
          count++;
          break;
        }
      }
    }
     return (array.length-count);
    }
}