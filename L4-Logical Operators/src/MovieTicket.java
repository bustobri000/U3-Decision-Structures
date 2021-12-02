import javax.swing.*;
import java.text.DecimalFormat;

public class MovieTicket {

    /*
    The local Movie Theater has the following price structure:

    All movies after 5pm on Friday and Saturday are $10.00
    All movies after 5pm on Mon, Tues, Wed, Thurs and Sunday are $8.00
    All movies before 5pm on any day are $7.00.

    Children receive half off of all tickets.
    Senior Citizens receive half off on any movie before 5 pm.

    Create a program that will allow a user to enter the number of child, adult, and senior citizen tickets, the day
    and the time of their movie and accurately display the total ticket cost.

     */

    public static void main(String[] args) {


        int time = Integer.parseInt(JOptionPane.showInputDialog("What time is the movie?"));
        String day = JOptionPane.showInputDialog("What day is it?");
        day = day.toLowerCase();
        int numChild, numAdult, numSenior;


    }

    public static double findAdultPrice(int time, String day){
        double price;
        if ((day.equals("friday") || day.equals("saturday")) && (time >= 1700)){
            price = 10.00;
        } else if (time >= 1700){
            price = 8.00;
        } else {
            price = 7.00;
        }

        return price;
    }

    public static double findChildPrice(int time, String day){
        double price;
        if ((day.equals("friday") || day.equals("saturday")) && (time >= 1700)){
            price = 10.00;
        } else if (time >= 1700){
            price = 8.00;
        } else {
            price = 7.00;
        }
        return price * 0.5;
    }
    public static double findSeniorPrice(int time, String day){
        double price;
        if ((day.equals("friday") || day.equals("saturday")) && (time >= 1700)){
            price = 10.00;
        } else if (time >= 1700){
            price = 8.00;
        } else {
            price = 7.00;
        }
        if(time <= 1700) {
            price *= 0.5;
        }
        return price;
    }
}
