import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        if(s.equals(t)){
            return true;
        }

        int n1 = s.length();
        int[] chars = new int[26];

        char[] sc = s.toCharArray(), tc = t.toCharArray();


        for(int i = 0; i < n1; i++){
            chars[sc[i] - 'a'] = chars[sc[i] - 'a'] + 1;
            chars[tc[i] - 'a'] = chars[tc[i] - 'a'] - 1;
        }

        for(int i = 0; i < 26; i++){
            if(chars[i] != 0){
                return false;
            }
        }

        return true;
    }
}