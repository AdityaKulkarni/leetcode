class Solution {
    
    public String decodeString(String s) {
        // Stack<Integer> countStack = new Stack();
        // Stack<StringBuilder> interStack  = new Stack();
        // StringBuilder str = new StringBuilder();
        // int n = 0;

        // char[] ch = s.toCharArray();

        // for(char c : ch){
        //     if(isDigit(c)){
        //         n = n * 10 + (c - '0');
        //     }else if(c == '['){
        //         countStack.push(n);
        //         n = 0;
        //         interStack.push(str);
        //         str = new StringBuilder();
        //     }else if(c == ']'){
        //         int k = countStack.pop();
        //         StringBuilder temp = str;
        //         str = interStack.pop();
        //         while(k > 0){
        //             str.append(temp);
        //             k--;
        //         }
        //     }else{
        //         str.append(c);
        //     }
        // }
        // return str.toString();

        Stack<Character> stack = new Stack();
        char[] ch = s.toCharArray();

        for(char c: ch){

            if(c != ']'){
                stack.push(c);
            }else{

                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && Character.isLetter(stack.peek())){
                    sb.insert(0, stack.pop());
                }

                String sub = sb.toString();
                stack.pop();

                sb = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    sb.insert(0, stack.pop());
                }

                int n = Integer.valueOf(sb.toString());

                while(n > 0){
                    for(char c1: sub.toCharArray()){
                        stack.push(c1);
                    }
                    n--;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }
}