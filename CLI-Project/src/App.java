import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Function function = new Function();
        Scanner in = new Scanner(System.in);
        char selectedNumber='\0';
        String checkSelectedNumber="";
        int monsterLevel=0;
        boolean flag =false;

        System.out.println("========================================================");
        System.out.println("==                    Monster Hunter                  ==");
        System.out.println("--------------------------------------------------------");
        function.displayString("Welcome!!");
        System.out.println();
        function.displayString("Please enter your name: ");
        String playerName=in.nextLine();
        System.out.println();
        System.out.println("=================================================");
        function.displayString("Hi " + playerName + " !");
        System.out.println();
        function.displayString("Ready to hunt monsters?");
        System.out.println();
        System.out.println();
        function.sleep2();

        do{
            System.out.println("■------------ QUEST LIST -------------■");
            function.sleep3();
            System.out.println(" 1) ★★★★★★★★ : Kubilay Cakmak");
            function.sleep3();
            System.out.println(" 2) ★★★★     : Zinogre");
            function.sleep3();
            System.out.println(" 3) ★        : Felyne");
            function.sleep3();
            System.out.println(" 4) Back to the start.");
            function.sleep3();
            System.out.println("■-------------------------------------■");
            function.sleep3();

                try{
                    function.displayString("- Select a quest number! : ");
                    checkSelectedNumber = in.nextLine();
                    selectedNumber = checkSelectedNumber.charAt(0);

                    if(String.valueOf(checkSelectedNumber).length()>1){
                        selectedNumber='5';
                    }
                    System.out.println();

                }catch(InputMismatchException e){
                    in.next();
                    System.out.println("Enter an integer.");}

            switch (selectedNumber) {
                case '1':
                case '2':
                case '3':
                    // flag=true;
                    HitAndBlow play =new HitAndBlow(selectedNumber,playerName);
                    play.battle();
                    break;
                case '4':
                    flag=true;
                    break;
                default:
                    System.out.println("========================================");
                    function.displayString("Enter a number 1 to 4.");
                    System.out.println();
                    System.out.println();
                    break;
            }

        }while(selectedNumber !=4 && flag==false); //&& flag==false

        System.out.println("=================================================");
        function.displayString("Thank you for playing!!");
        System.out.println();
        System.out.println("=================================================");
        System.out.println();
    }
}

