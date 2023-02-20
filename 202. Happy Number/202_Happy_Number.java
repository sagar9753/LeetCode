class Solution {
    public boolean isHappy(int n) {
        int sum;
        Set<Integer> s=new HashSet<>();

        while(n!=1){
            s.add(n);
            sum=squreSum(n);
            if(s.contains(sum))
                return false;
            n=sum;
        }
        return true;
    }
    private int squreSum(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
