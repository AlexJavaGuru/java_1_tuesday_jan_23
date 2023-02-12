package student_vladislav_romanov.lesson_3.level_7;

class PlanetDemo {

    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 12.756,149500000, true, false);
        Planet mercury = new Planet("Mercury", 4.87,58000000, false, false);
        Planet venus = new Planet("Venus", 12.1,108000000, false, false);
        Planet mars = new Planet("Mars", 6.67,228000000, true, false);
        Planet jupiter = new Planet("Jupiter", 143.76,77800000, true, false);
        Planet sun = new Planet("Sun", 1392,0, true, true);

        System.out.println(earth.getName() + "'s diameter is " + earth.getDiameter() + "k kilometers.");

        System.out.println("Is " + sun.getName() + " star? " + sun.getStar());

        System.out.println(venus.getName() + " isn't a star. Let's convert it!");
        venus.convertToStar();
        System.out.println(venus.getName() + " is a star now!");

        System.out.println("The shortest distance from " + jupiter.getName() + " to Earth is " + jupiter.getDistanceToEarth() + " kilometers");
        System.out.println("Let's convert it to star too!");
        jupiter.convertToStar();
        System.out.println(jupiter.getName() + " is a star now too!");

        System.out.println(mars.getName() + " has a satellites? " + mars.getSatellites());
        System.out.println(mercury.getName() + " has a satellites? " + mercury.getSatellites());
    }

}
