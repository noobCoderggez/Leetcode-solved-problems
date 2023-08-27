class Solution {
    public String sortSentence(String s) {
            String arr[]=s.split(" ");
    
    
    int i=0;
    char j='1';
    String str="";
    while(i<arr.length){
      if(arr[i].charAt(arr[i].length()-1)==j){
       char a[]=arr[i].toCharArray();
       for(int k=0;k<a.length;k++){
         
         if((a[k]>'0' && a[k]<='9')){
          
          str=str+" ";
           }
         
         else{
           str=str+String.valueOf(a[k]);
         }
       
       }
        j++;
       i=0;
      }
        else{
        i++;
      }
       }
      
      return str.trim();
    }
}