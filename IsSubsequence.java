class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty() && !t.isEmpty()){
            return true;
        }

        if(!s.isEmpty() && t.isEmpty()){
            return false;
        }

        int first = 0, second = 0, n1 = s.length(), n2 = t.length();
        char[] sc = s.toCharArray(), tc = t.toCharArray();

        while(first < n1 && second < n2){

            if(sc[first] == tc[second]){
                first++;
                second++;
            }else{
                second++;
            }
        }

        return first == n1;
    }
}