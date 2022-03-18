class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, R = grid.length, C = grid[0].length;
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(grid[i][j] == 1)fresh++;
                else if(grid[i][j] == 2){
                    q.offer(new int[]{0, i, j});
                }
            }
        }
        int[][] surr = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int time = 0;
        if(fresh == 0)return 0;
        while(!q.isEmpty()){
            int[] front = q.remove();
            for(int i = 0; i < 4; i++){
                int a = surr[i][0]+front[1], b = surr[i][1]+front[2];
                if(a >= 0 && a < R && b >= 0 && b < C){
                    if(grid[a][b] == 1){
                        q.offer(new int[]{front[0]+1, a, b});
                        grid[a][b] = 2;
                        time = front[0]+1;
                    }                    
                }
            }
        }
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }
}
