class Solution {
    public int totalFruit(int[] fruits) {


        if(fruits.length<=2){
            return fruits.length;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int low = 0;
        int high = 0;

        int max = Integer.MIN_VALUE;

        while (high < fruits.length) {

            if (map.containsKey(fruits[high])) {
                map.put(fruits[high], map.get(fruits[high]) + 1);
            } else {
                map.put(fruits[high], 1);
            }

            high++;

            

            while (map.size() > 2) {

                
                    map.put(fruits[low], map.get(fruits[low]) - 1);
                   
                
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }

                low++;
                
            }
            max = Math.max(max, high - low);
        }

        return max;
    }
}