class Solution {
    public String[] divideString(String s, int k, char fill) {
         List<String> result = new ArrayList<>();
        int n = s.length();
        
        for (int i = 0; i < n; i+=k){
            int end = Math.min(i+k, n);
            String group = s.substring(i, end);

            if(group.length() < k){
                int pad = k - group.length();
                for(int j = 0; j < pad; j++){
                    group += fill;
                }
            }
            result.add(group);
        }
        return result.toArray(new String[0]);
    }
}