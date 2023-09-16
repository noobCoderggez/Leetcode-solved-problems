class Solution {
    public int maxArea(int[] height) {
            int lp=0;
    int rp=height.length-1;
    
    int max=0;
    while(lp<rp){
      int lv=height[lp];
      int rv=height[rp];
      
      int temp=Math.min(lv,rv)*(rp-lp);
      if(temp>max){
        max=temp;
      }
      
      if(lv<rv){
        lp++;
      }
      else{
        rp--;
      }
    }
    return max;
    }
}