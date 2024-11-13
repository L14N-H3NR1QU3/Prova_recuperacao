/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quest4;

import javax.swing.JOptionPane;

/**
 *
 * @author l.silva
 */
public class Quest4 {
    public static void main(String[] args) {
        String res = JOptionPane.showInputDialog(null, "Digite um numero:");
        int val = Integer.parseInt(res);
        JOptionPane.showMessageDialog(null, "Antecessor: "+(val-1));
        JOptionPane.showMessageDialog(null, "Sucessor: "+(val+1));
    }
}
