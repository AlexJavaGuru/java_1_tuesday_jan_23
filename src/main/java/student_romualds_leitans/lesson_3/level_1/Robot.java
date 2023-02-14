package student_romualds_leitans.lesson_3.level_1;

class Robot {
    String name;

    public  Robot (String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My Name is:" + this.name );
    }
}

