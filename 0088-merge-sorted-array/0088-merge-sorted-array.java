class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int arr[]=new int[m+n];
    
    for(int i=0;i<m;i++){
      arr[i]=nums1[i];
    }
    int j=0;
    for(int i=m;i<arr.length;i++){
      arr[i]=nums2[j];
      j++;
    }
        
    Arrays.sort(arr);

    for(int i=0;i<nums1.length;i++){
      nums1[i]=arr[i];
    }

    
    }
}