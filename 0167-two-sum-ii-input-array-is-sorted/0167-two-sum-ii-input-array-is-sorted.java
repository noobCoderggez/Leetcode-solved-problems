class Solution {
    public int[] twoSum(int[] numbers, int target) {
           int start=0;
    int end=numbers.length-1;
    
    int sum=0;
    int arr[]=new int[2];
    while(start<end){
      sum=numbers[start]+numbers[end];
      
      if(sum==target){
        arr[0]=start+1;
        arr[1]=end+1;
        break;
      }
      
      else if(sum>target){
        end--;
      }
      else{
        start++;
      }
    } 
        return arr;
    }
}