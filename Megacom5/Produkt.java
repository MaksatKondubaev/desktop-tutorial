import java.util.Scanner;
import java.util.Arrays;

class Client{
    int name;
    double email;
    String cart;

    class ProductItem{}
}
class ProductItem{
    public static final String[] PRODUCTS = new String[]{"Хлеб", "Лимон", "Молоко", "Кефир", "Печенье", "Масло"};
    public static final int[] PRICES = new int[]{100, 200, 300, 400, 700, 950};
 
    private int count;
    private int position;
    
    public ProductItem(int position, int count){
        this.position = position;
        this.count = count;
    }
    
    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append(PRODUCTS[this.position]+" по цене "+ PRICES[this.position]+" за шт. = "+PRICES[this.position]*this.count+" р.");
        return sb.toString();
    }
    
    public int getSumm(){
        return PRICES[this.position]*this.count;
    } 
}
