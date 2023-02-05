package student_andrejs_cekalins.lesson_3.level_7.task_29;

class VacuumCleaner {
    private String size;
    private String color;
    private int speed;
    boolean isWorking;
    VacuumCleaner(String size, String color, int speed, boolean isWorking) {
        this.size = size;
        this.color = color;
        this.speed = speed;
        this.isWorking =isWorking;
    }
    String getSize(){
        return this.size;
    }
    String getColor(){
        return this.color;
    }
    int getSpeed(){
        return this.speed;
    }
    void cleaning() {
        isWorking = true;
        System.out.println("Is cleaning");
    }
    void engineWorking() {System.out.println("Zzzzzzzz");}
}
