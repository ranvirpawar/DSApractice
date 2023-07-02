11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        int area;
        
        while(left < right){
            area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;  
            }
        }
        return maxArea;
    }
}