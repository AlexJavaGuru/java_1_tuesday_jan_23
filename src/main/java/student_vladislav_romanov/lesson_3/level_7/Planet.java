package student_vladislav_romanov.lesson_3.level_7;

class Planet {

    private String name;
    private double diameter;
    private int distanceToSolar;
    private boolean hasSatellites;
    private boolean isStar;


    Planet(String name, double diameter, int distanceToSolar, boolean hasSatellites, boolean isStar) {
        this.setName(name);
        this.setDiameter(diameter);
        this.setDistanceToSolar(distanceToSolar);
        this.setSatellites(hasSatellites);
        this.setStar(isStar);
    }


    int getDistanceToEarth() {
        int distanceFromSolarToEarth = 149500000;
        return Math.abs(this.getDistanceToSolar() - distanceFromSolarToEarth);
    }

    void convertToStar() {
        System.out.println(this.getName() + " covert to star in progress. Please wait a little.");
        this.setStar(true);
    }


    String getName() {
        return this.name;
    }

    double getDiameter() {
        return this.diameter;
    }

    int getDistanceToSolar() {
        return this.distanceToSolar;
    }

    boolean getSatellites() {
        return this.hasSatellites;
    }

    boolean getStar() {
        return this.isStar;
    }


    void setName(String name) {
        this.name = name;
    }

    void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    void setDistanceToSolar(int distanceToSolar) {
        this.distanceToSolar = distanceToSolar;
    }

    void setSatellites(boolean hasSatellites) {
        this.hasSatellites = hasSatellites;
    }

    void  setStar(boolean isStar) {
        this.isStar = isStar;
    }

}
