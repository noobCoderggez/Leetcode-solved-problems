class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

    HashSet <Integer> h=new HashSet<Integer>();
    for(int a:nums){
      h.add(a);
    }
   
    
    List<Integer> l=new ArrayList<Integer>();
   
    for(int i=1;i<=nums.length;i++){
      if(!h.contains(i)){
        l.add(i);
      }
    }
    
    return l;
    }
}