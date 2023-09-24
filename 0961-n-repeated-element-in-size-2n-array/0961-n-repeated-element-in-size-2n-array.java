class Solution {
    public int repeatedNTimes(int[] array) {
   

    Set <Integer> h=new HashSet<Integer>();

    for(int a:array){
        if(h.contains(a)){
           return a;
        }
        else{
            h.add(a);
        }
    }
    return -1;
    }
}