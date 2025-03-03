class Solution {

    int hashRow(int[] row){
        int hash = 0;
        for(int n: row){
            hash = n + hash * 7;
        }

        return hash;
    }

    int hashCol(int[][] grid, int c){
        int hash = 0;
        for(int[] col: grid){
            hash = col[c] + hash * 7;
        }

        return hash;
    }
    public int equalPairs(int[][] grid) {
        // Map<String, Integer> map = new HashMap();

        // for(int[] row: grid){
        //     String s = Arrays.toString(row);
        //     map.put(s, map.getOrDefault(s, 0) + 1);
        // }

        // int res = 0;

        // for(int row = 0; row < grid.length; row++){
        //     int[] colArray = new int[grid.length];
        //     for(int col = 0; col < grid.length; col++){
        //         colArray[col] = grid[col][row];
        //     }
        //     res += map.getOrDefault(Arrays.toString(colArray), 0);
        // }

        // return res;


        //this approach needs the hash function to be carefully written. only specific numbers work for the hash function multiplication
        Map<Integer, Integer> map = new HashMap();
        int res = 0;

        for(int[] row: grid){
            int hash = hashRow(row);
            map.put(hash, map.getOrDefault(hash, 0) + 1);
        }

        for(int i = 0; i < grid.length; i++){
            res += map.getOrDefault(hashCol(grid, i), 0);
        }

        return res;
    }
}