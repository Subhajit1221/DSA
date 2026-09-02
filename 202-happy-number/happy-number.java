class Solution {
    int srq(int n){

        int sum=0;

        while(n!=0){
          int d=n%10;
          sum=sum+d*d;
          n=n/10;
        }

        return sum;
    }
    public boolean isHappy(int n) {

         int slow = n;
        int fast = n;

        do {
            slow = srq(slow);
            fast = srq(srq(fast));
        } while (slow != fast);

        return slow == 1;

        

        
    }
}