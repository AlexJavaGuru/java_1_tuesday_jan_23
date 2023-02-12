package student_vladislav_romanov.lesson_3.level_7;

class Planet {

    private String name;
    private double diameter;
    private int distanceToSun;
    private boolean hasSatellites;
    private boolean isStar;


    Planet(String name, double diameter, int distanceToSun, boolean hasSatellites, boolean isStar) {
        this.name = name;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.hasSatellites = hasSatellites;
        this.isStar = isStar;
    }


    int getDistanceToEarth() {
        int distanceFromSunToEarth = 149500000;
        return Math.abs(this.getDistanceToSun() - distanceFromSunToEarth);
    }

    void convertToStar() {
        System.out.println(this.getName() + " covert to star in progress. Please wait a little.");
        this.setStar();
    }


    String getName() {
        return name;
    }

    double getDiameter() {
        return diameter;
    }

    int getDistanceToSun() {
        return distanceToSun;
    }

    boolean getSatellites() {
        return hasSatellites;
    }

    boolean getStar() {
        return isStar;
    }


    void  setStar() {
        isStar = true;
    }

}
