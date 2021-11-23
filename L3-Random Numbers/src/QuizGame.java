import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class QuizGame {

    static JPanel panel;
    static JButton createProblem, checkAnswer;
    static JLabel showProblem, resultLabel;
    static JTextField answerInput;
    static JRadioButton addition, subtraction, multiplication, division;
    static ButtonGroup radios = new ButtonGroup();

    static double usersAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {
        new QuizGame();
    }

    public QuizGame(){
        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        addition = new JRadioButton("Addition");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("Multiplication");
        division = new JRadioButton("Division");

        createProblem = new JButton("Make a Problem");
        showProblem = new JLabel("Problem Goes Here");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("CHECK ANSWER");
        resultLabel = new JLabel("Results Go Here");

        addition.setBounds(100, 25, 200 , 25);
        subtraction.setBounds(100, 50, 200, 25);
        multiplication.setBounds(100, 74, 2050, 25);
        division.setBounds(100, 100, 200, 25);
        createProblem.setBounds(50, 125, 200 ,25);
        showProblem.setBounds(50, 150, 200, 25);
        answerInput.setBounds(50, 175, 200, 25);
        checkAnswer.setBounds(50, 200, 200, 25);
        resultLabel.setBounds(50, 225, 200, 25);

        addition.setSelected(true);

        createProblem.addActionListener(new NewProblemButton());
        checkAnswer.addActionListener(new CheckProblemListener());
        
        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);

        panel.setLayout(null);

        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        panel.add(createProblem);
        panel.add(showProblem);
        panel.add(answerInput);
        panel.add(checkAnswer);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }

    private class NewProblemButton implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            if(addition.isSelected()){
                addProblem();
            }
            if(subtraction.isSelected()){
                subProblem();
            }
            if (multiplication.isSelected()){
                mulProblem();
            }
            if(division.isSelected()){
                divProblem();
            }

            showProblem.setText(displayProblem);
            panel.remove(createProblem);
            panel.updateUI();
        }
    }

    private class CheckProblemListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            getUsersAnswer();
            checkAnswer();
        }
    }

    public static void checkAnswer(){
        if(usersAnswer == correctAnswer){
            resultLabel.setText("You are correct.");
            panel.add(createProblem);
            panel.updateUI();
        }else{
            resultLabel.setText("You are incorrect!");
        }
    }

    public static void getUsersAnswer(){
        usersAnswer = Double.parseDouble(answerInput.getText());
    }

    public static void createProblem(){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose Addition(1), Subtraction(2), Multiplication(3), Division(4)."));
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
        correctAnswer = Math.round(correctAnswer*100.0)/100.0;
        displayProblem = num1 + " / " + num2;


    }

    //Helper Methods

    public static int rand(){
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
}
