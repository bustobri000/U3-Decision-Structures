import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class L7 {

    //This program is going to translate month numbers into month names.

    public static void main(String[] args) {
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter a month of number less than 6."));
        String monthName;

        switch(month)
        {

            case 1: monthName = "January";
                break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            default: monthName = "JOJO SIWA'S UNUSUAL QUEST PART 6: Pebble Sea.";
                break;
        }

        JOptionPane.showMessageDialog(null, monthName);

        switch (monthName){
            case "January": month = 1;
                break;
            case "February": month = 2;
                break;
            case "March": month = 3;
                break;
            case "April": month = 4;
                break;
            case "May": month = 5;
                break;
            case "June": month = 6;
                break;
            default: month = 69420;
                break;
        }

        JOptionPane.showMessageDialog(null, month);
    }
}
