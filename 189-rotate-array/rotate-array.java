class Solution {
    public void rotate(int[] nums, int k) {
      
        int n = nums.length;
          int[] sagar = new int[n];
          k=k%n;
        for(int i = 0; i<n; i++){
            sagar[(i+k)%n]=nums[i];
        }
       for(int i=0; i<n; i++){
        nums[i]=sagar[i];
       }
        
          
    }
}
