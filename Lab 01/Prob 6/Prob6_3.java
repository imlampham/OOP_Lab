import java.util.Scanner;
import java.lang.Math;
public class Prob6_3 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the input: " + "\n" + "A, B, C: ");
      double A = input.nextDouble(), B = input.nextDouble(), C = input.nextDouble();
      double Delta = B * B - 4 * A * C;
      System.out.println("The solution: " + "\n");
      double R1 = -B / (2 * A);
      if (Delta < 0){
         double R2 = Math.sqrt(-Delta) / (2 * A);
         System.out.println("x1 = " + R1 + "+" + R2 + "i" + "\n");
         System.out.println("x2 = " + R1 + "-" + R2 + "i");
      } else if (Delta == 0){
         System.out.println("x = " + R1);
      } else {
         double R2 = Math.sqrt(Delta) / (2 * A);
         System.out.println("x1 = " + (R1 + R2) + "\n");
         System.out.println("x2 = " + (R1 - R2));
      }
   }
}
