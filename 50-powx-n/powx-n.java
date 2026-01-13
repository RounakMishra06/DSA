class Solution {
    public double myPow(double x, int n) {
        // if (n == 0 || x == 1.0) return 1;

        // long temp = n;

        // if(n<0){
        //     x = 1/x;
        //     temp = -1L * n;
        // }
        // double ans = 1;
        // for(int i = 0; i< temp; i++){
        //   ans *= x;
        // }
        // return ans;

        long N = n;
        if(N<0){
            x = 1/x;
            N=-N;
        }
        double ans  = 1;
        while(N>0){
            if(N%2==1){
            ans *= x;
            }
            x*=x;
            N= N/2;
        }
        return ans;

    }
}