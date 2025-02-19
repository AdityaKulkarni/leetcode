class Solution {
    public int largestAltitude(int[] gain) {
        /**
        * Additional Space
        */
        /*int n = gain.length, max = 0;
        int[] prefix = new int[n];
        prefix[0] = gain[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + gain[i];
        }

        for(int i = 0; i < n; i++){
            if(max < prefix[i]){
                max = prefix[i];
            }
        }

        return max;
        */

        int n = gain.length, max = 0, current = 0;

        for(int i = 0; i < n; i++){
            current += gain[i];
            if(max < current){
                max = current;
            }
        }

        return max;

    }
}