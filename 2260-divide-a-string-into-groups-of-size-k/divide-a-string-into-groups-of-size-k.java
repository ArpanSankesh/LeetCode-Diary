class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            int end = Math.min(i + k, s.length());
            String group = s.substring(i, end);
            
            // Pad with fill character if needed
            if (group.length() < k) {
                int pad = k - group.length();
                for (int j = 0; j < pad; j++) {
                    group += fill;
                }
            }
            
            result.add(group);
            i += k;
        }
        
        // Convert List<String> to String[]
        return result.toArray(new String[0]);
    }
}
