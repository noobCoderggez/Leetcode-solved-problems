class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int arr[]=new int[nums.length/2];
        int k=0;
        while(i<j){
            arr[k]=nums[i]+nums[j];
            i++;
            j--;
            k++;
        }
        
        int max=arr[0];
        
        for(int l=1;l<arr.length;l++){
            if(arr[l]>max){
                max=arr[l];
            }
        }
        return max;
    }
}