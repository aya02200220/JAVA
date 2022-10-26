import java.io.*;
import java.util.*;

public class HitAndBlow {
  
  char selectedNumber;
  int level;
  String name;

  int [][] attack={{10,7,3},{7,5,3},{6,3,1}};
  String [] monsterName={"Thunder Serpent Narwa","Zinogre","Felyne"};
  String brLine = "=======================================";

  public HitAndBlow(char selectedNumber,String name){
    this.selectedNumber=selectedNumber;
    this.name=name;
  }

  public void battle(){
    int hitPoint=100;
    int hit = 0;
    int prevHit=0;
    int prevBlow=0;
    int blow = 0;
    int count = 0;

    boolean flag=false;
    int level = Integer.parseInt(String.valueOf(selectedNumber));
    // Generate monster number.
    GenerateNumber n = new GenerateNumber();
    List<Integer> monsterNumber=new ArrayList<>(n.getMNumbers());
    List<Integer> playerNumber=new ArrayList<>();

    System.out.println("--monsters number--");
    System.out.println(monsterNumber);

    while(hitPoint>0 && flag==false){
      count++;
      System.out.println(brLine);
      System.out.println("    ---------- Attempt " + count +"----------");
      System.out.println(name+"'s attack! ");
      playerNumber=n.getPNumbers2();

      if(monsterNumber.equals(playerNumber)){
        System.out.println("🏆**************************************************🏆");
        System.out.println("    Quest complete!!!! - " + monsterName[level-1]+" -");
        System.out.println("🏆**************************************************🏆");
        flag=true;

      }else{

        hit=0;
        blow=0;

        for(int i=0;i<monsterNumber.size();i++){
          for(int j=0;j<monsterNumber.size();j++){

            if(i==j && monsterNumber.get(i).equals(playerNumber.get(j))){
              hit++;
            }else if(monsterNumber.get(i).equals(playerNumber.get(j))){
              blow++;
            }
          }

        }

      }
      
      System.out.println("hit: "+hit+  " / blow:  "+blow);
      

      prevHit=hit;
      prevBlow=blow;

      prevHit=0;
      prevBlow=0;

    }//While loop
    /////
  }
}



