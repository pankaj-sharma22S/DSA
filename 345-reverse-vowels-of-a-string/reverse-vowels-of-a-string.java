class Solution {
    boolean isvowel(char s){
        if(s=='a'||
        s=='e'||
        s=='i'||
        s=='o'||
        s=='u'||
        s=='A'||
        s=='E'||
        s=='I'||
        s=='O'||
         s=='U'
        )
        {
            return true;
        }
        return false;
     }
    public String reverseVowels(String k) {
    //  StringBuilder s=new StringBuilder(k);
    char []s=k.toCharArray();
     
   int i=0;
   int j=s.length-1;
   
   while(i<j){
    while(i<j && !isvowel(s[i])){
        i++;
    }
    while(i<j && !isvowel(s[j])){
        j--;
    }
    char temp=s[i];
    s[i]=s[j];
    s[j]=temp;
    i++;
    j--;

   }

      
    return new String(s);
     
    }
}