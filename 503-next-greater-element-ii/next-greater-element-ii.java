class Solution {
    public int[] nextGreaterElements(int[] nums) {
        

        int res[]= new int[nums.length];
        Stack<Integer> s= new Stack<>();

        int i=nums.length-1;
        int flag=0;
       while(flag<3){

        if(i<0){

            i= i=nums.length-1;

        }
        if(i==nums.length-1){
                flag++;
                
            }

            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i]=-1;
                s.push(i);
            }else{
                
                 res[i]=nums[s.peek()];
                 s.push(i);
            }

            

            i=(i-1)%nums.length;
        }

        return res;

    }
}