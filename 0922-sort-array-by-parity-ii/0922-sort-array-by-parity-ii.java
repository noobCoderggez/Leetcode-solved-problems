class Solution {
    public int[] sortArrayByParityII(int[] nums) {
                    int even[]=new int[nums.length/2];
        int odd[]=new int[nums.length/2];

    
        int i=0;
        
        int j=0;
        int k=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                even[j]=nums[i];
                i++;
                j++;
            }
            else{
                odd[k]=nums[i];
                i++;
                k++;
            }
        }

      

        int m=0;
        int n=0;


        for(int o=0;o<nums.length;o++){
            if(o%2==0){
                nums[o]=even[m];
                m++;
            }
            else{
                nums[o]=odd[n];
                n++;
            }
        }

      return nums;
    }
}