import java.util.Scanner;
public class Prob6_2 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the input: " + "\n" + "A1, B1, C1: ");
      double A1 = input.nextDouble(), B1 = input.nextDouble(), C1 = input.nextDouble();
      System.out.print("A2, B2, C2: ");
      double A2 = input.nextDouble(), B2 = input.nextDouble(), C2 = input.nextDouble();
      double D = (A1 * B2) - (A2 * B1), D1 = (C1 * B2) - (C2 * B1), D2 = (A1 * C2) - (A2 * C1);
      if (D == 0){
         System.out.println("The system of first-degree equations has infinitely many soluions!");
      } else {
         System.out.println("The solution: " + "\n" + "x1 = " + (D1/D) + "\n" + "x2 = " + (D2/D));
      }
   }
}

      