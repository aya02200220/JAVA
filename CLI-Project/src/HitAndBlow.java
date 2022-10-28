import java.util.*;

public class HitAndBlow {
  
  char selectedNumber;
  int level;
  int modeSelect;
  String pName;

  int [][] attack={{15,9,6},{10,7,5},{8,5,3}};
  String [] monsterName={"Kubilay Cakmak","Zinogre","Felyne"};

  public HitAndBlow(char selectedNumber,String name, int modeSelect){
    this.selectedNumber=selectedNumber;
    this.pName=name;
    this.modeSelect=modeSelect;
  }

  public void battle(){
    int hitPoint=100;
    int hit = 0;
    int blow = 0;
    int count = 0;
    int mode;

    boolean isEnd=false;
    String listStr="";
    Random rand = new Random();

    int level = Integer.parseInt(String.valueOf(selectedNumber));

    GenerateNumber n = new GenerateNumber();
    Function function = new Function();
    StoryLine storyLine=new StoryLine();

    // Generate monster number.
    List<Integer> monsterNumber=new ArrayList<>(n.getMNumbers());

    List<Integer> playerNumber=new ArrayList<>();
    List<String> recordList=new ArrayList<>();
    recordList.add("\n   -------- Number Records --------");

    String mName=monsterName[level-1];

    // Beginning story.
    storyLine.enemyAppeared(monsterNumber,mName);


    // Keep on playing If HP is over 0 and is not ended.

    while(hitPoint>0 && isEnd==false){
      count++;
      storyLine.playerAttack(count,pName);

      // Show previous record --------------------------------------------
      if(recordList.size()>1){
        for(int i= 0;i<recordList.size();i++){
          if(i>0)System.out.print("   "+ i + ")");
          System.out.println(recordList.get(i));
          function.sleep(i==0?200:40) ;
        }
      }
      if(recordList.size()>1)function.sleep(200);

      // Player's turn to answer.-----------------------------------------
      System.out.println();
      // Input players number.
      if(modeSelect==1){playerNumber=n.getPNumbersEasy();
      }else{playerNumber=n.getPNumbersStrict();}

      System.out.println();
      function.sleep(500);

      // If the answer is correct.-----------------------------------------
      if(monsterNumber.equals(playerNumber)){
        Results results=new Results();
        results.congratsResult(mName);
        isEnd=true;

      // If answer is wrong, compare numbers -------------------------------
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
        function.displayString("hit: "+hit+  " / blow: "+blow+"\n",40);


        // Store answer records in List.-----------------------------------------
        listStr=recordList.size()<10?"   ":"  ";
        for(int i= 0;i<playerNumber.size();i++){
          listStr+=playerNumber.get(i);
        }
        listStr+=" | hit: "+hit+  " / blow:  "+blow;
        recordList.add(listStr);


        // Enemy's turn to attack -----------------------------------------------
        function.sleep(40);
        int ran =rand.nextInt(3);
        int damage=attack[level-1][ran];
        hitPoint-=damage;
        if(hitPoint<=0)hitPoint=0;

        storyLine.enemyAttack(mName,damage, hitPoint);
      }

        // Finish game and Show result------------------------------------------------
        if(hitPoint==0){
          Results results=new Results(monsterNumber,mName,count,hitPoint);
          results.badResult();
        }else if(isEnd==true){
          Results results=new Results(monsterNumber,mName,count,hitPoint);
          results.goodResult();
        }

    }
  }
}



