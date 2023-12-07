package questions.stack;

import java.util.List;
import java.util.Stack;

public class StockSpanner {

    List<Integer> stockStack;
    public StockSpanner() {
        this.stockStack = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        stockStack.add(price);
        for (int i = stockStack.size()-2; i >= 0; i--) {
            if(stockStack.get(i) <= price){
                count++;}else{
                    break;
                }
        }
        return count;
    }
}