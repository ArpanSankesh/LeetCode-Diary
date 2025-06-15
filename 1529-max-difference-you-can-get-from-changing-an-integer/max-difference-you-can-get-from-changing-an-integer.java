class Solution {
    
    // Replaces all occurrences of digit x with digit y in num
    public String replacexy(int num, char x, char y) {
        char[] numChars = Integer.toString(num).toCharArray();
        for (int i = 0; i < numChars.length; i++) {
            if (numChars[i] == x) {
                numChars[i] = y;
            }
        }
        return new String(numChars);
    }

    public int maxDiff(int num) {
        int maxNum = num, minNum = num;
        String numStr = Integer.toString(num);
        int n = numStr.length();

        // Finding maxNum by replacing the first non-'9' digit with '9'
        for (int i = 0; i < n; i++) {
            if (numStr.charAt(i) != '9') {
                String maxStr = replacexy(num, numStr.charAt(i), '9');
                maxNum = Integer.parseInt(maxStr);
                break;
            }
        }

        // Finding minNum by replacing a digit with '1' or '0' depending on position
        for (int i = 0; i < n; i++) {
            if (i == 0 && numStr.charAt(i) != '1') {
                String minStr = replacexy(num, numStr.charAt(i), '1');
                minNum = Integer.parseInt(minStr);
                break;
            } else if (numStr.charAt(i) != '0' && numStr.charAt(i) != numStr.charAt(0)) {
                String minStr = replacexy(num, numStr.charAt(i), '0');
                minNum = Integer.parseInt(minStr);
                break;
            }
        }

        return maxNum - minNum;
    }
}
