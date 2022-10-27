
public class Function {

  public int HP;

  // public DamageMeter(int HP){
  //   this.HP=HP;
  // }

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
  }

  public void sleep(){
    try {
      Thread.sleep(1000); // 1秒
    } catch (InterruptedException e) {
    }
  }
  public void sleep2(){
    try {
      Thread.sleep(500); // 0.5秒
    } catch (InterruptedException e) {
    }
  }
  public void sleep3(){
    try {
      Thread.sleep(200); // 0.5秒
    } catch (InterruptedException e) {
    }
  }
  public void sleep4(){
    try {
      Thread.sleep(40); // 0.04秒
    } catch (InterruptedException e) {
    }
  }

  public void displayString(String str){
    for(int i=0; i<str.length(); i++) {
        System.out.print(str.charAt(i));
        sleep4();
    }
  }
 /////////
}

