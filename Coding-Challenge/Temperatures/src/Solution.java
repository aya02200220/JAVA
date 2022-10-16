import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

  public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); // the number of temperatures to analyze

      int ansTemp=0;
      if(n != 0){
        for (int i = 0; i < n; i++) {
          int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
          if(i==0){ansTemp = t;
            }else{
              ansTemp = Math.abs(ansTemp) > Math.abs(t) ? t:  Math.abs(ansTemp) == Math.abs(t) && ansTemp < t? t : ansTemp;
            }
          };
        System.out.println(ansTemp);
      }else{System.out.println(0);}
  }
}