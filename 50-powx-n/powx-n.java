class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==Integer.MIN_VALUE) return 1/ (x * myPow(x,Integer.MAX_VALUE));
        if(n<0){
            x = 1/x;
            n = Math.abs(n);
        }
        double h = myPow(x, n/2);
        h = h*h;
        if(n%2!=0){
            h=x*h;
        }
        return h;
    }

}