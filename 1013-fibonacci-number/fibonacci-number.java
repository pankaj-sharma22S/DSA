class Solution {
    public int fib(int n) {
         Map<Integer,Integer> map=new HashMap<>();
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<=1){
            return n;
        }
        int res=fib(n-1)+fib(n-2);
        map.put(n,res);
        return res;
    }
}