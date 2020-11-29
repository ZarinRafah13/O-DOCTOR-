
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
public class Dhk extends JFrame {
    private Container k;
    private ImageIcon i;
    private JLabel il,nm,li,b3,j3;
    private Font f1,f2,f6;
    private JButton b1;
    private Cursor cursor;
    Dhk(){
         Color wHI = new Color (255,255,255);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Window type.
        this.setBounds(00,00,1375,800);                       //SIze of Window
        this.setTitle("Dhaka");                               //Title
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
         f6=new Font("Times New Roman",Font.BOLD, 14);
       // Colour Variation Codes
        Color Red = new Color(204,0,0);
        Color BLU = new Color(192,192,192);
        Color Blue = new Color (0,0,51);
        Color wHI = new Color (255,255,255);
        Color blk = new Color(0,0,0);
        Color red = new Color(153,0,0);
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
       
       //Action Code for Button "1.COVID-19 Hospital Service"
       b1.addActionListener(new ActionListener(){           //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                    dispose();                              //Helps not to open a new window.
             Dhk_cHos nj= new Dhk_cHos();                   //Created object will help to automatically call the constructor and proceed.
           nj.setLocationRelativeTo(null);              
           nj.setVisible(true);                             //makes Visible.
           
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
       
       //Action Code for Button "2.General Hospital Service"
        b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
                     Dhk_Hos j= new Dhk_Hos();              //Created object will help to automatically call the constructor and proceed.
           j.setLocationRelativeTo(null);
           j.setVisible(true);                              //makes Visible.
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
       
       //Action Code for Button "3.COVID-19 Diagnosis Center"
         b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
                    DHK_diagco nj= new  DHK_diagco();       //Created object will help to automatically call the constructor and proceed.
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);                               //makes Visible.
          
                }
    });
        
       b1= new JButton("4.General Diagnosis Center");
        //Button Design:
        b1.setBounds(790,370,270,40);                   //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(BLU);                           //Button background color.
       b1.setFont(f2);                                  //Text Font
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       
       //Action Code for Button "4.General Diagnosis Center"
        b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
           Dhk_diag nj= new Dhk_diag();                     //Created object will help to automatically call the constructor and proceed.
           nj.setLocationRelativeTo(null);
              nj.setVisible(true);                              //makes Visible.
                }
    });
       b1= new JButton("5.Emergency");
       //Button Design:
        b1.setBounds(790,415,270,40);                    //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(BLU);                           //Button background color.
       b1.setFont(f2);                                  //Text Font.
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       //Action Code for Button "5.Emergency"
        b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
           Dhk_emr nj= new Dhk_emr();                       //Created object will help to automatically call the constructor and proceed.
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);                             //makes Visible.
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
       //Action Code for Button "Helpdesk"
       
        b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
           HELPDESK nj= new HELPDESK();                     //Created object will help to automatically call the constructor and proceed.
           nj.setLocationRelativeTo(null);
           nj.setVisible(true);                              //makes Visible.
                }
    });
        
        //Button Design:
       b1= new JButton("Main Menu");
       b1.setBounds(825,550,200,40);                    //Button Size and position.
       b1.setHorizontalAlignment(JTextField.CENTER);    //Text field at center.
       b1.setBackground(Blue);                          //Button background color.
       b1.setForeground(wHI);                           //Text Color.
       b1.setFont(f2);                                  //Text Font.
       b1.setCursor(cursor);                            //Hand type Customized Cursor.
       k.add(b1);                                       //Added to the window.
       //Action Code for Button "Main Menu":
        b1.addActionListener(new ActionListener(){          //take the "Click" as an input.
               @Override
                public void actionPerformed(ActionEvent e){ //Performs the particular work for the Button.
                     dispose();                             //Helps not to open a new window.
          JavaApplication6 ob =  new JavaApplication6();    //Created object will help to automatically call the constructor and proceed.
         ob.setLocationRelativeTo(null);
         ob.setBounds(0, 0,1375,800);
           ob.setVisible(true);                              //makes Visible.
                }
    });
        
        //Code for Label:
         b3 = new JLabel("COVID19 safety Info:");
       b3.setBounds(700,640,300,35);               //Label size & position.
       b3.setFont(f6);                             //Text Font.
       b3.setForeground(red);                      //Text Color.
       k.add(b3);                                  //Add to the Window.
       //Code for Label:
       j3 = new JLabel("Call 333 and verify information before going.");
        j3.setBounds(840,640,300,35);                 //Label size & position.
       j3.setFont(f6);                               //Text Font
       j3.setForeground(blk);                        //Text Color
       k.add(j3);                                    //Add to the Window.
        
    }
   
   public void fun(){
       //Basic  Structure design:
       Color BLU = new Color(0,51,102);
        f1= new Font("Arial",Font.ROMAN_BASELINE+ Font.BOLD,25);
        i =new ImageIcon(getClass().getResource("m.jpg"));
       il= new JLabel(i);
       il.setBounds(10,30,500,700);
       k.add(il);
       //Code for Label:
       nm= new JLabel("Informations of Dhaka");
       nm.setBounds(785,130,320,50);                     //Label size & position.
       nm.setForeground(BLU);                            //Text Color.
       nm.setFont(f1);                                   //Font type.
       k.add(nm);                                        //Add to the Window.
    }
    
    public static void main(String[] args) {
         Dhk dr= new Dhk();
         dr.setVisible(true);
    }
}
