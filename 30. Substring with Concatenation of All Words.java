Ques Link - https://leetcode.com/problems/substring-with-concatenation-of-all-words/

------------------------------------------ Solution --------------------------------------------

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int k = words[0].length();
        int n = words.length;
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();

        for (String word : words)
            count.put(word,count.getOrDefault(word,0)+1);
        
        for(int i = 0 ; i <= s.length()-k*n ; i++){
            int j = i;
            Map<String, Integer> seen = new HashMap<>();

            for(;j <= s.length()-k && j-i < n*k; j+=k){
                String word = s.substring(j,j+k);
                
                seen.put(word,seen.getOrDefault(word,0)+1);
                if(seen.get(word) > count.getOrDefault(word,0))
                    break;
            }
            if(j - i == k * n)
                ans.add(i);
        }
        return ans;
    }
}
