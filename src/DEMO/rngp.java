
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

public class rngp extends JFrame 
{
    private Container k;
    private ImageIcon i;
    private JLabel il,nm,li;
    private Font f1,f2;
    private JButton b1;
    private Cursor cursor;
    rngp()//Constructor
        {
        //Window create & design:
        Color wHI = new Color (255,255,255);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Window type.
        this.setBounds(00,00,1375,800);                       //SIze of Window
        this.setTitle("Rangpur");                             //Title
        this.setBackground(wHI);                              //Background color.
        k = this.getContentPane();
        k.setLayout(null);
        k.setBackground(Color.white);
        fun();
        list();
    }
     public void list()
    {
        //Created a hand cursor for Buttons:
        cursor = new Cursor(Cursor.HAND_CURSOR);
        //Different  types of customized Fonts:
        f2=new Font("Arial",Font.ITALIC + Font.BOLD,16);
        // Colour Variation Codes:
        Color Red = new Color(204,0,0);
        Color BLU = new Color(192,192,192);
        Color Blue = new Color (0,0,51);
        Color wHI = new Color (255,255,255);
        Color grn = new Color(0,153,51);
         //Button Design:
       b1= new JButton("1.COVID-19 Hospital Service");
       b1.setBounds(790,235,270,40);                      //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);      //Text field at center.
       b1.setBackground(BLU);                             //Button background color.
       b1.setForeground(Red);                             //Text Color.
       b1.setFont(f2);                                    //Text Font
       b1.setCursor(cursor);                              //Hand type Customized Cursor.
       k.add(b1);                                         //Added to the window.
       
       //Action Code for Button "1.COVID-19 Hospital Service":
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                    dispose();
            RNGP_cohos nj= new RNGP_cohos();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
           
                }
        });
        
        //Button Design:
       b1= new JButton("2.General Hospital Service");
       b1.setBounds(790,280,270,40);                      //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);      //Text field at center.
       b1.setBackground(BLU);                             //Button background color.
       b1.setFont(f2);                                    //Text Font
       b1.setCursor(cursor);                              //Hand type Customized Cursor.
       k.add(b1);                                         //Added to the window.
       //Action Code for Button "2.General Hospital Service":
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
           Rng_Hos nj= new Rng_Hos();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
                }
    });
        
        //Button Design:
       b1= new JButton("3.COVID-19 Diagnosis Center");
       b1.setBounds(790,325,270,40);                    //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(BLU);                           //Button background color.
       b1.setForeground(Red);                           //Button text Color.
       b1.setFont(f2);                                  //Text Font.
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       
       //Action Code for Button "3.COVID-19 Diagnosis Center":
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
                     RNGP_diagco nj= new RNGP_diagco();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
           }
                
    });
       
       //Button Design:
       b1= new JButton("4.General Diagnosis Center");
       b1.setBounds(790,370,270,40);                    //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(BLU);                           //Button background color.
       b1.setFont(f2);                                  //Text Font
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       
       //Action Code for Button "4.General Diagnosis Center":
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
           
            Rng_diag nj= new Rng_diag();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
                }
    });
       //Button Design:
       b1= new JButton("5.Emergency");
       b1.setBounds(790,415,270,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(BLU);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
       //Action Code for Button "5.Emergency":
       b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
             RNG_emr nj= new RNG_emr();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
                }
    });
       //Button Design:
        b1= new JButton("Helpdesk");
        b1.setBounds(790,460,270,40);                    //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(grn);                           //Button background color.
       b1.setForeground(wHI);                           //Text Color.
       b1.setFont(f2);                                  //Text Font.
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       //Action Code for Button "Helpdesk":
        b1.addActionListener(new ActionListener(){
               @Override
                public void actionPerformed(ActionEvent e){
                     dispose();
           HELPDESK nj= new HELPDESK();
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);
                }
    });
      //Button Design:
        b1= new JButton("Main Menu");
       b1.setBounds(825,550,200,40);
       b1.setHorizontalAlignment(JTextField.CENTER);
       b1.setBackground(Blue);
       b1.setForeground(wHI);
       b1.setFont(f2);
       b1.setCursor(cursor);
       k.add(b1);
       //Action Code for Button "Main Menu":
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
        //Created a hand cursor for Buttons:
        cursor = new Cursor(Cursor.HAND_CURSOR);
        Color BLU = new Color(0,51,102);
        //Different  types of customized Fonts:
        f2=new Font("Arial",Font.ITALIC + Font.BOLD,16);
        f1= new Font("Arial",Font.ROMAN_BASELINE+ Font.BOLD,25);
        //Image insertion:
       i =new ImageIcon(getClass().getResource("m.jpg"));
       il= new JLabel(i);
       il.setBounds(10,30,500,700);
       k.add(il);
       //Code for Label:
       nm= new JLabel("Informations of Rangpur");
       nm.setBounds(785,130,320,50);
       nm.setForeground(BLU);
       nm.setFont(f1);
       k.add(nm);
    }
    
    public static void main(String[] args) {
        rngp fr= new rngp();  //Object declaration will call the constructor
        fr.setVisible(true); //Makes visible
    }
}
