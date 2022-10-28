import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String [] names = { "Ryan", "James", "Julie" };

        for(String name: names){
          System.out.println(name);
        }


    List<String> list2 = new ArrayList<>(10);
    String fillArg="Hello";
    Collections.fill(list2,fillArg);
    
    List<String> list = new ArrayList<>();

    list.add("Hello");
    list.add("Hola");
    list.add("Merhaba");
    list.add("Oi");
    list.add("Bonjour");

    System.out.println(list);
    System.out.println("============== remove[specific] ===============");
    list.remove("Merhaba");
    System.out.println(list);

    System.out.println("============== remove[index] ===============");
    list.remove(0);
    System.out.println(list);

    System.out.println("=============== sort ==============");
    list.sort(null);
    System.out.println(list);

    System.out.println("=============== clear ==============");
    list.clear();
    System.out.println();


    
    //
    }
}
