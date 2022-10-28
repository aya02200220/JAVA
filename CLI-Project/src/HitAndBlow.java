import java.io.*;
import java.util.*;

public class HitAndBlow {
  
  char selectedNumber;
  int level;
  String name;

  int [][] attack={{15,9,6},{10,7,5},{8,5,3}};
  String [] monsterName={"Kubilay Cakmak","Zinogre","Felyne"};
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
    String listStr="";
    Random rand = new Random();

    int level = Integer.parseInt(String.valueOf(selectedNumber));
    // Generate monster number.
    GenerateNumber n = new GenerateNumber();
    Function function = new Function();
    List<Integer> monsterNumber=new ArrayList<>(n.getMNumbers());
    List<Integer> playerNumber=new ArrayList<>();
    List<String> recordList=new ArrayList<>();
    recordList.add("\n   -------- Number Records --------");

    function.displayString2("・\n");
    function.displayString2("・\n");
    function.displayString2("・\n");
    function.displayString("!!!!!!!!!!!!!\n");
    
    function.sleep3();
    function.displayString(monsterName[level-1]+" is appeared!!!\n");
    function.sleep2();
    function.displayString("Guess a 4 digit number to defeat them!\n");
    System.out.println(monsterNumber);
    System.out.println();
    function.sleep2();


    while(hitPoint>0 && flag==false){
      count++;
      System.out.println(brLine);
      function.sleep2();
      System.out.println("    ---------- Attempt " + count +" ----------");
      function.displayString(name+"'s attack! \n");
      function.sleep2();

      // Show previous record
      if(recordList.size()>1){
        for(int i= 0;i<recordList.size();i++){
          if(i>0)System.out.print("   "+ i + ")");
          System.out.println(recordList.get(i));
          function.sleep4();
        }
      }

      function.sleep2();
      System.out.println();
      playerNumber=n.getPNumbers2();
      // System.out.println(playerNumber);
      System.out.println();
      function.sleep2();

      if(monsterNumber.equals(playerNumber)){
        System.out.println();
        function.displayString("CRITICAL HIT !!!!!!!!!!!!!!\n");
        System.out.println();
        System.out.println("🏆**************************************************🏆");
        System.out.println("               QUEST COMPLETE !!! ");
        System.out.println();
        System.out.println("               - "+ monsterName[level-1]+" -");
        System.out.println("🏆**************************************************🏆");
        System.out.println();
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
        prevHit=hit;
        prevBlow=blow;

        function.displayString("hit: "+hit+  " / blow: "+blow+"\n");

        // Store previous records.
        listStr=playerNumber.size()<=10?listStr="   ":"  ";
        for(int i= 0;i<playerNumber.size();i++){
          listStr+=playerNumber.get(i);
        }
        listStr+=" | hit: "+hit+  " / blow:  "+blow;
        recordList.add(listStr);

        function.sleep4();

        prevHit=0;
        prevBlow=0;
        int ran =rand.nextInt(3);
        int damage=attack[level-1][ran];
        hitPoint-=damage;
        if(hitPoint<=0)hitPoint=0;
        System.out.println("---------------------------------------");
        function.sleep3();
        function.displayString(monsterName[level-1]+"'s Attack!!\n");
        function.sleep3();
        System.out.println();
        function.displayString("You got [ "+ damage + " ] damage!\n");
        function.sleep2();
        function.displayDamage(hitPoint);
        function.sleep3();

      }

        if(hitPoint==0){
          System.out.println();
          function.displayString("Your are dead ......💀\n");
          System.out.println();
          System.out.println("---------------- Result ---------------");
          function.displayString("The answer was: "+monsterNumber+"\n");
          function.displayString("Target    : "+monsterName[level-1]+"\n");
          function.displayString("Attempt   : "+count+"\n");
          function.displayString("Remain HP : "+hitPoint+"\n");
          System.out.println();
          function.displayString("Try again・・・・・\n");
          System.out.println();
        }else if(flag==true){
          function.displayString("You defeated "+monsterName[level-1]+" !\n");
          function.displayString("Congratulation🎉\n");
          System.out.println("---------------- Result ---------------");
          function.displayString("Target    : "+monsterName[level-1]+"\n");
          function.displayString("Attempt   : "+count +"\n");
          function.displayString("Remain HP : "+hitPoint +"\n");
          System.out.println();
          function.displayString("Do you want to go another Quest?\n");
        }

    }//While loop
    /////
  }
}



