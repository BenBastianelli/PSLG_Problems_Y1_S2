package Week02_Problems;

import javax.swing.*;

public class Problem3
{
    public static void main(String[] args)
    {
        String username = JOptionPane.showInputDialog("Username :");
        String password = JOptionPane.showInputDialog("Password : ");
        String retypeP = JOptionPane.showInputDialog("Re-type Password : ");
        int choice = JOptionPane.showConfirmDialog(null,"Are  you happy with your choice?","Confirm",JOptionPane.YES_NO_OPTION);

        if(choice == JOptionPane.YES_OPTION){
            if(password.equals(retypeP)){
                JOptionPane.showMessageDialog(null,"Passwords match: Account made");
            }else
            {
                JOptionPane.showMessageDialog(null,"Passwords don't match :Account creation failed");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Account creation aborted!");
        }

    }
}
