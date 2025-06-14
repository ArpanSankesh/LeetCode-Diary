class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);
        int n = s.length();

        char digit1 = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch != '9'){
                digit1 = ch;
                break;
            }
        }
        String max = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == digit1){
                max += '9';
            }else{
                max += ch;
            }
        }
        char digit2 = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch != '0'){
                digit2 = ch;
                break;
            }
        }
        String min = "";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == digit2){
                min += '0';
            }else{
                min += ch;
            }
        }
        int maxInt = Integer.parseInt(max), minInt = Integer.parseInt(min);
        return maxInt - minInt;
    }
}