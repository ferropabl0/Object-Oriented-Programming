package distancematrix;
public class TestPoint {
    public static void main( String[] args ) {
		  GeometricPoint g1 = new GeometricPoint(2, 3, "P1");
        GeometricPoint g2 = new GeometricPoint(4, 5, "P2");

        System.out.println(g1.getX());
        System.out.println(g1.getY());
        System.out.println(g1.getName());
        System.out.println(g1.distance(g2));
        g1.printPoint();
	}

}
