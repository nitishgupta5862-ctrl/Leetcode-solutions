class StockSpanner {

    Stack<Integer> s = new Stack<>();
    int[] arr = new int[100000];
    int i = 0;

    public StockSpanner() {
    }

    public int next(int price) {

        arr[i] = price;

        while (!s.isEmpty() && arr[s.peek()] <= price) {
            s.pop();
        }

        int span;

        if (s.isEmpty()) {
            span = i + 1;
        } else {
            span = i - s.peek();
        }

        s.push(i);
        i++;

        return span;
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */