class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        // Iterate through each starting point of the subarray
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            // Iterate through each possible end point
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];  // Add the current number to the sum of the subarray
                if (sum == k) {
                    count++;  // If the sum equals k, we found a subarray
                }
            }
        }
        return count;
    }
}