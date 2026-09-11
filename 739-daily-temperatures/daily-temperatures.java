class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> s= new Stack<>();

        int warmer[]= new int[temperatures.length];

        int i=0;

        while(i<temperatures.length){

            if(s.isEmpty()){
                s.push(i);
            }
            if(temperatures[s.peek()]>=temperatures[i]){
                s.push(i);
            }else{
                while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
                    warmer[s.peek()]=i-s.pop();
                }

                s.push(i);
                
                

            }

            i++;
        }
        
        return warmer;
    }
}