class Solution {
    public String longestCommonPrefix(String[] s) {
            String result="";
    int i=0;
    int j=i+1;
    if(s.length<2){
      result=s[0];
    }
   
    else{
    int count=s[0].length();
    while(i<s.length-1){
      String str="";
       int k=0;
       int l=0;
      while(k<s[i].length() && l<s[j].length()){
      if(s[i].charAt(k)==s[j].charAt(l)){
        str=str+Character.toString(s[i].charAt(k));
      }
       else{
        break;
      }
      k++;
      l++;
      }
     
      if(str.length()<=count){
          count=str.length();
          result=str;
        }
      i++;
      j++;
    }
    }
    return result; 
    }
}