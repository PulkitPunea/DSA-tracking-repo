class Solution {
    public int maxProduct(int[] nums) {
        int prefixProd = 1,
            suffixProd = 1,
            globalMaxProd = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            prefixProd *= nums[i];
            
            if(prefixProd >= globalMaxProd){
                globalMaxProd = prefixProd; 
            }
            if(prefixProd == 0){
                prefixProd = 1;
            }
        }

        for(int i = nums.length-1; i >= 0; i--){
            suffixProd *= nums[i];

            if(suffixProd >= globalMaxProd){
                globalMaxProd = suffixProd;
            }
            if(suffixProd == 0){
                suffixProd = 1;
            }
        }
        return globalMaxProd;
    }
}