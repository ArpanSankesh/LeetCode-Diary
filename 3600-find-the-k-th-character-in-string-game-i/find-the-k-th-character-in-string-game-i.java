class Solution {
    public char kthCharacter(int k) {
        String word = "a";

        while(word.length() < k){
            StringBuilder next = new StringBuilder();
            for(char ch : word.toCharArray()){
            char nextChar = (char) ((ch - 'a' + 1 ) % 26 + 'a');
            next.append(nextChar);
            }
            word += next.toString();
        }
        return word.charAt(k-1);
    }
}