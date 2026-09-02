class DayPrice{
    int day;
    int price;
    public DayPrice(int d,int p){
        day=d;
        price=p;
    }
}
class StockSpanner {
    Stack<DayPrice> s;
    int day;
    public StockSpanner() {
        s=new Stack<>();
       
    }
    
    public int next(int price) {
       int day=1;
        while(!s.isEmpty() && price>=s.peek().price ){
            day+=s.pop().day;
        }
        s.push(new  DayPrice(day,price));
        return day;
        }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */