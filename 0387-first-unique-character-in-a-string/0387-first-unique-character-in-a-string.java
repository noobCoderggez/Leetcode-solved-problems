class Solution {
    public int firstUniqChar(String s) {

        char a[]=s.toCharArray();
        int index=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    count++;
                    break;
                }
            }
            if(count==0){
            index=i;
            break;
        }else{
            index=-1;
        }
        }
        return index;
    }
}