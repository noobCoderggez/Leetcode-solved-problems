class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}