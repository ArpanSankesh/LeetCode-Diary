class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            map.put(ch2, map.getOrDefault(ch2, 0) -1 );
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
        if(map.get(ch) < 0 ){
            return false;
        }
        }
        return true;
    }
}