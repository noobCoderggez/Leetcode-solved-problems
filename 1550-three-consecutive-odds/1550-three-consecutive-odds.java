class Solution {
    public boolean threeConsecutiveOdds(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]%2!=0 && nums[i+1]%2!=0){
        count++;
        if(count==2){
          break;
        }
      }
      else{
        count=0;
      }
    }
    if(count==2){
      return true;
    }
    else{
      return false;
    }
    }
}