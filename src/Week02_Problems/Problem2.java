package Week02_Problems;

import javax.swing.JOptionPane;

/** ___________________________________ Problem 1 : ____________________________________ <br>
 * In this class Create a JOptionPane input box and ask the user to enter there name.<br>
 * Upon successful name entry, Display “Hello!” + the name entered in a dialog box. <br>
 * If no name is entered, display a message saying thus. <br>
 * ______________________________________________________________________________________
*/
 public class Problem2
{
    public static void main(String[] args)
    {
        // Create the input dialog box
        String input = JOptionPane.showInputDialog("Please enter your name :");

        // Check if a name has been entered
        if(input.length()>0){
            JOptionPane.showMessageDialog(null,"Hello " + input + " !");
        }else{
            JOptionPane.showMessageDialog(null, "You didn't enter a name ");
        }

    }
}
