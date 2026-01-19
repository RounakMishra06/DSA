class Solution {
    public boolean isPalindrome(int x) {
        int o = x;
        int p = 0;
        while(x>0){
            int d = x%10;
            p = p*10+d;
            x=x/10;
        }
        if(p==o){
            return true;
        }
        return false;
    }
}