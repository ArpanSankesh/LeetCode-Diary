class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false; //It contains a minimum of 3 characters.

        boolean hasVowel = false;
        boolean hasConsonent = false;

        for (char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){ //It contains only digits (0-9), and English letters (uppercase and lowercase).
                return false;
            }
            if(isVowel(ch)){ //It includes at least one vowel.
                hasVowel = true;
            }else if(Character.isLetter(ch)){ // It includes at least one consonant.
                hasConsonent = true;
            }
        }
        return hasVowel && hasConsonent;
    }
    private Boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u';
    }
}