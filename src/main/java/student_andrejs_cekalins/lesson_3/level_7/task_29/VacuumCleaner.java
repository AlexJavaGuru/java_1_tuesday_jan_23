package student_andrejs_cekalins.lesson_3.level_7.task_29;

class VacuumCleaner {

    private String size;
    private String color;
    private int speed;
    boolean isWorking;

    VacuumCleaner(String sizeVC, String colorVC, int speedVC, boolean isWorking) {
        this.size = sizeVC;
        this.color = colorVC;
        this.speed = speedVC;
        this.isWorking =isWorking;
    }

    String getSizeVC(){
        return this.size;
    }

    String getColorVC(){
        return this.color;
    }

    int getSpeedVC(){
        return this.speed;
    }

    void cleaning(){
        isWorking = true;
        System.out.println("Is cleaning");
    }
    void engineWorking(){System.out.println("Zzzzzzzz");}

}
