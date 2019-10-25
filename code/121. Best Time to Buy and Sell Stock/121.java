class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int min=prices[0],max=0;
        for(int num:prices){
            min=Math.min(num,min);
            max=Math.max(num,max);
            res=Math.max(res,max-min);
        }
        return res;
    }
}