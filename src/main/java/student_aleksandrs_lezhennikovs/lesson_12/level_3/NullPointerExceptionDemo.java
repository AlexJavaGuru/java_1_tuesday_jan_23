package student_aleksandrs_lezhennikovs.lesson_12.level_3;

class NullPointerExceptionDemo {
    private static Product someProduct;

    public static void main(String[] args) {

        //NullPointerException appears when we try to call method on a non-existing object
        someProduct.calculateSomeThing();
    }
}
