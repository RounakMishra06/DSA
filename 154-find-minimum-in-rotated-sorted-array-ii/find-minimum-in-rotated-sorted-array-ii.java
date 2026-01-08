class Solution {
    public int findMin(int[] nums) {
      int mini = nums[0];
      for(int i = 1; i< nums.length;i++){
     if(nums[i]<mini){
        mini = nums[i];

     }
      }
      return mini;
        }
        
    }
