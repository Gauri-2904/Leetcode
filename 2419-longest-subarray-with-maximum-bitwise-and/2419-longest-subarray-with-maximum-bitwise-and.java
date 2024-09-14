class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int result=0;
        int streak=0;
        for(int num:nums){
            if(num>max){
                max=num;
                result=0;
                streak=0;
            }
            if(max==num){
                streak++;
            }else{
                streak=0;
            }
            result=Math.max(result,streak);
        }
        return result;
    }
}
// and of two no is always less than equal to that numbers
//5&7<=