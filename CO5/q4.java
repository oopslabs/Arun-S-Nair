import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class q4 extends Applet implements MouseListener{
	int i=1;
	public void init(){
		addMouseListener(this);
	}
	
	public void paint(Graphics g){
		int x[]={130,320,225};
		int y[]={150,150,25};
		g.drawPolygon(x,y,3); 
		g.setColor(Color.gray);
		g.fillPolygon(x,y,3);

		g.drawRect(150,150,150,200);
		//House 
		g.setColor(Color.green);
		g.fillRect(150,150,150,200);

		g.drawRect(200, 200,50,150);//Door
		

		g.drawOval(200,75,50,50); 
		g.setColor(Color.white); 
		g.fillOval(200,75,50,50);
		
		if(i%2==0)
		{
			g.setColor(Color.red); 
			
		}
		else{
			g.setColor(Color.blue); 
			
		}
		g.fillRect(200,200,50,150);
	}
	
	public void mousePressed(MouseEvent e){
		i++;
		repaint();
	}
	
	public void mouseClicked(MouseEvent e){

	}
	public void mouseEntered(MouseEvent e){

	}


	public void mouseExited(MouseEvent e) {

	}
	public void mouseReleased(MouseEvent e) {

	}

}
