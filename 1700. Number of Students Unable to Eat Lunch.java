Ques Link - https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

---------------------------------------------- Solution ------------------------------------------

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++)
            q.add(students[i]);
        int i = 0;
        int count = 0;
        while(!q.isEmpty() && count <q.size()){
            if(q.peek() == sandwiches[i]){
                q.remove();
                i++;
                count = 0;
            }
            else{
                q.add(q.peek());
                q.remove();
                count++;
            }
        }
        return q.size();
    }
}
