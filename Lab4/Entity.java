
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}

	abstract public void draw( java.awt.Graphics g );

	abstract public void translate( int dx, int dy );
	
	public void setColor(Color sc) {
		lineColor = sc;
	}

	public Color getColor() {
		return lineColor;
	}

}
