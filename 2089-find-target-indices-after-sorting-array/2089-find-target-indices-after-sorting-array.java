class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
 
     int low=0;
    int equal=0;
    for(int a:nums){
      if(a<target){
        low++;
      }
      else if(a==target){
       equal++;
      }
    }
    
    List <Integer> h=new ArrayList<Integer>();
    
    for(int i=0;i<equal;i++){
      h.add(low++);
    }
      
              
     return h; 
    }
}