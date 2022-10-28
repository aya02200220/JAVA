import java.util.*;

public class Function {

  public int HP;
  public int millis;
  public int mode;

  ArrayList<Integer> list = new ArrayList<>();
  Scanner in = new Scanner(System.in);

  // Convert HP to damage gage display .
  public void displayDamage(int HP){
    int remainHP = (HP/4);
    int lostHP = 25-remainHP;
    if(lostHP<=0)lostHP=0;
    String damage="";
    for(int i=0;i<remainHP;i++){
      damage+="|";
    }
    for(int j=0;j<=lostHP;j++){
      damage+=" ";
    }
    System.out.println("[ HP:"+HP+" "+ damage + "]");
    sleep(200);
  }

  // Waiting
  public void sleep(int millis){
    try {
      Thread.sleep(millis); // 1秒
    } catch (InterruptedException e) {
    }
  }


  public void displayString(String str,int millis){
    for(int i=0; i<str.length(); i++) {
        System.out.print(str.charAt(i));
        sleep(millis);
    }
  }

  public int modeChange(){
    // int mode ;
    boolean loopFlag=false;

    System.out.println("■--------------- MODE -------------■");
    sleep(200);
    System.out.println(" 1) Easy Mode");
    sleep(200);
    System.out.println(" 2) Strict Mode");
    sleep(200);
    System.out.println("■----------------------------------■");
    sleep(200);

  
  while(!loopFlag){
    try{
      displayString("- Select a mode : ",40);
      mode = in.nextInt();
      if(mode==1 || mode == 2){
        loopFlag = true;
        // return mode;
      }else{
        System.out.println("Enter number 1 or 2.");
      }

    }catch(InputMismatchException e){
        in.next();
        System.out.println();
        System.out.println("Enter an integer.");
    }catch(Exception e){
      System.out.println("Something went wrong.");
      System.out.println("Please try again.");
    }
  }
  return mode;
  }

 /////////
}

