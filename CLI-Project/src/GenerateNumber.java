import java.io.*;
import java.util.*;

// Generate Monster's number.
public class GenerateNumber {
  Scanner in= new Scanner(System.in);
  List<Integer> recordList = new ArrayList<>();



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

  // Players Number（with no duplicates.）
  public ArrayList<Integer> getPNumbersStrict(){

    while(true){
      List<Integer> playerNumber = new ArrayList<>();
      try {
          System.out.print("Enter Number here: ");
          String str = in.nextLine();

          if(String.valueOf(str).length()==4){
            for(int k=0;k<4;k++){
              String sNumber = String.valueOf(str);

              // Check duplicate number.
              int a = Integer.parseInt(String.valueOf(sNumber.charAt(k)));
              if(playerNumber.indexOf(a)<0){

                playerNumber.add(a);
                // If there is duplicate number.
              }else{throw new IOException();}
            }

            return (ArrayList<Integer>) playerNumber;

          }else{throw new IOException();
          }
          // break;
        } catch (InputMismatchException e) {
          in.next();
          System.out.println("You entered Strings. Please enter numbers.");
        } catch (NumberFormatException e) {
          // in.next();
          System.out.println("You entered Strings. Please enter numbers.");
        }catch(IOException e){
          // in.next();
          System.out.println("Please enter 4 digits number with no duplicates.");
        }
      }
  }

  //////////

  // Players Number
  public ArrayList<Integer> getPNumbersEasy(){

    while(true){
      List<Integer> playerNumber = new ArrayList<>();
      try {
          System.out.print("Enter Number here: ");
          String str = in.nextLine();

          if(String.valueOf(str).length()==4){
            for(int k=0;k<4;k++){
              String sNumber = String.valueOf(str);

              // Check duplicate number.
              int a = Integer.parseInt(String.valueOf(sNumber.charAt(k)));
              playerNumber.add(a);

            }

            return (ArrayList<Integer>) playerNumber;

          }else{throw new IOException();
          }
          // break;
        } catch (InputMismatchException e) {
          in.next();
          System.out.println("You entered Strings. Please enter numbers.");
        } catch (NumberFormatException e) {
          // in.next();
          System.out.println("You entered Strings. Please enter numbers.");
        }catch(IOException e){
          // in.next();
          System.out.println("Please enter 4 digits number.");
        }
      }
  }
 /////////
}
