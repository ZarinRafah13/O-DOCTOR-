

package DEMO;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class JavaApplication6 extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    private JLabel jl,j2,j3,j4,il,j,ds,ds1,ds2,ds3;
    private Font f1,f2,f3,f4,f5,f6;
    private ImageIcon img;
    private JTextField tf1;
    private JButton b1;
    private Cursor cursor;
    
    JavaApplication6(){
        initcomponent();
    }
    
    public void initcomponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);   //White color Background
        
        //Different  types of customized Fonts:
        f1=new Font("Arial",Font.BOLD, 25);
        f2=new Font("Arial",Font.ITALIC,12);
        f3=new Font("Arial",Font.ITALIC + Font.BOLD,35);
        f4=new Font("Arial",Font.ITALIC + Font.BOLD,18);
        f5=new Font ("Arial",Font.ITALIC + Font.BOLD ,16);
        f6=new Font("Times New Roman",Font.BOLD, 14);
        
        //Image insertion:
       img =new ImageIcon(getClass().getResource("m.jpg")); //Image insertion
       il= new JLabel(img);
       il.setBounds(10,30,500,700);  //Bound of Level
       c.add(il);                   //added to the Window
       
       //Code for Label:
       jl = new JLabel();
       jl.setText("Welcome");
       jl.setBounds(885,65,300,35); //Bound of level
       jl.setFont(f1);              //font
       c.add(jl);                   //added in window
       
       //Code for Label:
       j2 = new JLabel("to");
       j2.setBounds(935,105,300,35); //Bound of level
       j2.setFont(f1);                //font
       c.add(j2);                    //added in window
       
       // Colour Variation Codes:
       Color green4 = new Color(0,102,0);
       Color blk = new Color(0,0,0);
       Color red = new Color(153,0,0);
       
       //Code for Label:
       j3 = new JLabel("O-DOCTOR");
       j3.setBounds(850,150,300,35);             //Bound of level
       j3.setFont(f3);                           //font
       j3.setForeground(green4);                 // Text color
       c.add(j3);                                //added in window
       
       //Code for Label:
       j4 = new JLabel("-every valuable life matters...");
       j4.setBounds(890,180,300,35);             //Bound of level
       j4.setFont(f2);                           //font
       c.add(j4);                                //added in window
       
        //Code for Label:
       ds= new JLabel("Check your Division code to search for Hospital Information:");
       ds.setBounds(800,220,400,50); //Bound of level
       ds.setFont(f2);               //font
       ds.setForeground(Color.BLUE); // Text color
       c.add(ds);                    //added in window
       
       //Code for Label:
       ds1= new JLabel("1.Barishal => BRI");
       ds1.setBounds(670,315,250,40);   //Bound of level
       ds1.setFont(f5);                 //font
       c.add(ds1);                      //added in window
       //Code for Label:
       ds1= new JLabel("2.Chittagong => CTG");
       ds1.setBounds(1030,315,250,40); //Bound of level
       ds1.setFont(f5);                 //font
       c.add(ds1);                      //added in window
       //Code for Label:
       ds1= new JLabel("3.Dhaka => DHK");
       ds1.setBounds(670,345,250,40);  //Bound of level
       ds1.setFont(f5);                 //font
       c.add(ds1);                      //added in window
       //Code for Label:
       ds1= new JLabel("4.Rajshahi => RJSH");
       ds1.setBounds(1030,345,250,40); //Bound of level
       ds1.setFont(f5);                //font
       c.add(ds1);                     //added in window
       //Code for Label:
       ds1= new JLabel("5.Rangpur => RNGP");
       ds1.setBounds(670,375,250,40); //Bound of level
       ds1.setFont(f5);               //font
       c.add(ds1);                    //added in window
       
       //Code for Label:
       ds1= new JLabel("6.Sylhet => SYLT");
       ds1.setBounds(1030,375,250,40);  //Bound of level
       ds1.setFont(f5);                 //font
       c.add(ds1);                      //added in window
       
       //Code for Label:
       j= new JLabel("Enter Your District Code:");
       j.setBounds(600,500,250,40); //Bound of level
       j.setFont(f4);               //font
       c.add(j);                    //added in window
       
       //Code for Label:
       j3 = new JLabel("COVID19 safety Info:");
       j3.setBounds(765,600,300,35); //Bound of level
       j3.setFont(f6);       //font
       j3.setForeground(red);// Text color
       c.add(j3);            //added in window
       
       //Code for Label:
       j3 = new JLabel("Call 333 and verify information before going.");
       j3.setBounds(907,600,300,35); //Bound of level
       j3.setFont(f6);               //font
       j3.setForeground(blk);       //Bacxkground Color
       c.add(j3);                   //add in window
       
       //Created a hand cursor for "Submit" Button.
       cursor = new Cursor(Cursor.HAND_CURSOR);  
       
       //Text bar for submitting Division Code:
       tf1= new JTextField();
       tf1.setBounds(850,500,150,40);                ////Bound of Text Field.
       tf1.setBackground(Color.LIGHT_GRAY);           //Background Color
       tf1.setHorizontalAlignment(JTextField.CENTER); //Text field in center
       tf1.setFont(f4);                               //font
       c.add(tf1);                                    //added in window
       
       //Sublit Button:
       b1= new JButton("Submit");
       b1.setBounds(1050,500,100,40); //bound of level
       b1.setCursor(cursor);          //cursor type
       c.add(b1);                     //added in window
       
       //ActionListener function code for matching the  Division Code
           b1.addActionListener(new ActionListener(){
               @Override
       public void actionPerformed(ActionEvent e){
           String dis =tf1.getText();         //Takes string as input:
           if( dis.equals("BRI"))            //Matches with the input:
       {
           dispose();                       //Works not to open a  particular new window for this section:
           bri fr= new bri();                //New object calls the constructor of that particular class to proceed:
           fr.setVisible(true);             //Makes the Page visible
       }
           
           else  if( dis.equals("RNGP"))   //Matches with the input:
       {
           dispose();                         //Works not to open a  particular new window for this section:
            rngp fr= new rngp();              //New object calls the constructor of that particular class to proceed:
            fr.setVisible(true);                //Makes the Page visible
       }
         else  if(dis.equals("CTG"))      //Matches with the input:
       {
           dispose();                      //Works not to open a  particular new window for this section:
       Ctg fr= new Ctg();                  //New object calls the constructor of that particular class to proceed:
       fr.setVisible(true);                 //Makes the Page visible.
       }
           else   if(dis.equals("DHK"))      //Matches with the input:
       {
           dispose();                    //Works not to open a  particular new window for this section:
       Dhk fr= new Dhk();                  //New object calls the constructor of that particular class to proceed:
       fr.setVisible(true);               //Makes the Page visible
       }
             else   if(dis.equals("SYLT"))     //Matches with the input:
       {
           dispose();                    //Works not to open a  particular new window for this section:
       Sylt fr= new Sylt();                //New object calls the constructor of that particular class to proceed:
       fr.setVisible(true);                 //Makes the Page visible
       }
           else
           {    //Message Dialogue if wrong Division code is searched.
               JOptionPane.showMessageDialog(null,"Wrong District CODE.");      
           }
       }
       });
           
    }
    
    public static void main(String[] args) {
        // Creating the Main Menu Window.
        JavaApplication6 frame= new JavaApplication6();
        frame.setVisible(true);                                //Makes window visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Winwow Close type
       frame.setBounds(300,100,900,530);                       //Size of the Window
       frame.setTitle("O-DOCTOR");                             //Window Title
       
    }

}
