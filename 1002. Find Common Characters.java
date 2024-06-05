Ques Link - https://leetcode.com/problems/find-common-characters

------------------------------------ Solution -------------------------------------------

class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonChar = new int[26];
        List<String> ans = new ArrayList<>();

        Arrays.fill(commonChar,Integer.MAX_VALUE);

        for(String word : words){
            int[] count = new int[26];
            for(char c : word.toCharArray())
                count[c-'a']++;
            for(int i = 0; i < 26 ; i++)
                commonChar[i] = Math.min(commonChar[i], count[i]);
        }

        for(int i = 0 ; i < 26 ; i++){
            while(commonChar[i] > 0){
                ans.add(Character.toString((char)(i + 'a')));
                commonChar[i]--;
            }
        }

        return ans;

    }
}
