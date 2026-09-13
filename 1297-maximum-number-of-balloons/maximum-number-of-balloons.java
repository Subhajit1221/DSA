class Solution {
    public int maxNumberOfBalloons(String text) {

        int frq[]= new int[256];
        int i=0;
        int size=text.length();

        while(i<size){

            if(text.charAt(i)=='b' || text.charAt(i)=='a' || text.charAt(i)=='l' || text.charAt(i)=='o' || text.charAt(i)=='n'){
                frq[text.charAt(i)]++;
            }
                 i++;
        }

        frq['l']/=2;
        frq['o']/=2;

        int min=Integer.MAX_VALUE;


        
        min = Math.min(frq['b'],
        Math.min(frq['a'],
        Math.min(frq['l'],
        Math.min(frq['o'], frq['n']))));
        

        return min;
        
    }
}