// 42. Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


class Solution {
    public int trap(int[] height) {
        int result = 0;
        // to calculate left boundary and right boundray

        int lb[] = new int[height.length];
        int rb[] = new int[height.length];

        lb[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            lb[i] = Math.max(height[i], lb[i - 1]);
        }

        rb[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rb[i] = Math.max(height[i], rb[i + 1]);
        }

        for (int i = 1; i < height.length; i++) {
            result += Math.min(lb[i], rb[i]) - height[i];
        }

        return result;
        
    }
    public static void main(String []args){
        int[] height =  {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution sl = new Solution();
        System.out.println(sl.trap(height));


    }
}