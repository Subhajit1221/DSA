class Solution {
     boolean checker(int a[], int b[]) {

        for (int i = 0; i < 256; i++) {

            
                if (a[i] != b[i]) {
                    return false;
                }
            
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

         

        int high = 0;
        int low = 0;

        ArrayList<Integer> arr = new ArrayList<>();


        int s2f[] = new int[256];
        int s1f[] = new int[256];

        for (int i = 0; i < p.length(); i++) {
            s1f[p.charAt(i)]++;
        }

        while (high < s.length()) {

            s2f[s.charAt(high)]++;

            while (high - low + 1 > p.length()) {

               

                s2f[s.charAt(low)]--;
                low++;

                

            }

             if (checker(s2f,s1f)) {
                    arr.add(low);
                }

            high++;
        }

        return arr;
        
    }
}