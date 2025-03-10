import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
        }

        return false;
    }
}