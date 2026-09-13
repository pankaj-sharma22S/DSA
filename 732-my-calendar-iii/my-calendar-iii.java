class MyCalendarThree {
    Map<Integer,Integer> map;
    public MyCalendarThree() {
        map=new TreeMap<>();
    }
    public int book(int startTime, int endTime) {
        int max=0;
        map.put( startTime,map.getOrDefault(startTime,0)+1);
        map.put( endTime,map.getOrDefault(endTime,0)-1);
        int count=0;
        for(int n:map.values()){
            count+=n;
            max=Math.max(count,max);
        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */