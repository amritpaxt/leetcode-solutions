class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a frequency array for the magazine's characters.
        int[] magazineFreq = new int[26];
        
        // Fill the frequency array with magazine characters.
        for (char ch : magazine.toCharArray()) {
            magazineFreq[ch - 'a']++;
        }
        
        // Check each character in ransomNote against the magazine frequency.
        for (char ch : ransomNote.toCharArray()) {
            // Decrement the count in magazine frequency array for each character in ransomNote.
            if (magazineFreq[ch - 'a'] == 0) {
                // If count is zero, we can't construct the ransom note.
                return false;
            }
            magazineFreq[ch - 'a']--;
        }
        
        // All characters needed are available in the magazine.
        return true;
    }
}