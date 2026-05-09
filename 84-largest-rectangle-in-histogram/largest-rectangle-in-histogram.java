class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> s= new Stack<>();

        int n=heights.length;

        int nextsmallleft[]=new int[n];

        s.push(0);
        nextsmallleft[0]=-1;

       for(int i=1;i<n;i++){
        while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
            s.pop();
        }

        if(s.empty()){
            nextsmallleft[i]=-1;
        }else{
            nextsmallleft[i]=s.peek();
        }

        s.push(i);

       }

       while(!s.isEmpty()){
          s.pop();
       }

       

       
        int nextsmallright[]=new int[n];

        s.push(n-1);
        nextsmallright[n-1]=n;

       for(int i=n-2;i>=0;i--){
        while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
            s.pop();
        }

        if(s.empty()){
            nextsmallright[i]=n;
        }else{
            nextsmallright[i]=s.peek();
        }

        s.push(i);

       }

       int max=0;

       for(int i=0;i<n;i++){
        
        int width= nextsmallright[i]-nextsmallleft[i]-1;
         
          int current=heights[i]*width;

          if(max<current){
            max=current;
          }
        
       }
       
        
        
      return max;
        
    }
}