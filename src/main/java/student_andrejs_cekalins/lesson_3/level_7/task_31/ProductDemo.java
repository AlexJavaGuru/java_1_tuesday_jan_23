package student_andrejs_cekalins.lesson_3.level_7.task_31;

class ProductDemo {
    public static void main(String[] args) {
        Product lamp = new Product("TET", 25,10);
        lamp.regularPrice();
        lamp.discount();
        lamp.printInformation();
    }
}
