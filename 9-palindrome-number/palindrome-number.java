class Solution {

     public static long reversenum(int x){
        long rev = 0;

        while(x != 0){
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }

        return rev;
    }
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        long riv=reversenum(x);

        System.out.print(riv);

        if(riv==x){
            return true;

        }else{
            return false;
        }


        
    }
}