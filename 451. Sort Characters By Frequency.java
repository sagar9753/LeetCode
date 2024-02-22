Ques Link - https://leetcode.com/problems/sort-characters-by-frequency/

----------------------------------------- Solution ---------------------------------------------------

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray())
            mp.put(c,mp.getOrDefault(c,0)+1);

        List<Character> ls = new ArrayList<>(mp.keySet());
        ls.sort((a,b) -> mp.get(b) - mp.get(a));

        for(char c : ls){
            for(int i = 0 ;i < mp.get(c) ; i++)
                ans.append(c);
        }
        return ans.toString();
    }
}
