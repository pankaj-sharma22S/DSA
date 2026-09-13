class MyCalendarTwo {
        List<int[]> list;
        List<int[]> overlap;
    public MyCalendarTwo() {
        list=new ArrayList<>();
        overlap=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int []n:overlap){
            if(n[1]>startTime && n[0]<endTime){
                return false;
            }
        }
        for(int []n:list){
            if(n[1]>startTime && n[0]<endTime){
                overlap.add(new int[]{
                    Math.max(n[0],startTime),
                    Math.min(n[1],endTime)
                });
            }
        }
        list.add(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */