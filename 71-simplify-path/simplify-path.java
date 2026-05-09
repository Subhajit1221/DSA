class Solution {
    public String simplifyPath(String path) {

        Stack <Character> s= new Stack<>();
        StringBuilder p = new StringBuilder(path);
        p.append('/');

        p.toString();

        int n=p.length();
        int count=0;

        s.push('/');

        for(int i=1;i<n;i++){
            
            if(p.charAt(i)=='/'){

                if(s.peek()=='/')  {       
                if(count>2){
                        while(count>0){
                            s.push('.');
                            count--;
                        }
                    }else if(count==2){
                      
                     s.pop();
                     if(s.isEmpty()){
                        s.push('/');
                     }
                     while(!s.isEmpty() && s.peek()!='/'){
                        s.pop();
                     }
                     

                    }
                        
            }else{

                 while(count>0){
                            s.push('.');
                            count--;
                 }

            }

            count=0;

              if(s.peek()!='/'){
                    s.push(p.charAt(i));
                }

                
            }else if(p.charAt(i)=='.'){
                    
                    
                    count++;
            }else{
                while(count>0){
                            s.push('.');
                            count--;
                 }
                  s.push(p.charAt(i));

            }
        }

         if(s.peek()=='/')  {
            s.pop();
         }
        if(s.isEmpty()){
                        s.push('/');
                     }

                  



        System.out.print(s);

        StringBuilder sb=new StringBuilder();

        while(!s.isEmpty()){
            sb.insert(0, s.pop());
        }

        return sb.toString();
        
    }
}