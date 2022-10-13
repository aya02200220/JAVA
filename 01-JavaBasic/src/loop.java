import java.util.Scanner;

public class loop {
  public static void main(String[] args) throws Exception {

    // // For each
    // int[] numberArray = {1,2,3,4,5,6,7,8,9,10};
    // for (int number: numberArray){
    //     System.out.println("Number is "+ number);
    // }


    // // Switch case
    // int step=0;
    // Scanner scanner= new Scanner(System.in);

    // while(true){
    //   System.out.println("Ennter a number: ");
    //   step= scanner.nextInt();

    //   if(step===5){
    //     System.out.println("Have a nice one!");
    //     break;
    //   }

    //   switch(step){
    //     case 1:System.out.println("Addition");
    //       break;
    //     case 2:System.out.println("Subscription");
    //       break;
    //     case 3:System.out.println("Multiplication");
    //       break;
    //     case 4:System.out.println("‹3");
    //       break;
    //     default:System.out.println("Have a nice one!");
    //   }
    // }


    // // Nested loop
    // for(int i=0;i<5;i++){
    //   for(int j=0;j<3;j++){
    //     System.out.println("i is "+i + " and j is "+j);
    //   }
    //   for(int k=0;k<3;k++){
    //     System.out.println("i is "+i + " and k is "+k);
    //   }
    // }
    
    // Quiz Challenge
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the initial number: ");
    
    int count= scanner.nextInt();
    for(int i=count;i>0;i--){
    System.out.println("@".repeat(i));
    }


  //
  }
}
