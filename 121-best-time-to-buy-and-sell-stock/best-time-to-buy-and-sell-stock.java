class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     int min = Integer.MAX_VALUE;
     int m = 0;
     for(int i = 0; i<n;i++){
             if(prices[i]<min){
                min = prices[i];
             }
             else{
       
            int p = prices[i]-min;
            if(p>m){
            m=p;
        }
        }
     }   
     return m; 
    }
}