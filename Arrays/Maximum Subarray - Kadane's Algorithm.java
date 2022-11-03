/*
Given an integer array nums, find the subarray which has the largest sum and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


!!!!!! USE KADANES ALGORITHM TO FIND MAX SUB ARRAY SUM.

*/

class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int maxtn = nums[0];
        for(int i=1;i<=nums.length -1; i++){
            maxtn = max(maxtn+nums[i],nums[i]);
            res = max(maxtn,res);
        }
        return res;
    }
    int max(int a, int b){
        if(a>b)
            return a;
        return b;
    }
}
