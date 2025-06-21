class Solution {
    public int minimumDeletions(String word, int k) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int minDeletion = Integer.MAX_VALUE;
        List<Integer> freqs = new ArrayList<>(map.values());

        for(int target = 1; target <= Collections.max(freqs); target++){
            int deletion = 0;

            for(int freq : freqs){
                if(freq < target){
                    deletion += freq;
                } else if(freq > target + k){
                    deletion += (freq - (target + k));
                }
            }
            minDeletion = Math.min(minDeletion, deletion);
        }
        return minDeletion;

    }
}