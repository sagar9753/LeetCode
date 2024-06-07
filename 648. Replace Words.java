Ques Link - https://leetcode.com/problems/replace-words

---------------------------------- Solution -------------------------------------------

class Solution {
    public String replaceWords(List<String> dictionary, String sentence ) {
        String[] str = sentence.split(" ");
        Set<String> dict = new HashSet<>(dictionary);

        StringBuilder ans = new StringBuilder();

        for(String s : str){
            int i;
            for(i = 1; i <= s.length(); i++){
                String substr = s.substring(0,i);
                if(dict.contains(substr)){
                    ans.append(substr).append(" ");
                    break;
                }
            }
            if(i == s.length()+1)
                ans.append(s).append(" ");
        }


        return ans.toString().substring(0,ans.length()-1);
    }
}
