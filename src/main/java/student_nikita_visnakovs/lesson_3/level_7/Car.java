package student_nikita_visnakovs.lesson_3.level_7;

public class Car {

    String colour;
    String Brand;
    String engine;

    public Car(String colour, String brand, String engine) {
        this.Brand = brand;
        this.colour = colour;
        this.engine = engine;

    }

    public void start(){
        System.out.println("Press the button to ON your engine");
        System.out.println("Engine is start");

    }

    public void stop(){
        System.out.println("Press the button to OFF your engine");
        System.out.println("Engine is stop");

    }

    public void setColour(String colour){
        System.out.println("Car colour is - " + colour);
        System.out.println("The car has been in the sun for a long time.");
    }

    public void setNewColour(String newColour){
        System.out.println("Now car colour is - " + newColour);

    }
    public void fillTheCar(){
        System.out.println("Need to fill the car");
        System.out.println("Now you don`t have a money , but full tank");
    }




}
