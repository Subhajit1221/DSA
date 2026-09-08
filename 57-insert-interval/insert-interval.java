class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> list = new ArrayList<>();

        int[][] arr = new int[intervals.length + 1][];

    for (int i = 0; i < intervals.length; i++) {
          arr[i] = intervals[i];
    }

    arr[intervals.length] = newInterval;


Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));


 int i = 0;

        while (i < arr.length) {

            int start = arr[i][0];
            int end = arr[i][1];

            
            while (i< arr.length-1 &&
                   end >= arr[i + 1][0]) {

                i++;

                end = Math.max(end, arr[i][1]);
            }

            list.add(new int[]{start, end});

            i++;
        }

        return list.toArray(new int[list.size()][]);
        
    }
}