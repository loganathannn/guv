package guvi;

import java.util.*;
public class revint1
{
   public static void main(String args[])
   {
      int num=0;
      int rev =0;
      System.out.println("Input your number and press enter: ");
     
      Scanner sc = new Scanner(System.in);
  
      num = sc.nextInt();
      
      while( num != 0 )
      {
          rev = rev * 10;
          //System.out.println(rev);
          rev = rev + num%10;
          //System.out.println(rev); 
          num = num/10;
         // System.out.println(num);
      }

      System.out.println(rev);
   }
}
