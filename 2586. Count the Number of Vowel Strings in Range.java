-------------------------------------------------------- String (Easy) ----------------------------------------------------
  
Question link :- https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description/

------------------------------------------------------- Solution 1 --------------------------------------------------
  
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        while(left <= right){
            if(check(words[left].charAt(0)) && check(words[left].charAt(words[left].length()-1)))
                count++;
            left++;
        }
        return count;
    }
    public boolean check(char s){
        if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
            return true;
        return false;
    }
}

------------------------------------------------------- Solution 2 --------------------------------------------------

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        int [] vowel =new int[128];
        vowel['a']=1;
        vowel['e']=1;
        vowel['i']=1;
        vowel['o']=1;
        vowel['u']=1;

        while(left <= right){
            String s= words[left];
            if(vowel[s.charAt(0)] ==1 && vowel[s.charAt(s.length()-1)]==1)
                count++;
            left++;
        }
        return count;
    }
    
}
