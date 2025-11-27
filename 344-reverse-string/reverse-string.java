class Solution {

    public void reverseString(char[] s) {
        suraj(s,0,s.length-1);
    }

      private void suraj(char[] s, int l, int r){
            if(l>=r) return;
                char temp = s[l];
                s[l]=s[r];
                s[r]=temp;
            
            suraj(s,l+1,r-1);
      }
    }

