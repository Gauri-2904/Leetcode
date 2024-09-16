class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[]minutes=new int[n];
        //convert to min
        for(int i=0;i<n;i++){
            String time=timePoints.get(i);
            String[]parts=time.split(":");
            int hours=Integer.parseInt(parts[0]);
            int mins=Integer.parseInt(parts[1]);
            minutes[i]=hours*60+mins;
        }
        // sort mins arr
        Arrays.sort(minutes);
        //Initialize result with max possible value
        int result=Integer.MAX_VALUE;
        //find minDiff bw adjacet times
        for(int i=1;i<n;i++){
                        result = Math.min(result, minutes[i] - minutes[i-1]);
        }
        //check bw first and last times
        result=Math.min(result,(24*60-minutes[n-1]+minutes[0]));
     
    return result;
    }
}
  