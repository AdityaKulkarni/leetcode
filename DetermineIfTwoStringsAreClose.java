class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        if(word1.equals(word2)){
            return true;
        }

        int[] freq1 = new int[26], freq2 = new int[26];
        char[] c1 = word1.toCharArray(), c2 = word2.toCharArray();

        for(int i = 0; i < c1.length; i++){
            freq1[c1[i] - 'a'] += 1; 
        }

        for(int i = 0; i < c2.length; i++){
            //if the character is not present in word1, return false
            if(freq1[c2[i] - 'a'] == 0){
                return false;
            }
            freq2[c2[i] - 'a'] += 1; 
        }

        for(int i = 0; i < 26; i++){
            if(freq1[i] == 0 && freq2[i] != 0){
                return false;
            }
        }


        //sorting is necessary because the order of the characters doesnt matter, only the frequencies of the chars
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }

        return true;
    }
}