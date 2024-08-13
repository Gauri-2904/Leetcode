class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // create an adj list 
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge :edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        //use bfs to check if their exists a path from s to d
        Queue<Integer>q=new LinkedList<>();
               boolean []vis=new boolean[n];
              q.offer(source);
        vis[source]=true;

       while(!q.isEmpty()){
        int curr=q.poll();
        if(curr==destination){
            return true;// found path
        }
        for(int neighbour:adj.get(curr)){
        if(!vis[neighbour]){
            q.offer(neighbour);
            vis[neighbour]=true;
        }
        }
       }
       return false;//path not found
    }
}
