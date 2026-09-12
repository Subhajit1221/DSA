class Solution {
    public int[] nextGreaterElements(int[] nums) {
        

        int res[]= new int[nums.length];
        Stack<Integer> s= new Stack<>();

       
        
        for(int i=nums.length-2;i>=0;i--){
            s.push(i);

        }

       int  i=nums.length-1;
       while(i>=0){

            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i]=-1;
                
            }else{
                
                 res[i]=nums[s.peek()];
                
            }

             s.push(i);

            i--;
        }

        return res;

    }
}