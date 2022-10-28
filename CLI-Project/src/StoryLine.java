import java.util.*;

public class StoryLine {
  List<Integer> monsterNumber;
  String mName;
  int damage;
  int hitPoint;


  Function function=new Function();

  public StoryLine(){};

  public StoryLine(List<Integer> monsterNumber,String mName){
    this.monsterNumber=monsterNumber;
    this.mName=mName;
  };

  public void enemyAppeared(List<Integer> monsterNumber,String mName){
    function.displayString("・\n",200);
    function.displayString("・\n",200);
    function.displayString("・\n",200);
    function.displayString("!!!!!!!!!!!!!\n",40);
    System.out.println();
    function.sleep(200);
    function.displayString(mName+" is appeared!!!\n",40);
    function.sleep(500);
    function.displayString("Guess a 4 digit number to defeat them!\n",40);
    System.out.println(monsterNumber);
    System.out.println();
    function.sleep(300);
  }

  public void playerAttack(int count, String pName){
    System.out.println("=======================================");
    function.sleep(200);
    System.out.println("    ---------- Attempt " + count +" ----------");
    function.sleep(200);
    function.displayString(pName+"'s attack! \n",40);
    function.sleep(200);
  }

  public void enemyAttack(String mName,int damage,int hitPoint){
    System.out.println("---------------------------------------");
    function.sleep(200);
    function.displayString(mName+"'s Attack!!\n",40);
    function.sleep(200);
    function.displayString("You got [ "+ damage + " ] damage!",40);
    function.sleep(200);
    System.out.println();
    function.sleep(200);
    // Show HP meter------------------------------
    System.out.println();
    function.sleep(200);
    function.displayDamage(hitPoint);
    function.sleep(200);
  }

  public void explanationRules(){
    function.sleep(200);
    System.out.println();
    function.sleep(200);
    System.out.println("             ----------------- RULES -------------------");
    function.sleep(400);
    System.out.println("- A player guesses a monster's number which is randomly generated.");
    function.sleep(400);
    System.out.println("- At the start, you will be given 100 HitPoint.");
    function.sleep(400);
    System.out.println("- Every turn after you enter a wrong number, you are attacked by the ");
    function.sleep(400);
    System.out.println("  monster and receive random damage depending on the monster's level.");
    function.sleep(400);
    System.out.println("- Hit the target before your HP gets 0!!!");
    function.sleep(400);
    System.out.println();
    function.sleep(400);
  }

  public void exitGame(){
    System.out.println("=================================================");
    function.displayString("          ❤️ Thank you for playing!! ❤️    \n",40);
    System.out.println("=================================================");
    System.out.println();
  }



}
