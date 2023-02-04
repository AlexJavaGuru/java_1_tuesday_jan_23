package teacher.lesson_3_oop_first_look.lessoncode;

public class ModelTrick {

    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik", 5, true);
        Dog bobik = new Dog("Bobik", 10);
        Dog sharik2;

        sharik2 = sharik;
//        sharik = null;
        bobik.setName("Test");

        System.out.println(sharik2.getName());

        DogShredder shredder = new DogShredder();
        shredder.destroy(sharik);

        System.out.println(sharik.getName());
    }
}
