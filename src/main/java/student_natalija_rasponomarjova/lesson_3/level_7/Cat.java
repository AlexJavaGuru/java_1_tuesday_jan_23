package student_natalija_rasponomarjova.lesson_3.level_7;

class Cat {

    private String name;
    private int age;
    private double weight;


  public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public String getName() {
        System.out.println("Cat name is: " + " " + name);
        return name;
    }
    public double getWeight() {
        System.out.println("Weight is: " + " " + weight + " " + "kg");
       return weight;
        }

        public int getAge () {
            System.out.println("Age is: " + " " + age + " " + "years");
            return age;
        }

    }



