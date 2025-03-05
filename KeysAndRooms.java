class Solution {

    void dfs(List<Integer> nextKeys, int currentRoom, List<List<Integer>> rooms, int[] visited){
        visited[currentRoom] = 1;

        for(int i: nextKeys){
            if(visited[i] == 0){
                dfs(rooms.get(i), i, rooms, visited);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        visited[0] = 1; 
        // Stack<Integer> stack = new Stack();
        // stack.push(0);

        // while(!stack.isEmpty()){
        //     int current = stack.pop();
        //     visited[current] = 1;

        //     List<Integer> nextKeys = rooms.get(current);
        //     for(int key: nextKeys){
        //         if(visited[key] == 0){
        //             visited[key] = 1;
        //             stack.push(key);
        //         }
        //     }
        // }

        dfs(rooms.get(0), 0, rooms, visited);

        for(int visit: visited){
            if(visit == 0){
                return false;
            }
        }
        return true;
    }
}