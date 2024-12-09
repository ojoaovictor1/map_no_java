import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Map<Product, Double> stock = new HashMap<>();

       Product p1 = new Product("Tv", 900.0);
       Product p2 = new Product("Notebook", 1200.0);
       Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

       Product ps = new Product("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));




        /*
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "123456789");

        cookies.remove("email");
        cookies.put("phone", "987654321");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Size: " + cookies.size());

        System.out.println("ALL COOKIES: ");

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }*/

    }
}