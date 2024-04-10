Ques Link - https://leetcode.com/problems/reveal-cards-in-increasing-order

--------------------------------------- Solution -----------------------------------

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0 ; i < deck.length ; i++)
            dq.add(i);

        for(int i = 0 ; i < deck.length ; i++){
            ans[dq.pollFirst()] = deck[i];
            if(dq.size() > 0)
                dq.add(dq.pollFirst());
        }
        return ans;
    }
}
