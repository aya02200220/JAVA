import java.io.*;
import java.util.*;

// Generate Monster's number.
public class GenerateNumber {
  Scanner in= new Scanner(System.in);


  public ArrayList<Integer> getMNumbers(){
    // Scanner in= new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> monsterNumber = new ArrayList<Integer>();

    // Generate a list has integers 1～9
    for(int i = 0 ; i <= 9 ; i++) {
      list.add(i);
    }
    // Shuffle the list and set a monster's 4 numbers.
    Collections.shuffle(list);
    for(int j = 0 ; j <4 ; j++) {
      list.add(j);
      monsterNumber.add(list.get(j));
    }
    //Monster's number
    return monsterNumber;
  }

  // Players Number
  public ArrayList<Integer> getPNumbers(){

    String brLine= "=======================================";
    // System.out.println(brLine);
    // System.out.println("Choose and enter 4 digit numbers.(From 0 to 9)");
    // System.out.println("*The number must not be duplicated.");

    while(true){
      // Set set = new HashSet();
      List<Integer> playerNumber = new ArrayList<>();
      try {
          System.out.print("Enter Number here: ");
          int number=in.nextInt();

          if(String.valueOf(number).length()==4){
            for(int k=0;k<4;k++){
              String sNumber = String.valueOf(number);

              // Check duplicate number.
              int a = Integer.parseInt(String.valueOf(sNumber.charAt(k)));
              if(playerNumber.indexOf(a)<0){

                playerNumber.add(a);
                // If there is duplicate number.
              }else{throw new IOException();}
            }

            System.out.println(playerNumber);
            return (ArrayList<Integer>) playerNumber;

          }else{throw new IOException();
          }
          // break;
        } catch (InputMismatchException e) {
          in.next();
          System.out.println("You entered Strings. Please enter numbers.");
        }catch(IOException e){
          // in.next();
          System.out.println("Please enter 4 digits number with no duplicate.");
        }
      }
  }
 /////////
}