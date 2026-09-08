class Solution {
    public int[][] merge(int[][] intervals) {

        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int i = 0;

        while (i < intervals.length) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            // Merge all overlapping intervals
            while (i + 1 < intervals.length &&
                   end >= intervals[i + 1][0]) {

                i++;

                end = Math.max(end, intervals[i][1]);
            }

            list.add(new int[]{start, end});

            i++;
        }

        return list.toArray(new int[list.size()][]);
    }
}