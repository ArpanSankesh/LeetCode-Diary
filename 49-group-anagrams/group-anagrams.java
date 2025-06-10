class Solution {
    private String generateKey(String str){
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            sb.append('#');
            sb.append(count[i]);
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagram = new HashMap<>();

        for (int i = 0; i < strs.length; i++ ) {
            String key = generateKey(strs[i]);

            if (!anagram.containsKey(key)) {
                anagram.put(key, new ArrayList<>());
            }
            anagram.get(key).add(strs[i]);
        }
        return new ArrayList(anagram.values());
    }
}