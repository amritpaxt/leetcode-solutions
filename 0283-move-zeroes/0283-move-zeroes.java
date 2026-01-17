class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int j = 0;

        // First pass: accumulate non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }

        // Second pass: fill remaining positions with zeroes
        for (; j < n; j++) {
            result[j] = 0;
        }

        // Copy back to original array
        System.arraycopy(result, 0, nums, 0, n);
    }
}