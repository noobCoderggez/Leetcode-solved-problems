class Solution {
    public int[] separateDigits(int[] nums) {
            String s="";
    
    for(int i=0;i<nums.length;i++){
      s=s+String.valueOf(nums[i]);
    }
    
    char a[]=s.toCharArray();
    
    int x[]=new int[a.length];
    
    for(int i=0;i<x.length;i++){
      x[i]=Character.getNumericValue(a[i]);
    }
   
   return x;
    }
}