class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            int temp=n;
            int sum=0;
            while(temp>0){
                int  y=temp%10;
                sum+=y*y;
                temp=temp/10;
            }
            n=sum;
        }            
        if(n==1 || n==7){
            return true;
        }
        return false;
    }
}