import java.util.ArrayList;

public class Function {

  public int HP;
  public int millis;

  ArrayList<Integer> list = new ArrayList<>();

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

 /////////
}

