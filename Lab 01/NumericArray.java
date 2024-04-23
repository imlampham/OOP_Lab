import java.util.Scanner;
public class NumericArray {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of elements in array: ");
      int n = input.nextInt();
      int sum = 0; double average;
      int a[] = new int[n];
      System.out.print("Enter the array: ");
      for (int i = 0; i < n; i++){
         a[i] = input.nextInt();
         sum = sum + a[i];
      }
      System.out.println("Sum: " + sum);
      average = (double) sum / n;
      System.out.println("Average: " + average);
   }
}
