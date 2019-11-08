class Solution {
    public int rob(int[] nums) {
        //两个数
        int n = nums.length;
        if(n<=1){return n==0?0:nums[0];}
        int a = nums[0];
        int b = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int temp=Math.max(a+nums[i],b);
            a=b;
            b=temp;
        }
        return b;
        //数组
        // int[] memo = new int[n];
        // memo[0]=nums[0];
        // memo[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<n;i++){
        //     memo[i]=Math.max(memo[i-2]+nums[i],memo[i-1]);
        // }
        // return memo[n-1];
    }
}