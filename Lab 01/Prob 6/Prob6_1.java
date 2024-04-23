import java.util.Scanner;
public class Prob6_1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the input: " + "\n" + "A1 = ");
      double A1 = input.nextDouble();
      System.out.print("B1 = ");
      double B1 = input.nextDouble();
      double res = (-B1) / A1;
      String result;

      if (A1 != 0) {
         result = "The first-degree equation: x = " + res;
      } 
      else { 
         result = "The first-degree equation has no solution!";            
      }
      System.out.println(result);
   }
}
