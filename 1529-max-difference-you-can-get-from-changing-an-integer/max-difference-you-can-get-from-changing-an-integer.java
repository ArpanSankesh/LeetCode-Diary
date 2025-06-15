class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);

        // Make max by replacing the first non-9 digit with 9
        char toReplaceMax = 0;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String max = s.replace(toReplaceMax, '9');

        // Make min by replacing the first non-1 digit in the first position, otherwise first non-0
        char toReplaceMin = 0;
        if (s.charAt(0) != '1') {
            toReplaceMin = s.charAt(0);
            s = s.replace(toReplaceMin, '1');
        } else {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1') {
                    toReplaceMin = s.charAt(i);
                    break;
                }
            }
            if (toReplaceMin != 0)
                s = s.replace(toReplaceMin, '0');
        }

        int maxVal = Integer.parseInt(max);
        int minVal = Integer.parseInt(s);

        return maxVal - minVal;
    }
}
