package a;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SlotMachine extends JFrame implements ActionListener{
	
	String buttonText;
	private JPanel jp;
    ImageIcon i1;
	ImageIcon i2;
	ImageIcon i3;
    JLabel l1;
	JLabel l2;
	JLabel l3;
	private JButton jb;
	
	public SlotMachine(){
		
		this.setTitle("Slot Machine");
		buttonText="Click!";
		jb=new JButton(buttonText);
		this.setLayout(new BorderLayout());
		this.add(jb,BorderLayout.SOUTH);
		i1=new ImageIcon("pic//222.jpg");
		i2=new ImageIcon("pic//333.jpeg");
		i3=new ImageIcon("pic//444.jpeg");
		
		l1=new JLabel ();
		l2=new JLabel ();
		l3=new JLabel ();
	    l1.setIcon(i1);
	    l2.setIcon(i2);
	    l3.setIcon(i3);
		jp=new JPanel();
		jp.setLayout(new BorderLayout());
	    jp.add(l1, BorderLayout.CENTER);
	    jp.add(l2, BorderLayout.WEST);
	    jp.add(l3, BorderLayout.EAST);
		
		this.add(jp,BorderLayout.CENTER);
		
	    jb.addActionListener(this);
		
		this.setResizable(false);//cannot be zoomed in or out
	    this.setSize(600, 400);
	    this.setLocation(200,100);
	    this.setVisible(true);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	
	public static void main(String[] args){
		new SlotMachine();
	}
   public void a(){
	   
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=(int) (Math.random()*3);
		int num2=(int) (Math.random()*3);
		int num3=(int) (Math.random()*3);
		
		if(num1==num2&&num2==num3){
			buttonText="You win!";
			jb.setText(buttonText);
			jb.setEnabled(false);
		}
		else{
			buttonText="Click!";
		    jb.setText(buttonText);}
		
		switch (num1){
		case 0:l1.setIcon(i1);break;
		case 1:l1.setIcon(i2);;break;
		case 2:l1.setIcon(i3);
		}
		switch (num2){
		case 0:l2.setIcon(i1);break;
		case 1:l2.setIcon(i2);break;
		case 2:l2.setIcon(i3);
		}
		switch (num3){
		case 0:l3.setIcon(i1);break;
		case 1:l3.setIcon(i2);break;
		case 2:l3.setIcon(i3);
		}
		//try to use collection to solve
	}

}
