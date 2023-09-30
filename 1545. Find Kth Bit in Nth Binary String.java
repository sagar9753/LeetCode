Ques Link - https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

------------------------------- Solution --------------------------------------

class Solution {
    public char findKthBit(int n, int k) {
        String prev = "0";
        for(int i = 2 ; i <= n ; i++){
            if(k-1 <= prev.length()-1)
                return prev.charAt(k-1);
            String invert = invert(prev);
            StringBuilder sb = new StringBuilder(invert);
            sb = sb.reverse();
            prev = prev +"1"+sb.toString();
        } 
        return prev.charAt(k-1);
    }
    public String invert(String s){
        char[] ar = s.toCharArray();

        for(int i = 0 ; i < ar.length ; i++){
            if(ar[i] == '0')
                ar[i] = '1';
            else
                ar[i] = '0';

        }
        return new String(ar);
    }
}
