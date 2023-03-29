package student_oksana_tarasova.lesson_8.level_3;

abstract class Vertebrates {
     String view;
     String habitat;
     int maxSpeed;
     boolean nutrition;

    public Vertebrates(String view, String habitat, int maxSpeed, boolean nutrition) {
        this.view = view;
        this.habitat = habitat;
        this.maxSpeed = maxSpeed;
        this.nutrition = nutrition;
    }

    abstract void movement();
}
