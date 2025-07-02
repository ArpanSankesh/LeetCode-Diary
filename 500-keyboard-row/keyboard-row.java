class Solution {
    public String[] findWords(String[] words) {
        Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');

        List<String> result = new ArrayList<>();

        for(String word : words){
            String lower = word.toLowerCase();
            Set<Character> rowSet = getRowSet(lower.charAt(0), row1, row2, row3);
            if (rowSet == null) continue;

            boolean valid = true;
            for(char ch : lower.toCharArray()){
                if(!rowSet.contains(ch)){
                    valid = false;
                    break;
                }
            }
            if(valid) result.add(word);
        }
        return result.toArray(new String[0]);
    }

    private Set<Character> getRowSet(char c, Set<Character> row1, Set<Character> row2, Set<Character> row3) {
        if (row1.contains(c))
            return row1;
        if (row2.contains(c))
            return row2;
        if (row3.contains(c))
            return row3;
        return null;
    }
}