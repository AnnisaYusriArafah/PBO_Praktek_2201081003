/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annisa280323;

import javax.swing.JOptionPane; 
/**
 *
 * @author Slime1
 */
public class contohJOptionPane {
    public static void main( String[] args ){ 
        String name = "";
        name = 
        JOptionPane.showInputDialog("Please enter your name");
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
