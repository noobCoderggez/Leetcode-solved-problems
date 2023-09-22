class Solution {
    public int totalMoney(int n) {
    int res=n/7;
    int mod=n%7;
    
    int sum=0;
    for(int i=1;i<=res;i++){
      for(int j=i;j<=i+6;j++){
        sum=sum+j;
      }
    }
    
   
    int k=res+1;
    for(int i=1;i<=mod;i++){
      sum=sum+k;
      k++;
    }
    
     return sum;
    }
}