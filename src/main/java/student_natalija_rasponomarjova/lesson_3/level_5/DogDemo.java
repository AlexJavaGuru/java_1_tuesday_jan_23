package student_natalija_rasponomarjova.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Muhtar", 7, "Brown");
        dog.getVoice();
        dog.happyBirthday();
        dog.getVoice();
        dog.setColor("Black and white");
        dog.getVoice();
    }
}