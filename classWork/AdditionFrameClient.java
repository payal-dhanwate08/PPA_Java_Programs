import java.util.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;


class Logic implements ActionListener
{
    //Characteritics
    JFrame fobj;
    JButton bobj;
    JTextField tobj1;
    JTextField tobj2;
    JLabel Num1label , Num2label;

    
    public void Display(String title , int width , int height) throws Exception
    {
        fobj = new JFrame(title);

        Num1label = new JLabel("Number 1");
        Num1label.setBounds(50,50,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);

        Num2label = new JLabel("Number 2");
        Num2label.setBounds(50,100,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(150,50,150,30);

        bobj = new JButton("SUBMIT");
        bobj.setBounds(150 , 150,100,30);

        fobj.add(bobj);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Num1label);
        fobj.add(Num2label);

        bobj.addActionListener(this);
        fobj.setLayout(null);
        fobj.setSize(width , height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Socket sobj = new Socket("localhost",2100);
        System.out.println("server Succesfully connected");

    }
    public void actionPerFormed(ActionEvent aobj)
    {
        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int no1 = 11 , no2 = 10;

        doobj.writeInt(no1);
        doobj.writeInt(no2);



        int sum = diobj.readInt();
        System.out.println("Addition is : "+sum);

       
       
    }
 
}
class MAdditionFrameClient
{
    public static void main(String A[])
    {
        Logic lobj = new Logic("Addition" , 400,300);

    }
}