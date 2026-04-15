class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int count=0;
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int u:adj.get(i)){
                indegree[u]++;
            } 
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int u:adj.get(node)){
                indegree[u]--;
                if(indegree[u]==0){
                    q.add(u);
                }
            }
        }

        if(count!=numCourses) return false;

        return true;
    }
}
