import java.io.*;
import java.util.*;

public class HitAndBlow {
  
  char level;
  String name;
  int hitPoint=100;
  int hit = 0;
  int blow = 0;
  int count = 0;
  int [][] attack={{10,7,3},{7,5,3},{6,3,1}};
  String [] monsterName={"Thunder Serpent Narwa","Zinogre","Felyne"};
  String brLine = "=======================================";

  public HitAndBlow(char selectedNumber,String name){
    this.level=selectedNumber;
    this.name=name;
  }

  public void battle(){
    // Generate monster number.
    GenerateNumber n = new GenerateNumber();
    List<Integer> monsterNumber=new ArrayList<>(n.getMNumbers());
    List<Integer> playerNumber=new ArrayList<>();

    System.out.println("--monsters number--");
    System.out.println(monsterNumber);

    while(hitPoint>0){
      count++;
      System.out.println(brLine);
      System.out.println("    ---------- Attempt " + count +"----------");
      System.out.println(name+"'s attack! ");
      playerNumber=n.getPNumbers();
      System.out.println(playerNumber);

      if(monsterNumber==playerNumber){
        System.out.println("Quest complete!! : " + monsterName[level]);

      }
      // }




    /////
    }





  }

 /////////

}
