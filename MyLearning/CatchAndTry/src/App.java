import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers to divide.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        try{ System.out.println("Result: " + num1/num2);

        }catch(ArithmeticException e){
            System.out.println("例外が発生しました");
            System.out.println("詳細" + e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Finish program.");
        }



    }
}
