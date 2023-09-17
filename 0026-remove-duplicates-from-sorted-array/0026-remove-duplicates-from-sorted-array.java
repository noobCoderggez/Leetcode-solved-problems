class Solution {
    public int removeDuplicates(int[] arr) {
            int i=0;
    int j=i+1;
    int k=1;
    while(i<arr.length && j<arr.length){
      if(arr[i]!=arr[j]){
        arr[k]=arr[j];
        k++;
        i=j;
        j=i+1;
      }
      else{
        j++;
      }
    }
  return k;
    }
}