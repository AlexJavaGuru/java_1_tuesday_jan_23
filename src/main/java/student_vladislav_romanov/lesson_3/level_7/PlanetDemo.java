package student_vladislav_romanov.lesson_3.level_7;

class PlanetDemo {

    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth", 12.756,149500000, true, false);
        Planet planet2 = new Planet("Mercury", 4.87,58000000, false, false);
        Planet planet3 = new Planet("Venus", 12.1,108000000, false, false);
        Planet planet4 = new Planet("Mars", 6.67,228000000, true, false);
        Planet planet5 = new Planet("Jupiter", 143.76,77800000, true, false);
        Planet planet6 = new Planet("Solar", 1392,0, true, true);

        System.out.println(planet1.getName() + "'s diameter is " + planet1.getDiameter() + "k kilometers.");

        System.out.println("Is " + planet6.getName() + " star? " + planet6.getStar());

        System.out.println(planet3.getName() + " isn't a star. Let's convert it!");
        planet3.convertToStar();
        System.out.println(planet3.getName() + " is a star now!");

        System.out.println(planet5.getName() + " is a " + planet5.getDistanceToEarth() + "k kilometers far from Earth");
        System.out.println("Let's convert it to star too!");
        planet5.convertToStar();
        System.out.println(planet5.getName() + " is a star now too!");

        System.out.println(planet4.getName() + " has a satellites? " + planet4.getSatellites());
        System.out.println(planet2.getName() + " has a satellites? " + planet2.getSatellites());
    }

}
