package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_1_intern;


class Robot {
    private String name;

    Robot (String name) {
      this.name = name;
    }

        public void sayHello() {
    System.out.println("Hello");
    }
        public void sayYourName() {
    System.out.println("My name is " + this.name);
    }
    public String getName() {

        return this.name;
        }
    }
