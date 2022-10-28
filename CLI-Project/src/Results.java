import java.util.*;



public class Results {
  List<Integer> monsterNumber;
  String mName;
  int count;
  int hitPoint;

  Function function= new Function();

  public Results(){};
  public Results(List<Integer> monsterNumber,String mName,int count,int hitPoint){
    this.monsterNumber=monsterNumber;
    this.mName=mName;
    this.count=count;
    this.hitPoint=hitPoint;
  }
  public void congratsResult(String mName){
    System.out.println();
    function.displayString("👊 CRITICAL HIT 🔥 !!!!!!!!!!!!!!\n",40);
    System.out.println();
    function.sleep(200);
    System.out.println("🏆**************************************************🏆");
    function.sleep(200);
    System.out.println("               QUEST COMPLETE !!! ");
    function.sleep(200);
    System.out.println();
    System.out.println("               - "+ mName+" -");
    function.sleep(200);
    System.out.println("🏆**************************************************🏆");
    System.out.println();
  }

  public void badResult(){
    System.out.println();
    function.displayString("Your are dead ......💀\n",40);
    System.out.println();
    function.sleep(500);
    System.out.println("---------------- Result ---------------");
    function.sleep(500);
    System.out.println("The answer was: "+monsterNumber);
    function.sleep(500);
    System.out.println("Target    : "+mName);
    function.sleep(500);
    System.out.println("Attempt   : "+count);
    function.sleep(500);
    System.out.println("Remain HP : "+hitPoint);
    function.sleep(500);
    System.out.println();
    System.out.println("Try again・・・・・");
    System.out.println();
  }

  public void goodResult(){
    function.displayString("You defeated "+mName+" !\n",40);
    function.displayString("Congratulation🎉\n",40);
    System.out.println();
    function.sleep(500);
    System.out.println("---------------- Result ---------------");
    function.sleep(500);
    System.out.println("The answer was: "+ monsterNumber );
    function.sleep(500);
    System.out.println("Target    : "+mName);
    function.sleep(500);
    System.out.println("Attempt   : "+count );
    function.sleep(500);
    System.out.println("Remain HP : "+hitPoint );
    function.sleep(500);
    System.out.println();
    function.displayString("Do you want to go another Quest?\n",40);
    function.sleep(200);
    System.out.println();
  }
}