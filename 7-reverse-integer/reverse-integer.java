class Solution {
    public int reverse(int x) {
       int sign;
        if (x < 0) {
            sign = -1;
        } else {
            sign = 1;
        }

        
         x=Math.abs(x);
        

        long rev = 0;
        while(x>0){
            int d = x%10;
            rev=rev*10 + d;
            x=x/10;
        }
        rev=  rev*sign;
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE){
            return 0;
        }
         return (int)rev;
       

    }
}
