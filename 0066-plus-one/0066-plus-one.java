class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            // If the digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, it becomes 0
            digits[i] = 0;
        }
        
        // If all digits were 9, we need a new array with one extra digit
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // e.g., 999 + 1 = 1000
        return newNumber;
    }
}
