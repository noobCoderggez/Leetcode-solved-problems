class Solution {
    public String makeSmallestPalindrome(String s) {
    char a[]=s.toCharArray();
    
    int start=0;
    int end=a.length-1;
    
    while(start<end){
      if(a[start]!=a[end])
        if(a[start]<a[end]){
        a[end]=a[start];
        start++;
        end--;
      }
      else{
        a[start]=a[end];
        start++;
        end--;
      }
      
      if(a[start]==a[end]){
        start++;
        end--;
      }
    }
    
    String str="";
    for(int i=0;i<a.length;i++){
     str=str+String.valueOf(a[i]);
    }
    
   return str;
    }
}