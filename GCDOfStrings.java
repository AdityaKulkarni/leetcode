class Solution {
    public int gcd(int l1, int l2){
        while(l2 != 0){
            int temp = l1 % l2;
            l1 = l2;
            l2 = temp;
        }

        return l1;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
}