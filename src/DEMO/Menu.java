
package DEMO;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame{
    private Container k;
    private ImageIcon i;
    private JLabel il;
    Menu(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(00,00,1375,800);
        this.setTitle("Main Menu");
        k = this.getContentPane();
        k.setLayout(null);
        k.setBackground(Color.white);
        fun();
    }
    
    public void fun(){
         i =new ImageIcon(getClass().getResource("m.jpg"));
        il= new JLabel(i);
       il.setBounds(10,30,500,700);
       k.add(il);

        
    }
    
    
    public static void main(String[] args) {
         Menu fr= new Menu();
     fr.setVisible(true);
    }
}
