class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            int res=0;
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                
                    int a=stack.pop();
                    int b=stack.pop();
                    if(s.equals("+")){
                        res=b+a;
                    }
                   else if(s.equals("-")){
                        res=b-a;
                    }
                    else if(s.equals("*")){
                        res=a*b;
                    }
                    else if(s.equals("/")){
                        res=b/a;
                    }
                    stack.push(res);
                
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}