class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        /**
        * Extra space
        */
        /*int[]left = new int[n], right = new int[n];
        
        left[0] = nums[0];
        right[n - 1] = nums[n - 1];
        
        for(int i = 1; i < n; i++){
            left[i] = left[i - 1] + nums[i];
        }

        for(int i = n - 2; i >=0; i--){
            right[i] = right[i+1] + nums[i];
        }

        for(int i = 0; i < n; i++){
            if(left[i] == right[i]){
                return i;
            }
        }

        return -1;*/

        int rightSum = 0, leftSum = 0;

        for(int num : nums){
            rightSum += num;
        }

        for(int i = 0; i < n; i++){
            rightSum -= nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }
}