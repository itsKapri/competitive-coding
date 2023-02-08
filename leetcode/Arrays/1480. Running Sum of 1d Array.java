//https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        // int arr[]=new int [nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            nums[i]=sum;
            //arr[i]=sum;
        }
        return nums;
        //return arr;
    }
}