class Solution {
    public int[] rearrangeArray(int[] a) {
        int even=0;
        int odd=1;
        int ans[]=new int[a.length];
        int p=0;
        while(p<a.length){
            if (a[p]>0){
                ans[even]=a[p];
                even+=2;
            }
            else{
                ans[odd]=a[p];
                odd+=2;
            }
            p++;
        } 
        return ans;
    }
}


