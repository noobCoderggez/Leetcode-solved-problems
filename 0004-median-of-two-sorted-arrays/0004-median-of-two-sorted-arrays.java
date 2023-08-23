class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
    int arr[]=new int[nums1.length+nums2.length];
    int mid=arr.length-nums2.length;
    
    for(int i=0;i<mid;i++){
      arr[i]=nums1[i];
    }
    for(int i=mid;i<arr.length;i++){
      arr[i]=nums2[i-mid];
    }
    
     
     int gap=arr.length/2;
   
   while(gap>0){
     for(int i=gap;i<arr.length;i++){
       int current=arr[i];
       int j=i;
       while(j>=gap && arr[j-gap]>current){
         arr[j]=arr[j-gap];
         j=j-gap;
       }
       arr[j]=current;
     }
     gap=gap/2;
   }
     

     double sum=0;
     int div=0;
     int middle=arr.length/2;
     
     if(arr.length%2==0){
     sum=arr[middle-1]+arr[middle];
     System.out.println(sum);
     div=2;
     }
     else{
       sum=arr[middle];
       div=1;
     }
     
     return (sum/div);
    }
}