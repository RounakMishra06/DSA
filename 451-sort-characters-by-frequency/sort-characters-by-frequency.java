class Solution {
    public String frequencySort(String s) {
        int[] fr = new int[256];
        for(char ch : s.toCharArray()){
            fr[ch]++;
        }
          StringBuilder result = new StringBuilder();
      while(true){
        int mf = 0;
        char mc = 0;
        for(int i = 0;i<256;i++){
            if(fr[i]>mf){
                mf=fr[i];
                mc=(char)i;
            }
        }
        if(mf==0) break;
         for (int i = 0; i < mf; i++) {
                result.append(mc);
            }
            fr[mc]=0;

      }
      return result.toString();
    }
}