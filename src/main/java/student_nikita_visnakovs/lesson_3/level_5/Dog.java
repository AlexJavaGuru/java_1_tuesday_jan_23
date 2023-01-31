package student_nikita_visnakovs.lesson_3.level_5;

public class Dog {

    private String dogName;
    private int dogAge;
    private String dogColour;
    private String newDogColor;


    public Dog(String dogName, int dogAge, String dogColour, String newDogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
        this.newDogColor = newDogColor;

    }

    public void voice() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(dogName);
        }

    }

    public void dogAge() {
        System.out.println("Dog age is - " + dogAge);
    }

    public void happyBirthday() {
        System.out.println("Happy Birthday ," + dogName);

    }

    public int setDogAge() {
        this.dogAge = dogAge + 1;
        return this.dogAge;
    }

    public String DogColour() {
        System.out.println("Dog colour is - " + dogColour);
        return this.dogColour;
    }

    public String setNewDogColor() {
        this.dogColour = newDogColor;
        return this.DogColour();
    }


}
