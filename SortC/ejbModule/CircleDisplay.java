import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class CircleDisplay implements SortDisplay {
	 public int getArraySize(Dimension d) {
		    return d.width/2; 
		  }
	 
	  public void display(int a[], Graphics g, Dimension d) {
	    g.setColor(Color.white);
	    g.fillRect(0, 0, d.width, d.height);
	    double f = d.height / (double) a.length;  
	    double cf = 255.0 / (double) a.length;
	    int x = d.width - 3;
	    int y= d.height -3;
	    for (int i = a.length; --i >= 0; x -= 2,y -= 2) {
	      g.setColor(new Color((int)(a[i] * cf / 1.2), (int)(a[i] * cf), (int)(a[i] *cf/2)));
	      g.drawOval(x, y, (int)(a[i] * f), (int)(a[i] * f));
	    }
	  } 
}
