class Solution {
   public int findCenter(int[][]edges){
    int pair1[]=edges[0];//v1,v2
   int  pair2[]=edges[1];//v2,v3 - v1,v3
    if(pair1[0]==pair2[0] || pair1[0]==pair2[1]){
        return pair1[0];
    }
    return pair1[1];
   }
}
// in this question we will form 2 pairs then will see which is center of graph
