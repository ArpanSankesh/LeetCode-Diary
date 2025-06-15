class Solution {
    
    // Helper method to replace all instances of digit x with digit y in the number
    public String replacexy(int num, int x, int y) {
        String numStr = Integer.toString(num);
        char[] chars = numStr.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] - '0' == x) {
                chars[i] = (char)(y + '0');
            }
        }

        return new String(chars);
    }

    public int maxDiff(int num) {
        int maxNum = num;
        int minNum = num;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                String s = replacexy(num, x, y);

                // Skip if number has leading zero
                if (s.charAt(0) != '0') {
                    int currNum = Integer.parseInt(s);
                    maxNum = Math.max(maxNum, currNum);
                    minNum = Math.min(minNum, currNum);
                }
            }
        }

        return maxNum - minNum;
    }
}
