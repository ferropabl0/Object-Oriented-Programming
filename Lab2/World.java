import java.util.LinkedList;

public class World {
    private LinkedList<Continent> continents;

    public World(LinkedList<Continent> initContinents) {
        continents = initContinents;
    }

    public void draw(java.awt.Graphics g) {
        for (int i = 0; i < continents.size(); i++) {
            continents.get(i).draw(g);
        }
    }
}
