class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int s = 0;
    int m= 0;
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(nums[i]==0){
            s=0;
        }else{
        s=s+1;
        m=Math.max(m,s);}
    }
        return m;
    }
}