import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class q3 extends Applet implements ActionListener{
	Frame f=new Frame();
	TextField t1,t2,t3,t4,t5,res;
	Button b=new Button("CHECK FACE");
	int per=-1;
	Label l=new Label("Enter marks");
	
	public void init(){
		l.setBounds(50,50,100,20);
		f.add(l);
		t1=new TextField(5);
		t1.setBounds(50,100,100,20);	
		t2=new TextField(5);
		t2.setBounds(50,150,100,20);
		t3=new TextField(5);
		t3.setBounds(50,200,100,20);
		t4=new TextField(5);
		t4.setBounds(50,250,100,20);
		t5=new TextField(5);
		t5.setBounds(50,300,100,20);
		
		f.add(t1);	f.add(t2);	f.add(t3);	f.add(t4);	f.add(t5);	
		
		//t1.setText("0");  t2.setText("0"); t3.setText("0"); t4.setText("0"); t5.setText("0");
		b.setBounds(50,325,100,20);
		f.add(b);
		b.addActionListener(this);
		res=new TextField(10);
		res.setBounds(50,350,100,20);
		f.add(res);
		f.setLayout(null); f.setVisible(true); f.setSize(400,450); f.setLocation(500,200); f.setBackground(Color.gray);
	}

	public void actionPerformed(ActionEvent e){
		int m1,m2,m3,m4,m5;
		m1=Integer.parseInt(t1.getText());
		m2=Integer.parseInt(t2.getText());
		m3=Integer.parseInt(t3.getText());
		m4=Integer.parseInt(t4.getText());
		m5=Integer.parseInt(t5.getText());
		if(e.getSource()==b){
			per=(m1+m2+m3+m4+m5)/5;
			res.setText(String.valueOf(per));
			repaint();
		}
	}
	
	public void paint(Graphics g){
		
		if(per >= 50){
			g.setColor(Color.YELLOW); 
			g.fillOval(10, 10, 200, 200);
// draw Eyes 
			g.setColor(Color.BLACK); 
			g.fillOval(55, 65, 30, 30);
			g.fillOval(135, 65, 30, 30);	
// draw Mouth
			g.fillOval(50, 110, 120, 60);
// adding smile 
			g.setColor(Color.YELLOW); 
			g.fillRect(50, 110, 120, 30);
			g.fillOval(50, 120, 120, 40);
		}
		else if(per<50 &&per!=-1){
			g.setColor(Color.yellow);
			g.fillOval(0,0,300,300); 
			g.setColor(Color.black ); 
			g.fillOval(80,75,30,30); 		
			g.fillOval(190,75,30,30); 
			g.setColor(Color.black); 
			g.drawArc(75,150,150,150,0,180); 
			g.fillArc(75,150,150,150,0,180);

		}			
	}
	
	
	
}
