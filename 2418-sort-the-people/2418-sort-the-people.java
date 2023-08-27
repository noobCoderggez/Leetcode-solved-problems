class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
            int arr[]=new int[heights.length];
    
    for(int i=0;i<heights.length;i++){
      arr[i]=heights[i];
    }
    
    
    int temp=0;
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
     
   String dup[]=new String[names.length];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<heights.length;j++){
        if(arr[i]==heights[j]){
          dup[i]=names[j];
        }
      }
    }
    
    return dup;
    }
}