class Solution {
    public int[] sortArrayByParity(int[] nums) {
           int count=0;
    int count1=0;
    
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2==0){
        count++;
      }
      else{
        count1++;
      }
    }
    
    int even[]=new int[count];
    int odd[]=new int[count1];
    
    int j=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2==0){
        even[j]=nums[i];
        j++;
      }
    }
    
     int k=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]%2!=0){
        odd[k]=nums[i];
        k++;
      }
    }
    
    int array[]=new int[count+count1];
    for(int i=0;i<even.length;i++){
      array[i]=even[i];
    }
    
     int l=0;
     for(int i=count;i<array.length;i++){
      array[i]=odd[l];
      l++;
    }
  
    return array;
    }
}