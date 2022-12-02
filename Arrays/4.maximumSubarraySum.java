//lc-53: https://leetcode.com/problems/maximum-subarray/
/*
Optimal Approach:
    To get the maximum sub array sum of the array we can go for kadane's algorithm and get the maximum sum subarray.
    
    Sum and maximum sum two varaibles needed.
    sum stores the sum till curr index we are iterating.
    if sum is greater than maximum we can update maximum with sum and if less then 0 then we will update sum as 0
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; 
        int maxi = nums[0];
        int fi = 0;
        int li = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxi){
                li = i;
                maxi = sum;
            } 
            if(sum < 0){
                fi = i + 1;
                sum = 0;
            } 
        }
        return maxi;
    }
}
