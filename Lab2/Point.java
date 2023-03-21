public class Point {
    private int x;
    private int y;


    public Point(int initX, int initY){
        x = initX;
        y = initY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x1) {
        x = x1;
    }
    
    public void setY(int y1) {
        y = y1;
    }

    public double distance(Point p2){
        return Math.sqrt(Math.pow(x - p2.x,2) + Math.pow(y - p2.y,2));
    }

    public void printPoint(){
        System.out.println("(" + x + "," + y + ")");

    }
}
