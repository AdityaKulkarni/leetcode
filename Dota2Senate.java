class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList(), dir = new LinkedList();

        char[] ch = senate.toCharArray();
        int n = ch.length;

        //separate radiant and dire senators in respective queues
        for(int i = 0; i < n; i++){
            if(ch[i] == 'D'){
                dir.add(i);
            }else{
                rad.add(i);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty()){//until someone loses

            //the one who was first stays in the queue for their next turn ar the end
            if(rad.peek() < dir.peek()){
                rad.add(n++);
            }else{
                dir.add(n++);
            }

            //remove them as they completed the current turn
            rad.poll();
            dir.poll();
        }

        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}