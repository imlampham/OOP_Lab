import java.util.Scanner;
public class InputFromKeyboard{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);

      System.out.println("What's your name?");
      String Name = keyboard.nextLine();
      System.out.println("How old are you?");
      int Age = keyboard.nextInt();
      System.out.println("How tall are you (m)?");
      double Height = keyboard.nextDouble();
      System.out.println("Mr/Mrs. " + Name + ", " + Age + " years old. " + "Your height is " + Height + ".");
   }
}