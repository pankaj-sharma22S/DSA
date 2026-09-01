class Solution {
    public String decodeString(String s) {
        Stack<String> str=new Stack<>();
        Stack<Integer> ints=new Stack<>();
        int count=0;
        String s1=new String();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c<='9'&& c>='0'){
                count=count*10+(c-'0');
                

            }
            else if(c=='['){
                str.push(s1);
                ints.push(count);
                s1="";
                count=0;

            }
             else if(c==']'){
                StringBuilder res=new StringBuilder();
                res.append(s1);
                int k=ints.pop();
                for(int j=0; j<k-1; j++){
                    res.append(s1);
                }
                
                s1=str.pop()+res.toString();
            }
            else{
                s1=s1+Character.toString(c);
            }
        }
        return s1;
    }
}