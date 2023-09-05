Ques Link - https://leetcode.com/problems/distribute-money-to-maximum-children/description/

--------------------------------------- Solution --------------------------------------------

class Solution {
    public int distMoney(int money, int children) {
        if(money < children)
            return -1;
        int ans = 0;
        int child = children;
        while(money >= 8 && children > 0){
            if((money-8) != 4 || ((money-8) == 4 && children > 2)){
                ans++;
                money -= 8;
                children--;
            }
            else
                break;
            
            if(money < children){
                ans--;
                break;
            }
        }
        if(children == 0 && money != 0)
            ans--;
        if(ans > child)
            ans = child;
        return ans;
    }
}
