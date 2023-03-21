import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World ourWorld;

    public MyMap() {
        initComponents();

        LinkedList<Continent> ourContinents = new LinkedList<Continent>();
        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add(new Point(73, 93));
        points1.add(new Point(70, 158));
        points1.add(new Point(153, 164));
        points1.add(new Point(192, 321));
        points1.add(new Point(214, 320));
        points1.add(new Point(349, 194));
        points1.add(new Point(323, 164));
        points1.add(new Point(271, 180));
        points1.add(new Point(261, 112));

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

        PolygonalRegion northAmerica = new PolygonalRegion(points1);
        PolygonalRegion greenland = new PolygonalRegion(points2);
        PolygonalRegion southAmerica = new PolygonalRegion(points3);
        LinkedList <PolygonalRegion> americaCountries = new LinkedList<PolygonalRegion>();
        americaCountries.add(northAmerica);
        americaCountries.add(greenland);
        americaCountries.add(southAmerica);
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

        LinkedList <PolygonalRegion> africaCountries = new LinkedList<PolygonalRegion>();
        PolygonalRegion africa1 = new PolygonalRegion(pointsAfrica);
        PolygonalRegion madagascar = new PolygonalRegion(pointsMadagascar);
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

        PolygonalRegion europe1 = new PolygonalRegion(pointsEurope);
        PolygonalRegion uk = new PolygonalRegion(pointsUK);
        LinkedList<PolygonalRegion> europeCountries = new LinkedList<PolygonalRegion>();
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

        PolygonalRegion asia1 = new PolygonalRegion(pointsAsia);
        PolygonalRegion japan = new PolygonalRegion(pointsJapan);
        PolygonalRegion indo1 = new PolygonalRegion(pointsIndo1);
        PolygonalRegion indo2 = new PolygonalRegion(pointsIndo2);
        LinkedList<PolygonalRegion> asiaCountries = new LinkedList<PolygonalRegion>();
        asiaCountries.add(asia1);
        asiaCountries.add(japan);
        asiaCountries.add(indo1);
        asiaCountries.add(indo2);
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

        PolygonalRegion australia1 = new PolygonalRegion(pointsAus);
        PolygonalRegion newZ1 = new PolygonalRegion(pointsNewZ1);
        PolygonalRegion newZ2 = new PolygonalRegion(pointsNewZ2);
        LinkedList<PolygonalRegion> ausCountries = new LinkedList<PolygonalRegion>();
        ausCountries.add(australia1);
        ausCountries.add(newZ1);
        ausCountries.add(newZ2);
        Continent australia = new Continent(ausCountries);
        ourContinents.add(australia);

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
        ourWorld.draw( g );
    }

}

