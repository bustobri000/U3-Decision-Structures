import javax.swing.*;
import java.text.DecimalFormat;

public class ShippingCosts {

    /*
    A Shipping Company charges the following rates
    for each 100 miles shipped:

    2lbs or less ..................... $1.10
    over 2lbs but less than 6lbs ..... $2.20
    over 6lbs but less than 10lbs .... $3.70
    over 10lbs ....................... $4.80

    Write a program to calculate the shipping price. The
    distance is not prorated, in other words, the price doesn't
    increase until the next 100 miles, i.e. 150 miles for a 3lbs
    package is still just $2.20.

    Example Run:
    Weight: 5.6lbs
    Distance: 345 miles
    Price: $6.60

    As always, your program should include a method.
     */
    public static void main(String[] args) {

        double weight = input("How much pounds do you weigh?");
        int miles = (int)input("How much miles do you need to travel?");
        int costMul = costMul(miles);
        double price = priceCheck(weight, costMul);
        display(price);
    }

    public static double input(String Prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(Prompt));
    }

    public static int costMul(int miles){
        int neoMiles = miles / 100;

        if(neoMiles == 0){
            neoMiles = 1;
        }
        return neoMiles;
    }

    public static double priceCheck (double weight, int cost){

        if (weight >= 10){
            return 4.8 * cost;
        } else if (weight >= 6){
            return 3.7 * cost;
        } else if (weight > 2){
            return 2.2 * cost;
        } else {
            return 1.1 * cost;
        }
    }

    public static void display(double price){
        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "Your final price is: $" + round.format(price));
    }
}
