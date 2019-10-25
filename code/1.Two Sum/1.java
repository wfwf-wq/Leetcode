class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int nums[]=new int[1000];
        int ant[]=new int[2];
        // int target;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                if(nums[i]+nums[j]==target){
                    if(i!=j){
                        ant[0]=j;
                        ant[1]=i;
                    }
                }
        return ant;
    }
}