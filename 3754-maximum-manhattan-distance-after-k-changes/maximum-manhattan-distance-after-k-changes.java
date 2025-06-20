class Solution {
    public int maxDistance(String s, int k) {
        int maxMD = 0;
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'N') north++;
            else if(ch == 'S') south++;
            else if(ch == 'W') west++;
            else if(ch == 'E') east++;

            int currMD = Math.abs(east - west) + Math.abs(north - south);

            int steps = i+1;
            int wasted = steps - currMD;

            int extra = 0;
            if(wasted != 0){
                extra = Math.min(2*k, wasted);
            }

            int finalCurrMD = currMD + extra;

            maxMD = Math.max(maxMD, finalCurrMD);
        }
        return maxMD;
    }
}