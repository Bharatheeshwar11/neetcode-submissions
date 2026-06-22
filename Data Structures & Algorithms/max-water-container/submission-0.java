class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int result=0;
        while(i<j)
        {
            int max=(Math.min(heights[i],heights[j])) * (j-i);
            result=Math.max(max,result);
            if(heights[i]<heights[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return result;
    }
}
