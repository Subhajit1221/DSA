class Solution {
    public int longestPalindrome(String s) {

        int feq[]= new int [256];

        int size=s.length();

        for(int i=0;i<size;i++){

            feq[s.charAt(i)]++;

        }

        int count=0;
        int flag=0;

        for(int i=0;i<256;i++){

            count+=feq[i]-feq[i]%2;
            
            if(feq[i]%2!=0){

                 flag++;
                
            }
            
        }

        if(flag>0){
           count++;
        }

        return count;
        
    }
}