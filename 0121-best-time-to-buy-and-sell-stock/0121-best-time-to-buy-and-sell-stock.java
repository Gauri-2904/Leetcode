class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int min=0,profit=0;// min is buy stock
        min=prices[0];   // 7 is min ie 0th index of prices []
        for(int i=1;i<prices.length;i++)      // first index i=1  will start our  iteration beacuse i=0 is min
        {
            // profit=sp-cp
           if(prices[i]<min){
           min= prices[i];// 1<min ie 7   so now  min=1
         } else{
           
           if(prices[i]-min>profit)
           {
           // min is our cp
             profit=prices[i]-min;// prices[i] is our sp
           }
         }
        }
        
       return profit;
    }
}
    


        