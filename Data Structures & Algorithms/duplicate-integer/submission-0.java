class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count=0;       //{1,2,3,3}
        for(int i=0 ;i<=nums.length-1;i++){  //length=4 so 0 to 3
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
 
            }
        }
        if(count<=0){
            return false;
        }else{
            return true;
        }
    }
}