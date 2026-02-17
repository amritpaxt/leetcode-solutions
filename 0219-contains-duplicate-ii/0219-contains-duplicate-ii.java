class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Loop through each element in the array as the first element of the pair
        for (int i = 0; i < nums.length; i++) {
            // Loop through each element after the i-th element
            for (int j = i + 1; j <= i + k && j < nums.length; j++) {
                // If the same element is found within k distance, return true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        // If no such pair is found, return false
        return false;
    }
}