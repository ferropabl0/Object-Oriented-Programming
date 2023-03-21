import java.awt.*;


public class Text extends Entity{
    private Point c;
    private String text;

    public Text(Color lcinit,  Point ci, String ti) {
        super(lcinit);
        c = ci;
        text = ti;
    }

    public void draw(java.awt.Graphics g) {
        g.setColor(lineColor);
        g.drawString(text, c.getX(), c.getY());
    }
    public void translate( int dx, int dy ){

    }
}