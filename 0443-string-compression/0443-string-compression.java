class Solution {
    public int compress(char[] chars) {
            char first=chars[0];
    String str="";
    
    for(int i=0;i<chars.length-1;i++){
      if(chars[i+1]!=chars[i]){
       
       str=str+String.valueOf(chars[i+1]);
      }
    }
    str=first+str;
    char arr[]=str.toCharArray();
    
    
   
   String s="";
   int k=0;
    for(int i=0;i<arr.length;i++){
      int count=0;
      for(int j=k;j<chars.length;j++){
        if(arr[i]==chars[j] ){
          count++;
        }
        else{
          k=j;
          break;
        }
      }
      
      if(count>1){
      s=s+arr[i]+count;
      }
      else{
        s=s+arr[i];
      }
     
    }
    
    char ch[]=s.toCharArray();
    
    for(int i=0;i<ch.length;i++){
      chars[i]=ch[i];
    }

   return ch.length;
    }
}