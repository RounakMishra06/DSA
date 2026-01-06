class Solution {
    public String frequencySort(String s) {

        int[] freq = new int[256];

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        StringBuilder result = new StringBuilder();

        // Step 2: Brute force selection
        while (true) {
            int maxFreq = 0;
            char maxChar = 0;

            // Find character with maximum frequency
            for (int i = 0; i < 256; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char) i;
                }
            }

            // If no character left
            if (maxFreq == 0) break;

            // Append that character maxFreq times
            for (int i = 0; i < maxFreq; i++) {
                result.append(maxChar);
            }

            // Mark used
            freq[maxChar] = 0;
        }

        return result.toString();
    }
}
