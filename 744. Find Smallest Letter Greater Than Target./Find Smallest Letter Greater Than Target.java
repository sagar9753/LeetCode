// By Binary search

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r=letters.length-1;
        int mid;
        char ans=letters[l];
        while(l<=r){
            mid=(l+r)/2;

            if(letters[mid]>target)
            {
                ans=letters[mid];
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}

// By Linear search

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
