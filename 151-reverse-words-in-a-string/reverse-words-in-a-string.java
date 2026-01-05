class Solution {
    public String reverseWords(String s) {

        StringBuilder r = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

         
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

   
            int j = i;

            
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

        
            if (r.length() > 0) {
                r.append(" ");
            }

            r.append(s.substring(i + 1, j + 1));
        }

        return r.toString();
    }
}
