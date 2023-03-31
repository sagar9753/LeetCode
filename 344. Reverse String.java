/*--------------------------------------------------------Question-----------------------------------------------------------------

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.

----------------------------------------------------------Solution----------------------------------------------------*/

class Solution {
    public void reverseString(char[] s) {
        char c;
        int n=s.length;
        for(int i=0;i<n/2;i++){
            c=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=c;
        }
    }
}
