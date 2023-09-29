class Solution {
    public int[][] transpose(int[][] nums) {
    int arr[][]=new int[nums[0].length][nums.length];
    for(int i=0;i<nums[0].length;i++){
      for(int j=0;j<nums.length;j++){
        arr[i][j]=nums[j][i];
      }
    }
    return arr;
    }
}