/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true

!!! USING GREEDY TECHNIQUE IS NOT FEASIBLE AS COMPLEXITY BECOMES N^2. EITHER SORT USING METHOD WITH LESS THAN N^2 AND SCAN OR USE HASH MAPS.
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                return true;
            else
                hm.put(nums[i],1);
        }
        return false;
}
}
