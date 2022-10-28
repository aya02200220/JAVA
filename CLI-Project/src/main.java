import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception {

        Function function = new Function();
        StoryLine storyLine=new StoryLine();
        Scanner in = new Scanner(System.in);
        char selectedNumber='\0';
        int modeSelect=0;
        String modeName;
        String checkSelectedNumber="";
        boolean flag =false;

        System.out.println();
        System.out.println("========================================================================");
        System.out.println("■                    Hit and Blow  ❌  Monster Hunter                  ■");
        System.out.println("------------------------------------------------------------------------");
        storyLine.explanationRules();

        function.displayString("Please enter your name: ",40);
        String playerName=in.nextLine();
        System.out.println();
        System.out.println("=================================================");
        function.displayString("Welcome " + playerName + " !",40);
        System.out.println();
        function.displayString("Ready to hunt monsters?\n",40);
        System.out.println();
        function.sleep(500);

        modeSelect=function.modeChange();
        modeName=modeSelect==1?"EASY" : "STRICT";

        do{
            System.out.println();
            System.out.println("- MODE: "+ modeName  +" -");
            function.sleep(200);
            System.out.println("■------------ QUEST LIST -------------■");
            function.sleep(200);
            System.out.println();
            function.sleep(200);
            System.out.println(" 1) ★★★★★★★★ : Kubilay Cakmak");
            function.sleep(200);
            System.out.println(" 2) ★★★★     : Zinogre");
            function.sleep(200);
            System.out.println(" 3) ★        : Felyne");
            function.sleep(200);
            System.out.println("   --------------------------------   ");
            function.sleep(200);
            System.out.println(" 4) Change the game mode.");
            function.sleep(200);
            System.out.println(" 5) End game.");
            function.sleep(200);
            System.out.println("■-------------------------------------■");
            function.sleep(200);

                try{
                    function.displayString("- Select a quest number : ",40);
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
                    HitAndBlow play =new HitAndBlow(selectedNumber,playerName,modeSelect);
                    play.battle();
                    break;
                case '4':
                    modeSelect=function.modeChange();
                    modeName=modeSelect==1?"EASY" : "STRICT";
                    break;
                case '5':
                    flag=true;
                    break;
                default:
                    System.out.println("========================================");
                    function.displayString("Enter a number 1 to 5.\n",40);
                    System.out.println();
                    break;
            }

        }while(selectedNumber !=5 && flag==false);

        storyLine.exitGame();
    }
}

