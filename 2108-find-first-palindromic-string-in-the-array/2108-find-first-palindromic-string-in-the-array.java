class Solution {
    public String firstPalindrome(String[] words) {
            int index=-1;
   int count=0;
    for(int i=0;i<words.length;i++){
      char a[]=words[i].toCharArray();
      
      int start=0;
      int end=words[i].length()-1;
      
     count=0;
      while(start<end){
        if(a[start]==a[end]){
          start++;
          end--;
        }
        else{
          count++;
          break;
        }
      }
      
      if(count==0){
        index=i;
        break;
      }
     
    }
     String str="";
    if(count==0){
      str=words[index];
    }
    
    return str;
    }
}