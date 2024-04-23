import java.util.Scanner;
public class Matrix {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int a, b, c, d;
      System.out.print("Enter the number of rows: ");
      a = input.nextInt();
      System.out.print("Enter the number of columns: ");
      b = input.nextInt();

      int matrix1[][] = new int[a][b];
      int matrix2[][] = new int[a][b];
      int sum[][] = new int[a][b];

      System.out.println("Enter the first matrix: ");
      for (c = 0; c < a; c++){
         for (d = 0; d < b; d++){
            matrix1[c][d] = input.nextInt();
         }
      }

      System.out.println("Enter the second matrix: ");
      for (c = 0; c < a; c++){
         for (d = 0; d < b; d++){
            matrix2[c][d] = input.nextInt();
         }
      }

      for (c = 0; c < a; c++){
         for (d = 0; d < b; d++){
            sum[c][d] = matrix1[c][d] + matrix2[c][d];
         }
      }

      System.out.println("Sum of the matrices: ");
      for (c = 0; c < a; c++){
         for (d = 0; d < b; d++){
            System.out.print(sum[c][d] + "\t");
         }
         System.out.println();
      }
   }
}
