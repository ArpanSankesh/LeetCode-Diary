class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder(s.length());
        int n = s.length();

        for(int i = 0; i < n ; i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                result.append((char)(ch + 32));
            }else {
                result.append(ch);
            }
        }
        return result.toString();
        
    }
}