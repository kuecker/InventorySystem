import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kyleuecker on 5/6/15.
 */
public class main {

    private static int upc1;
    private static int upc2;
    private static String maker;
    private static String name;
    private static double bot_size;
    private static double weight;
    private static int count;
    private static String type;


    public static void main(String[] the_args){

         HashMap <Integer,HashMap<Integer,Product>> makers = new HashMap <>();
        HashMap <Integer, Product>  products = new HashMap<>();

        Scanner input = new Scanner(System.in);

        upc1 = input.nextInt();
        upc2 = input.nextInt();
        maker = input.next();
        name = input.next();
        type = input.next();
        bot_size = input.nextDouble();
        weight = input.nextDouble();
        count = input.nextInt();

        if (!makers.containsKey(upc1)){
            //create new map for different products
            Product my_prod = new Product(maker,name, type, bot_size, weight, count);
            makers.put(upc1, new HashMap<Integer, Product>());




        }







    }
}
