class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int md = 0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                d++;
            
            md = Math.max(d,md);

            }
            else if(ch==')'){
                d--;
            }
        }
        return md;
    }
}