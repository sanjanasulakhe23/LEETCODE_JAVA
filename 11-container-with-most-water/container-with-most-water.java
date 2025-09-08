class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0, right=height.length-1;
        while(left<right){
            int width=right-left;
            int min=Math.min(height[left],height[right]);
            int area=width*min;

            maxarea=Math.max(area,maxarea);


            if (height[left]<height[right]){
                 left++;
            }else{
                  right--;

        }

        }
        return maxarea;
}}
