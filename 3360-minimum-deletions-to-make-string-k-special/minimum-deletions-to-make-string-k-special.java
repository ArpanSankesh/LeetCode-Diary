
class Solution {
    public int minimumDeletions(String word, int k) {
        // Step 1: Frequency array for a–z
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Step 2: Sort frequencies
        Arrays.sort(freq);

        int result = word.length();
        int cumulativeDeleted = 0;

        // Step 3: Try each freq[i] as the minimum frequency to keep
        for (int i = 0; i < 26; i++) {
            int del = cumulativeDeleted;

            // For all j > i, check if freq[j] > freq[i] + k
            for (int j = 25; j > i; j--) {
                if (freq[j] - freq[i] <= k) break;
                del += freq[j] - freq[i] - k;
            }

            result = Math.min(result, del);
            cumulativeDeleted += freq[i];
        }

        return result;
    }
}
