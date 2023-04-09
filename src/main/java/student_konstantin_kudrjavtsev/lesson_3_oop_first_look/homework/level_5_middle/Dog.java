package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_5_middle;

class Dog {
    private String name;
    private String color;
    int age;

    Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void voice() {

        System.out.println("afff");
    }

    public void happyBirthday() {
        System.out.println("Rex celebrates a birthday");
    }

    public void changeColor(String newColor) {
        color = newColor;
    }
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }
        public int getAge () {
            return this.age;
        }
    }