import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
public class q5 extends Applet implements ActionListener{
	
	Frame f=new Frame();
	Label l1,l2,l3;
	TextField t1,t2,res;
	Button ad=new Button("+");
	Button sub=new Button("-");
	Button div=new Button("/");
	Button mul=new Button("*");
	
	public void init(){
	
		l1=new Label("Number 1");
		l1.setBounds(50,100,100,20);
		f.add(l1);
	
		t1=new TextField(10);
		t1.setBounds(200,100,100,20);
		f.add(t1);
	
		l2=new Label("Number 2");
		l2.setBounds(50,150,100,20);
		f.add(l2);
	
		t2=new TextField(10);
		t2.setBounds(200,150,100,20);
		f.add(t2);
	
		l3=new Label("Result");
		l3.setBounds(50,200,100,20);
		f.add(l3);
	
		res=new TextField(10);
		res.setBounds(200,200,100,20);
		f.add(res);
	
		ad.setBounds(100,250,25,20);
		f.add(ad);
	
		sub.setBounds(140,250,25,20);
		f.add(sub);
	
		div.setBounds(180,250,25,20);
		f.add(div);
	
		mul.setBounds(220,250,25,20);
		f.add(mul);
	
		ad.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
	
	
	
		f.setLayout(null); f.setVisible(true); f.setSize(400,450); f.setLocation(500,200); f.setBackground(Color.gray);

	}
	
	public void actionPerformed(ActionEvent e){
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		
		if(e.getSource()==ad){
			res.setText(String.valueOf(a+b));
		}
		if(e.getSource()==sub){
			res.setText(String.valueOf(a-b));
		}
		if(e.getSource()==div){
			res.setText(String.valueOf(a/b));
		}
		if(e.getSource()==mul){
			res.setText(String.valueOf(a*b));
		}
		
	}
		
	
}
