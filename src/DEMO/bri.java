
package DEMO;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class bri extends JFrame{
    private Container k;
    private ImageIcon i;
    private JLabel il,nm,li;
    private Font f1,f2;
    private JButton b1;
    private Cursor cursor;
    bri(){
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(00,00,1375,800);
        this.setTitle("O-DOCTOR(Barisal)");
        k = this.getContentPane();
        k.setLayout(null);
        k.setBackground(Color.white);
        fun();
        list();
    }
    public void list(){
    cursor = new Cursor(Cursor.HAND_CURSOR);
        f2=new Font("Arial",Font.ITALIC + Font.BOLD,16);
        Color Red = new Color(204,0,0);
        Color BLU = new Color(192,192,192);
         Color Blue = new Color (0,0,51);
         Color wHI = new Color (255,255,255);
         b1= new JButton("1.COVID-19 Hospital Service");
       b1.setBounds(790,280,270,40);
       b1.setBackground(BLU);
       b1.setForeground(Red);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                    dispose();
           //Bri_coh nj= new Bri_coh();
           // nj.setLocationRelativeTo(null);
           //nj.setVisible(true);
           
                }
        });
        b1= new JButton("2.General Hospital Service");
       b1.setBounds(790,325,270,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(BLU);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
           //Bari_hos nj= new Bari_hos();
           //nj.setLocationRelativeTo(null);
           //nj.setVisible(true);
          
                }
    });
         b1= new JButton("3.COVID-19 Diagnosis Center");
       b1.setBounds(790,370,270,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(BLU);
       b1.setForeground(Red);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
           //Bari_coh nj= new Bari_coh();
           //nj.setLocationRelativeTo(null);
           //nj.setVisible(true);
                }
    });
        b1= new JButton("4.General Diagnosis Center");
       b1.setBounds(790,415,270,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(BLU);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
                      //Bari_diag nj= new Bari_diag();
           //nj.setLocationRelativeTo(null);
           //nj.setVisible(true);
           
                }
    });
       b1= new JButton("5.Emergency");
       b1.setBounds(790,460,270,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(BLU);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
         
                }
    });
        b1= new JButton("Main Menu");
       b1.setBounds(825,550,200,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(Blue);
       b1.setForeground(wHI);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
          JavaApplication6 ob =  new JavaApplication6();
         ob.setLocationRelativeTo(null);
         ob.setBounds(0, 0,1375,800);
           ob.setVisible(true);
                }
    });
    }
    public void fun(){
         Color BLU = new Color(0,51,102);
        f1= new Font("Arial",Font.ROMAN_BASELINE+ Font.BOLD,25);
         i =new ImageIcon(getClass().getResource("m.jpg"));
       il= new JLabel(i);
       il.setBounds(10,30,500,700);
       k.add(il);
       nm= new JLabel("Informations of Barisal");
       nm.setBounds(790,195,320,50);
       nm.setForeground(BLU);
       nm.setFont(f1);
       k.add(nm);
    }
    
    public static void main(String[] args) {
        bri fr= new bri();
        fr.setVisible(true);
    }
}
