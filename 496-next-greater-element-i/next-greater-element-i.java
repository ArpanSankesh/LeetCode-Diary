class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer, Integer> ngeMap = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length-1; i>=0; i--){
            int elem = nums2[i];

            while(!st.isEmpty() && st.peek() <= elem){
                st.pop();
            }

            int nge = st.isEmpty() ? -1 : st.peek(); 

            ngeMap.put(elem , nge);

            st.push(elem);
        }
            int[] result = new int[nums1.length];
            for(int i = 0; i < nums1.length; i++){
                result[i] = ngeMap.get(nums1[i]);
            }
            return result;
    }
}