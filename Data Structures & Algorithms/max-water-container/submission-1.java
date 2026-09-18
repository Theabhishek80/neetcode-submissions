class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right){
            int width = right -left ;
            int currenthight = Math.min(heights[left],heights[right]);
           int multi = width*currenthight;
          maxWater =  Math.max(maxWater,multi);

           if(heights[left] <heights[right]){
               left++;
           }else {
            right--;
           }
        }
        return maxWater;
        
    }
}
