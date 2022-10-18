public class App {
    public static void main(String[] args) throws Exception {

        Taxi1 taxi = new Taxi1();
        taxi.setNo(2525);
        taxi.start();
        taxi.run();
        taxi.display();
        System.out.println("===========================");
        Taxi2 taxi2 = new Taxi2(2525);
        taxi2.start();
        taxi2.run();
        taxi2.display();

        System.out.println("===========================");
        Taxi2 taxi3 = new Taxi2(2525,4000);
        // taxi3.start();
        taxi3.run();
        taxi3.display();
    }
}
