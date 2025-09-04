class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element
        for (int i = 0; i < nums.length; i++) {
            // Loop through the rest of the elements
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum is equal to target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }
        return new int[] {}; // If no solution is found
    }
}
