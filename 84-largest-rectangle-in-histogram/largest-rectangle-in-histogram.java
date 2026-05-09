class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        Deque<Integer> s = new ArrayDeque<>();

        int max = 0;

        for(int i = 0; i <= n; i++) {

            int currHeight = (i == n) ? 0 : heights[i];

            while(!s.isEmpty() && currHeight < heights[s.peek()]) {

                int height = heights[s.pop()];

                int rightBoundary = i;

                int leftBoundary;

                if(s.isEmpty()) {
                    leftBoundary = -1;
                } else {
                    leftBoundary = s.peek();
                }

                int width = rightBoundary - leftBoundary - 1;

                int area = height * width;

                max = Math.max(max, area);
            }

            s.push(i);
        }

        return max;
    }
}