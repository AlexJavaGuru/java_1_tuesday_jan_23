package student_oksana_tarasova.lesson_8.level_3;

class Fish extends Vertebrates {
    String fins;

    public Fish(String view, String habitat, int maxSpeed, boolean nutrition, String fins) {
        super(view, habitat, maxSpeed, nutrition);
        this.fins = fins;
    }

    @Override
    void movement() {
        System.out.println("I swim");
    }
}
