class Solution {
    public int[][] merge(int[][] intervals) {

        ArrayList<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));

        int i = 0;

        while (i < intervals.length ) {

            

                int start = intervals[i][0];
                int end= intervals[i][1];

                while (i < intervals.length - 1 &&
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