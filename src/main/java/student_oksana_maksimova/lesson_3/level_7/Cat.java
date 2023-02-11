package student_oksana_maksimova.lesson_3.level_7;

class Cat {

    String name;
    boolean sleep;

    boolean hungry;

    Cat(String catName) {

        name = catName;
    }
    void name(){

        System.out.println("Meow name is " + name);
    }

   boolean isSleep() {
        this.sleep = true;

        System.out.println("Are you sleeping? " + this.sleep +" Zzzz...");
        return sleep;
    }

    boolean isHungry() {
        this.hungry = false;

        System.out.println("Are you hungry? " + this.hungry +" Meow!");
        return hungry;
    }
}
