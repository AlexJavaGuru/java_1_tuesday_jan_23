package student_natalija_rasponomarjova.lesson_3.level_7;


class CatDemo {
    public static void main(String[] args) {

        Cat exCat = new Cat("Bagira", 14, 5);
        Cat myCat = new Cat("Dusja", 3, 4.5);
        Cat friendCat = new Cat("Rizhik", 10, 6);

        exCat.getName();
        exCat.getAge();
        exCat.getWeight();


        System.out.println();

        myCat.getName();
        myCat.getAge();
        myCat.getWeight();

        System.out.println();

        friendCat.getName();
        friendCat.getAge();
        friendCat.getWeight();

    }
}
