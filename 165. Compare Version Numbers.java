Ques Link - https://leetcode.com/problems/compare-version-numbers

------------------------------------------------ Solution ----------------------------------------------------

class Solution {
    public int compareVersion(String version1, String version2) {
        int n1 = version1.length(), n2 = version2.length();
        int i, j, k, l;
        i = j = k = l = 0;

        while(i < n1 || k < n2){
            while(i < n1 && version1.charAt(i) != '.')
                i++;
            Integer num1 = i != j ? Integer.parseInt(version1.substring(j,i)) : 0;

            while(k < n2 && version2.charAt(k) != '.')
                k++;
            Integer num2 = k != l ? Integer.parseInt(version2.substring(l,k)) : 0;

            int compare = num1.compareTo(num2);
            if (compare != 0)
                return compare;
            i++;k++;
            j = i;l = k;
        }
        return 0;
    }
}
