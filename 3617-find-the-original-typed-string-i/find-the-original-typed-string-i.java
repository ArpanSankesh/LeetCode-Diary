class Solution {
    public int possibleStringCount(String word) {
         List<Integer> groups = new ArrayList<>();
        int i = 0;

        // Step 1: Group consecutive characters
        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            groups.add(j - i);
            i = j;
        }

        // Step 2: For each group, consider it being the long-pressed group
        int total = 0;
        for (int len : groups) {
            total += (len - 1);  // If group has size >= 2, we can shorten it
        }

        // Step 3: Add 1 for the case when no long-press happened
        return total + 1;
    }
}