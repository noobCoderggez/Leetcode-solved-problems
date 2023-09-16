class Solution {
    public void nextPermutation(int[] nums) {
            int index=-1;
    
    
    for(int i=nums.length-2;i>=0;i--){
      if(nums[i]<nums[i+1])
      {
        index=i;
        break;
      }
    }
    
    if(index==-1){
       int i=0;
       int j=nums.length-1;
       int temp=0;
       while(i<j){
         temp=nums[i];
         nums[i]=nums[j];
         nums[j]=temp;
         i++;
         j--;
        } 
    }
    else{
    
  
    int temp=0;
    for(int i=nums.length-1;i>=index;i--){
      if(nums[i]>nums[index]){
        temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
        break;
      }
     
    }
    
    
  int i=index+1;
  int j=nums.length-1;
  int count=0;
  while(i<j){
    count=nums[i];
    nums[i]=nums[j];
    nums[j]=count;
    i++;
  j--;
  }
  
    }

    }
}