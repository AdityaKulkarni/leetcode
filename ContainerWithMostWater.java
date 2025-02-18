class Solution {
    public int maxArea(int[] height) {
        int first = 0, last = height.length - 1, max = -1;

        while(first < last){
            int h = Math.min(height[first], height[last]);
            max = Math.max(max, h * (last - first));

            while(first < last && height[first] <= h){
                first++;
            }

            while(first < last && height[last] <= h){
                last--;
            }
        }

        return max;
    }
}