class Solution {
    public int dominantIndex(int[] nums) {
                int max=nums[0];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i] && i!=index){
                max=nums[i];
                index=i;
            }
        }
        
        
        for(int i=0;i<nums.length;i++){
          if(nums[i]*2>max && i!=index){
            index=-1;
            break;
          }
        }
       return index;
    }
}