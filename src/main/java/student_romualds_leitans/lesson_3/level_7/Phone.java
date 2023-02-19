package student_romualds_leitans.lesson_3.level_7;

public class Phone {
    String name;
    String model;
    Boolean sensor;

    public Phone(String newName, String newModel, Boolean newSensor){
        this.name = newName;
        this.model = newModel;
        this.sensor = newSensor;
    }
    public void work(){
        System.out.println("Dos not work");

    }
    public void charge(){
        System.out.println("Does not charge");

    }
    public void turnon(){
        System.out.println("Does not turn on ");

    }
}
