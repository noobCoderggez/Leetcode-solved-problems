class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
 
    Arrays.sort(arr);
    
    boolean flag=true;
    int sum=arr[0]-arr[1];
    for(int i=1;i<arr.length-1;i++){
     
     
      if(arr[i]-arr[i+1]!=sum){
        flag=false;
       
      }
      
    }
    
     return flag;
    }
}