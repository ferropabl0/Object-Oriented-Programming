package distancematrix;

import java.util.LinkedList;
//import distancematrix.Matrix;

public class DistanceMatrix implements Matrix{
    private LinkedList<GeometricPoint> cities;
    private LinkedList<LinkedList<Double>> matrix;

    public DistanceMatrix(){
        this.cities = new LinkedList<GeometricPoint>();
        this.matrix = new LinkedList<LinkedList<Double>>();
    }
    
    public void addCity(double x, double y, String name){
        GeometricPoint newCity = new GeometricPoint(x, y, name);
        cities.add(newCity);
    }

    public String getCityName(int i){
        return cities.get(i).getName();
    }

    public int getNoOfCities(){
        int numCity = cities.size();
        return numCity;
    }

    public void createDistanceMatrix(){
        LinkedList<LinkedList<Double>> distanceMatrix = new LinkedList<LinkedList<Double>>();
        int noCities = getNoOfCities();

        for(int i = 0; i < noCities; i++){
            LinkedList<Double> distanceList = new LinkedList<Double>();

            for(int j = 0; j<noCities; j++){
                distanceList.add(getDistance(i, j));
            }
            distanceMatrix.add(distanceList);
        }
        matrix = distanceMatrix;

    }

    public double getDistance(int i1, int i2){
        double distance = cities.get(i1).distance(cities.get(i2));
        return distance;
    }

    public LinkedList<LinkedList<Double>> getMatrix(){
        return this.matrix;
    }
}


