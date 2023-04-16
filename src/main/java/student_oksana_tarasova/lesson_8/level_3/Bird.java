package student_oksana_tarasova.lesson_8.level_3;

class Bird extends Vertebrates {

    String wings;

    public Bird(String view, String habitat, int maxSpeed, boolean nutrition, String wings) {
        super(view, habitat, maxSpeed, nutrition);
        this.wings = wings;
    }

    @Override
    void movement() {
        System.out.println("I fly");
    }
}
