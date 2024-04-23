import javax.swing.JOptionPane;
public class Calculator {
   public static void main(String[] args) {
      String strNum1, strNum2;

      strNum1 = JOptionPane.showInputDialog(null,
      "Please input the first number: ", "Input the first number",
      JOptionPane.INFORMATION_MESSAGE);

      strNum2 = JOptionPane.showInputDialog(null,
      "Please input the second number: ", "Input the second number",
      JOptionPane.INFORMATION_MESSAGE);
      
      double num1 = Double.parseDouble(strNum1);
      double num2 = Double.parseDouble(strNum2);
      double sum = num1 + num2, difference = num1 - num2, product = num1 * num2, quotient = num1 / num2;

      String strNotification = "Sum: " + sum + "\n" + 
                              "Difference: " + difference + "\n" +
                              "Product: " + product + "\n" +
                              "Quotient: " + quotient;

      JOptionPane.showMessageDialog(null, strNotification, "This is the result",
      JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
   }
}
