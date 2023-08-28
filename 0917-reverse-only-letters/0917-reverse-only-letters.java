class Solution {
    public String reverseOnlyLetters(String s) {
            char arr[]=s.toCharArray();
    
    
    int start=0;
    int end=arr.length-1;
    
   
    char temp='0';
    while(start<end){
      if(((arr[start]>='a' && arr[start]<='z') || (arr[start]>='A' && arr[start]<='Z')) && ((arr[end]>='a' && arr[end]<='z') || (arr[end]>='A' && arr[end]<='Z'))){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
      
      else if(((arr[start]<'a' || arr[start]>'z') || (arr[start]<'A' || arr[start]>'Z')) && ((arr[end]>='a' && arr[end]<='z') || (arr[end]>='A' && arr[end]<='Z'))){
        start++;
      }
      else{
        end--;
      }
    }
    
    String str="";
    for(int j=0;j<arr.length;j++){
      str=str+String.valueOf(arr[j]);
    }
    
    return str;
    }
}