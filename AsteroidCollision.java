class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack();

        for(int num: asteroids){
            if(num > 0){
                res.push(num);
            }else{

                //this sequence of while, if and if is important
                while(!res.isEmpty() && res.peek() > 0 && res.peek() < Math.abs(num)){
                    res.pop();
                }

                if(res.isEmpty() || res.peek() < 0){
                    res.push(num);
                }

                if(res.peek() == Math.abs(num)){
                    res.pop();
                }
            }
        }

        int[] ans = new int[res.size()];
        int i = res.size() - 1;
        while(!res.isEmpty()){
            ans[i--] = res.pop();
        }

        return ans;
    }
}