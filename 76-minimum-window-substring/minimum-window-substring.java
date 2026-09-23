class Solution {
    public String minWindow(String s, String t) {
     HashMap<Character,Integer> need=new HashMap<>();
     HashMap<Character,Integer> window=new HashMap<>(); 
     int start=0;
     int ans=Integer.MAX_VALUE;
     int count=0;
     int left=0;
     for(int i=0; i<t.length(); i++){
        need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
     }
     for(int r=0; r<s.length(); r++){
        char ch=s.charAt(r);
        window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
        if(need.containsKey(ch) && window.get(ch)<=need.get(ch)){
            count++;
        }
        while(count==t.length()){
             if (r - left + 1 < ans) {
                    ans = r - left + 1;
                    start = left;
                }
            char chr=s.charAt(left);
            window.put(chr,window.get(chr) - 1);
            if(need.containsKey(chr) && window.get(chr)<need.get(chr)){
                count--;
            }
            left++;
        }
     }
     if(ans==Integer.MAX_VALUE){
        return "";
     }
     return s.substring(start,ans+start);
    }
}