package distancematrix;
public class TestDistanceMatrix{
    public static void main ( String[ ] args) {
        DistanceMatrix testMatrix = new DistanceMatrix();
        
        for (int i = 0; i < 10; i++) {
            testMatrix.addCity(i, -3*i +2, "city" + i);
        }
        System.out.println(testMatrix.getCityName(0));
        System.out.println(testMatrix.getCityName(1));
        System.out.println(testMatrix.getCityName(2));

        System.out.println(testMatrix.getNoOfCities());

        testMatrix.createDistanceMatrix();
        
        double distance = testMatrix.getDistance(3, 8);
        System.out.println(distance);
       
        
        
        
    }
}