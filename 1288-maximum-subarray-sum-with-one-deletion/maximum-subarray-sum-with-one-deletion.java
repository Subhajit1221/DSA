class Solution {
    public int maximumSum(int[] arr) {

        int nodelete = arr[0];
        int onedelete = -1_000_000_000;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            onedelete = Math.max(nodelete,
                                onedelete + arr[i]);

            nodelete = Math.max(arr[i],
                                nodelete + arr[i]);

            max = Math.max(max,
                           Math.max(nodelete, onedelete));
        }

        return max;
    }
}