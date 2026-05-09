class Solution {
    public String simplifyPath(String path) {

        Stack<String> s = new Stack<>();

        String[] arr = path.split("/");

        for(String str : arr){

            if(str.equals("") || str.equals(".")){
                continue;
            }

            else if(str.equals("..")){

                if(!s.isEmpty()){
                    s.pop();
                }

            }else{
                s.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(String str : s){
            sb.append("/");
            sb.append(str);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}