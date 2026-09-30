class Solution {
    public int maxProfit(int[] prices) {
        
        int curMax = 0, globalMax = 0;
        int l = 0, r = 1;
        
        //Check if Array is empty or not.
        if(prices == null || prices.length == 0){
            System.out.println("Array is empty");
            return 0;
        }

        for(int i = 0; i < prices.length-1; i++){
            
            if(prices[l] > prices[r]){
                l=r;
                r++;
            }else{
                curMax = prices[r] - prices[l];
                if(curMax > globalMax){
                    globalMax = curMax;
                }
                r++;
            }    
        }
        return globalMax;
    }
}