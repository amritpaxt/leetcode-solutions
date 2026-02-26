class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1);  // base case to handle entire array sum
        int maxLength = 0;
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Update running sum: treat 0 as -1, 1 as 1
            runningSum += nums[i] == 0 ? -1 : 1;
            
            // Check if the running sum has been seen before
            if (sumIndexMap.containsKey(runningSum)) {
                int prevIndex = sumIndexMap.get(runningSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                // Store the first occurrence of this running sum
                sumIndexMap.put(runningSum, i);
            }
        }
        
        return maxLength;
    }
}