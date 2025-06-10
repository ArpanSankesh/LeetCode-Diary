class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);
            if(map.containsKey(ch)){
                start = Math.max(map.get(ch) + 1, start);
            }
            map.put(ch, end);
            maxLen = Math.max(maxLen, end - start +1);
        }
        return maxLen;
    }

}