package student_oksana_tarasova.lesson_8.level_3;

class Animal extends Vertebrates {
    String legs;

    public Animal(String view, String habitat, int maxSpeed, boolean nutrition, String legs) {
        super(view, habitat, maxSpeed, nutrition);
        this.legs = legs;
    }


    @Override
    void movement() {
       System.out.println("I walk");
    }
}
