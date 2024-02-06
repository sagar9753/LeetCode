Ques Link - https://leetcode.com/problems/group-anagrams

------------------------------------------ Solution ---------------------------------------------

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();

        int i = 0;
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String check = new String(chars);
            if(mp.containsKey(check)){
                ans.get(mp.get(check)).add(str);
            }
            else{
                mp.put(check,i);
                ans.add(new ArrayList<>());
                ans.get(i).add(str);
                i++;
            }
        }
        return ans;
    }
}
