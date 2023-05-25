package student_dmitry_kupcus.lesson_8.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 test = new DefaultConstructorV3("Dmitry Kupcus", 32, true, false);
        System.out.println("Full Name: " + test.getFullName());
        System.out.println("Age: " + test.getAge());
        System.out.println("Is female: " + test.isFemale());
        System.out.println("Is male: " + test.isMale());
    }
}
