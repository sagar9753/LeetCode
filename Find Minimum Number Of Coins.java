Ques link - https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_975277?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

------------------------------------------------------------------- Solution ----------------------------------------------------------------------

import java.util.List;
import java.util.ArrayList;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        int coins[] = {1,2,5,10,20,50,100,500,1000};
        int i = coins.length-1;

        while(n > 0){
            if(coins[i] <= n){
                ans.add(coins[i]);
                n -= coins[i];
            }
            else
                i--;
        }
        return ans;
    }
}
