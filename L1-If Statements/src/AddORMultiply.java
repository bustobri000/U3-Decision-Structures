import javax.swing.*;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, multiply and display the result
    If not, add them and display the results.
     */

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Please insert the first number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Please insert the second number"));
        double num3 = 0.0;
        if(num1 > num2){
            num3 = multiplication(num1, num2);
        }
        if(num1 <= num2){
            num3 = addition(num1, num2);
        }
        JOptionPane.showMessageDialog(null, "The third number is " + num3);
    }

    public static double addition(double num1, double num2){
        return num1 + num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
}