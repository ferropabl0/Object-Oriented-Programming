import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World ourWorld;
    Ocean atlantic;

    public MyMap() {
        initComponents();

        
        LinkedList<Continent> ourContinents = new LinkedList<Continent>();

        //CAPITAL CITIES

        City washington = new City(306, 222, "Washington", 200);
        
        City camberra = new City(864, 529, "Camberra", 150);
        City beijing = new City(820, 180, "Beijing", 300);
        City brasilia = new City(320, 440, "Brasilia", 150);
        City london = new City(472, 167, "London", 250);
        City paris = new City(500, 205, "Paris", 200);
        City elCairo = new City(558, 333, "El Cairo", 50);
        City nuuk = new City(329, 110, "Nook", 30);
        City jakarta = new City(770, 372, "Jakarta", 80);
        City antananarivo = new City(600, 500, "Antananarivo", 80);
        City tokio = new City(931, 204, "Tokio", 400);
        City wellington = new City(903, 564, "Wellington", 200);

        //OTHER CITIES (they don't act as capital cities even if they are)
        City madrid = new City(476, 248, "Madrid", 100);
        City Pretoria = new City(530, 519, "Pretoria", 200);
        City bangkok = new City(749, 293, "Bangkok", 200);
        City newYork = new City(328, 207, "New York", 200);
        City rio = new City(335, 462, "Rio de Janeiro", 150);
        City barcelona = new City(496, 241, "Barcelona", 100);
        City quebec = new City(252, 153, "Quebec", 100);

        
        LinkedList< Point > points0 = new LinkedList< Point >();
        points0.add(new Point(73, 93));
        points0.add(new Point(70, 158));
        points0.add(new Point(153, 164));
        points0.add(new Point(192, 321));
        points0.add(new Point(214, 320));
        points0.add(new Point(349, 194));
        points0.add(new Point(323, 164));
        points0.add(new Point(271, 180));
        points0.add(new Point(261, 112));


        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add(new Point(271, 56));
        points2.add(new Point(356, 140));
        points2.add(new Point(377, 54));

        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add(new Point(192, 321));
        points3.add(new Point(239, 403));
        points3.add(new Point(252, 540));
        points3.add(new Point(300, 582));
        points3.add(new Point(309, 477));
        points3.add(new Point(370, 450));
        points3.add(new Point(350, 392));
        points3.add(new Point(256, 391));
        points3.add(new Point(214, 320));

        Country northAmerica = new Country(points0, "North America", washington);
        northAmerica.addCity(newYork);
        northAmerica.addCity(quebec);
        Country greenland = new Country(points2, "Greenland", nuuk);


        Country southAmerica = new Country(points3, "South America", brasilia);
        southAmerica.addCity(rio);

        LinkedList <Country> americaCountries = new LinkedList<Country>();
        americaCountries.add(northAmerica);
        americaCountries.add(greenland);
        americaCountries.add(southAmerica);
        northAmerica.addNeighbor(greenland);
        southAmerica.addNeighbor(northAmerica);
        Continent america = new Continent(americaCountries);
        ourContinents.add(america);




        LinkedList< Point > pointsAfrica = new LinkedList< Point >();
        pointsAfrica.add(new Point(420, 330));
        pointsAfrica.add(new Point(417, 375)); 
        pointsAfrica.add(new Point(483, 395)); 
        pointsAfrica.add(new Point(504, 537)); 
        pointsAfrica.add(new Point(542, 534)); 
        pointsAfrica.add(new Point(593, 375)); 
        pointsAfrica.add(new Point(559, 315)); 
        pointsAfrica.add(new Point(475, 301));       


        LinkedList< Point > pointsMadagascar = new LinkedList< Point >();
        pointsMadagascar.add(new Point(608, 456));
        pointsMadagascar.add(new Point(589, 514));
        pointsMadagascar.add(new Point(609, 532));
        pointsMadagascar.add(new Point(641, 451));

        LinkedList <Country> africaCountries = new LinkedList<Country>();
        Country africa1 = new Country(pointsAfrica, "Africa", elCairo);
        africa1.addCity(Pretoria);
        Country madagascar = new Country(pointsMadagascar, "Madagascar", antananarivo);
        africaCountries.add(africa1);
        africaCountries.add(madagascar);
        Continent africa = new Continent(africaCountries);
        ourContinents.add(africa);

        LinkedList<Point> pointsEurope = new LinkedList<Point>();
        pointsEurope.add(new Point(482, 226));
        pointsEurope.add(new Point(450, 231));
        pointsEurope.add(new Point(450, 262));
        pointsEurope.add(new Point(470, 276));
        pointsEurope.add(new Point(492, 263));
        pointsEurope.add(new Point(506, 231));
        pointsEurope.add(new Point(547, 234));
        pointsEurope.add(new Point(559, 265));
        pointsEurope.add(new Point(547, 284));
        pointsEurope.add(new Point(578, 273));
        pointsEurope.add(new Point(569, 218));
        pointsEurope.add(new Point(594, 213));
        pointsEurope.add(new Point(622, 251));
        pointsEurope.add(new Point(611, 38));
        pointsEurope.add(new Point(518, 48));
        pointsEurope.add(new Point(497, 117));
        pointsEurope.add(new Point(507, 142));
        pointsEurope.add(new Point(525, 116));
        pointsEurope.add(new Point(544, 136));
        pointsEurope.add(new Point(573, 118));
        pointsEurope.add(new Point(561, 169));
        pointsEurope.add(new Point(500, 188));

        LinkedList<Point> pointsUK = new LinkedList<Point>();
        pointsUK.add(new Point(453, 131));
        pointsUK.add(new Point(447, 182));
        pointsUK.add(new Point(480, 174));
        pointsUK.add(new Point(466, 114));

        Country europe1 = new Country(pointsEurope, "Europe", paris);
        Country uk = new Country(pointsUK, "UK", london);
        europe1.addCity(madrid);
        europe1.addCity(barcelona);

        LinkedList<Country> europeCountries = new LinkedList<Country>();
        europeCountries.add(europe1);
        europeCountries.add(uk);
        Continent europe = new Continent(europeCountries);
        ourContinents.add(europe);

        LinkedList<Point> pointsAsia = new LinkedList<Point>();
        pointsAsia.add(new Point(622, 251));
        pointsAsia.add(new Point(643, 331));
        pointsAsia.add(new Point(680, 311));
        pointsAsia.add(new Point(656, 260));
        pointsAsia.add(new Point(677, 226));
        pointsAsia.add(new Point(738, 282));
        pointsAsia.add(new Point(763, 335));
        pointsAsia.add(new Point(824, 284));
        pointsAsia.add(new Point(848, 220));
        pointsAsia.add(new Point(844, 163));
        pointsAsia.add(new Point(889, 140));
        pointsAsia.add(new Point(951, 74));
        pointsAsia.add(new Point(708, 34));
        pointsAsia.add(new Point(611, 38));

        LinkedList<Point> pointsJapan = new LinkedList<Point>();
        pointsJapan.add(new Point(892, 240));
        pointsJapan.add(new Point(948, 197));
        pointsJapan.add(new Point(931, 152));

        LinkedList<Point> pointsIndo1 = new LinkedList<Point>();
        pointsIndo1.add(new Point(738, 368));
        pointsIndo1.add(new Point(745, 393));
        pointsIndo1.add(new Point(805, 349));

        LinkedList<Point> pointsIndo2 = new LinkedList<Point>();
        pointsIndo2.add(new Point(805, 384));
        pointsIndo2.add(new Point(880, 385));
        pointsIndo2.add(new Point(901, 371));
        pointsIndo2.add(new Point(879, 364));

        Country asia1 = new Country(pointsAsia, "Asia", beijing);
        Country japan = new Country(pointsJapan, "Japan", tokio);
        Country indo1 = new Country(pointsIndo1, "Indonesia", jakarta);
        Country indo2 = new Country(pointsIndo2, "Indonesia", jakarta);
        LinkedList<Country> asiaCountries = new LinkedList<Country>();
        asiaCountries.add(asia1);
        asiaCountries.add(japan);
        asiaCountries.add(indo1);
        asiaCountries.add(indo2);
        asia1.addCity(bangkok);
        Continent asia = new Continent(asiaCountries);
        ourContinents.add(asia);

        LinkedList<Point> pointsAus = new LinkedList<Point>();
        pointsAus.add(new Point(718, 491));
        pointsAus.add(new Point(733, 570));
        pointsAus.add(new Point(789, 541));
        pointsAus.add(new Point(857, 553));
        pointsAus.add(new Point(908, 473));
        pointsAus.add(new Point(858, 434));
        pointsAus.add(new Point(763, 435));

        LinkedList<Point> pointsNewZ1 = new LinkedList<Point>();
        pointsNewZ1.add(new Point(823, 617));
        pointsNewZ1.add(new Point(827, 630));
        pointsNewZ1.add(new Point(891, 588));
        pointsNewZ1.add(new Point(878, 566));

        LinkedList<Point> pointsNewZ2 = new LinkedList<Point>();
        pointsNewZ2.add(new Point(901, 539));
        pointsNewZ2.add(new Point(905, 565));
        pointsNewZ2.add(new Point(916, 572));

        Country australia1 = new Country(pointsAus, "Australia", camberra);
        Country newZ1 = new Country(pointsNewZ1, "New Zealand", wellington);
        Country newZ2 = new Country(pointsNewZ2, "New Zealand", wellington);
        LinkedList<Country> ausCountries = new LinkedList<Country>();
        ausCountries.add(australia1);
        ausCountries.add(newZ1);
        ausCountries.add(newZ2);
        Continent australia = new Continent(ausCountries);
        ourContinents.add(australia);


        //LAKES
        LinkedList<Point> pointsLake1 = new LinkedList<Point>();
        pointsLake1.add(new Point(233, 176));
        pointsLake1.add(new Point(210, 194));
        pointsLake1.add(new Point(234, 205));

        Lake superior = new Lake(pointsLake1);
        northAmerica.addLake(superior);

        LinkedList<Point> pointsLake2 = new LinkedList<Point>();
        pointsLake2.add(new Point(533, 410));
        pointsLake2.add(new Point(526, 438));
        pointsLake2.add(new Point(561, 419));
        pointsLake2.add(new Point(556, 404));

        Lake victoria = new Lake(pointsLake2);
        africa1.addLake(victoria);

        

        //OCEAN
        LinkedList<Point> pointsOcean1 = new LinkedList<Point>();
        pointsOcean1.add(new Point(260, 320));
        pointsOcean1.add(new Point(270, 368));
        pointsOcean1.add(new Point(362, 372));
        pointsOcean1.add(new Point(392, 446));
        pointsOcean1.add(new Point(330, 500));
        pointsOcean1.add(new Point(333, 575));
        pointsOcean1.add(new Point(483, 511));
        pointsOcean1.add(new Point(392, 332));
        pointsOcean1.add(new Point(442, 292));
        pointsOcean1.add(new Point(408, 171));

        atlantic = new Ocean(pointsOcean1);
        
        ourWorld = new World(ourContinents);
}

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        ourWorld.drawWorld( g );
        atlantic.drawOcean(g);
    }

}

