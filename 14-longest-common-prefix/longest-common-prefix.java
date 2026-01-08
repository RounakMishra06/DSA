class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null){
            return "";
        }
        String f  = strs[0];
        for(int i = 0; i<f.length(); i++){
            char c = f.charAt(i);
            for(int j = 0; j<strs.length; j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=c){
                    return  f.substring(0,i);
                }
            }
        }
         return f;
    }
}