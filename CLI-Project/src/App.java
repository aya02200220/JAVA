import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        char selectedNumber='\0';
        int monsterLevel=0;
        boolean flag =false;

        System.out.println("========================================");
        System.out.println("==           Monster Hunter           ==");
        System.out.println("----------------------------------------");
        System.out.print("Enter your name: ");
        String playerName=in.nextLine();
        System.out.println();
        System.out.println("=================================================");
        System.out.println("Welcome " + playerName + " !");
        System.out.println("Ready to hunt monsters?");

        do{
            System.out.println("----------------------------------------");
            System.out.println(" 1) ★★★★★★★ : Thunder Serpent Narwa");
            System.out.println(" 2) ★★★★    : Zinogre");
            System.out.println(" 3) ★       : Felyne");
            System.out.println(" 4) Back to the start.");
            System.out.println("---------------------------------------");



                try{
                    System.out.print("- Select a quest number! : ");
                    selectedNumber = in.next().charAt(0);

                    if(String.valueOf(selectedNumber).length()>1){
                        throw new IOException();
                    }
                    System.out.println();

                }catch(InputMismatchException e){
                    in.next();
                    System.out.println("Enter an integer.");
                }


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
                    System.out.println("Enter a number 1 to 4.");
                    System.out.println();
                    break;
            }

        }while(selectedNumber !=4 && flag==false); //&& flag==false

        System.out.println("========================================");
        System.out.println("Thank you for playing!!");

    }
}

