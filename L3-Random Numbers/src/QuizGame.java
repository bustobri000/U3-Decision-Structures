import javax.swing.*;
import java.util.Random;

public class QuizGame {

    static int usersAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {
        createProblem();
        getUsersAnswer();
        checkAnswer();
    }

    public static void checkAnswer(){
        if(usersAnswer == correctAnswer){
            JOptionPane.showMessageDialog(null, "You are correct.");
        }else{
            JOptionPane.showMessageDialog(null, "You are incorrect you absolute failure. Go home and cry you pathetic, worthless, miserable child!");
        }
    }

    public static void getUsersAnswer(){
        usersAnswer = input(displayProblem);
    }

    public static void createProblem(){
        int choice = input("Choose Addition(1), Subtraction(2), Multiplication(3), Division(4).");
        if(choice >= 1){
            if(choice < 5){
                if (choice == 1){
                    addProblem();
                }
                if (choice == 2){
                    subProblem();
                }
                if (choice == 3){
                    mulProblem();
                }
                if (choice == 4){
                    divProblem();
                }
            }else{
                System.out.println("Wrong input. Goodbye.");
                System.exit(0);
            }
        }else{
            System.out.println("Wrong input. Goodbye.");
            System.exit(0);
        }

    }

    public static void addProblem(){
        int num1 = rand();
        int num2 = rand();
        correctAnswer = num1 + num2;
        displayProblem = num1 + " + " + num2;
    }

    public static void subProblem(){
        int num1 = rand();
        int num2 = rand();
        correctAnswer = num1 - num2;
        displayProblem = num1 + " - " + num2;
    }

    public static void mulProblem(){
        int num1 = rand();
        int num2 = rand();
        correctAnswer = num1 * num2;
        displayProblem = num1 + " x " + num2;
    }

    public static void divProblem(){
        int num1 = rand();
        int num2 = rand();
        correctAnswer = num1 / num2;
        displayProblem = num1 + " / " + num2;
    }

    //Helper Methods

    public static int rand(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
}
