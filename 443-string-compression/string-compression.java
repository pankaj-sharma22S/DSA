class Solution {
    public int compress(char[] chars) {
        // char a=chars[0];
        StringBuilder ans=new StringBuilder();
        int count=1;
        int j=0;
        if(chars.length==1){
            return 1;
        }
        if(chars.length<1){
            return 0;
        }
        for(int i=1; i<chars.length; i++ ){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                ans.append(chars[i-1]);
                if(count>1){
                ans.append(count);
                }
                 count=1;
            }
          
        }
         ans.append(chars[chars.length-1]);
         
         if(count>1){ans.append(count);
         }
        String n=ans.toString();
        System.out.println(n.length());
        
        for(int i=0; i<ans.length(); i++){
            chars[j++]=ans.charAt(i);
        }
        return  n.length();
    }
}