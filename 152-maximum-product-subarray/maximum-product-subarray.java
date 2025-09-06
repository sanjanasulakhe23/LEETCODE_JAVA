class Solution {
    public int maxProduct(int[] nums) {
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            int currsum=1;
            for(int j=i;j<nums.length;j++){
                currsum*=nums[j];
        
                maxsum=Math.max(currsum,maxsum);

            }
        }


    return maxsum;
    }
}