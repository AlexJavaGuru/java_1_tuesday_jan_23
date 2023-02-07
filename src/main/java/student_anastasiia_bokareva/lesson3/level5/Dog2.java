package student_anastasiia_bokareva.lesson3.level5;

public class Dog2 {
    String name;
    int age;
    String colour;

    Dog2 (String name,int age, String colour ) {
        this.name = name;
        this.age = age;
        this.colour= colour;
    }
    void happyBirthday() {
        int newAge=age+1;
        System.out.println(newAge);
    }

    public void voice(){
        System.out.println(name+" " + age+ " "+colour);
    }


}
