    class Solution {
        public String removeOuterParentheses(String s) {
        
            StringBuilder result = new StringBuilder();
            int l = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
            
                if(ch == '('){
                    if(l>0){
                
                    result.append(ch);
                    }
                    l++;
                    
                }else{
                        l--;  
                if (l > 0) {
                        result.append(ch);
                    }
                }
            }

            return result.toString();
                }
            }

//         int cnt = 0;
//         StringBuilder ans = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ')') {
//                 cnt--;
//             }

//             if (cnt != 0) {
//                 ans.append(s.charAt(i));
//             }

//             if (s.charAt(i) == '(') {
//                 cnt++;
//             }
//         }

//         return ans.toString();
//     }
// }
