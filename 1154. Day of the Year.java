Ques Link - https://leetcode.com/problems/day-of-the-year/description/

---------------------------------------------- Solution --------------------------------------------------

class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        int[] months = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year))
            months[1] = 29;
        int ans = 0;

        for(int i = 0 ; i < month-1 ; i++){
            ans += months[i];
        }
        return ans += day;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    } 
}
