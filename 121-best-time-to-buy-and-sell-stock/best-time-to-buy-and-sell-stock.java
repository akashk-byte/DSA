class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int sellprice=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
                int profit=(prices[i]-buyprice);
                sellprice=Math.max(sellprice,profit);
            }
        }
        return sellprice;
    }
}