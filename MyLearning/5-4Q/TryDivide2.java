public class TryDivide2{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    try{
    System.out.println("a / b = " + (a / b) + " あまり " + (a % b));
    }catch(NumberFormatException e){
      System.out.println("Input integer.");
      e.printStackTrace();
    }catch(ArithmeticException e){
      System.out.println("Input not 0.");
      e.printStackTrace();
    }catch(Exception e){
      System.out.println("Exception occurred.");
      e.printStackTrace();
    }
    finally{
      System.out.println("Terminate the program");
    }
  }
}
