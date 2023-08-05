Ques Link - https://leetcode.com/problems/watering-plants/description/

------------------------------------ Solution --------------------------------

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap = capacity;
        int steps = 0;

        for(int i = 0 ; i < plants.length ; i++){
            if(plants[i] > cap){
                steps += i + i;
                cap = capacity;
            }
            steps++;
            cap -= plants[i];
        }
        return steps;
    }
}
