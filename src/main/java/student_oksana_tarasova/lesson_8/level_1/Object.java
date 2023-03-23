package student_oksana_tarasova.lesson_8.level_1;

class Object {
   int age;
   double height;
   boolean hunger;


   public Object(int age, double height, boolean hunger) {
      this.age = age;
      this.height = height;
      this.hunger = hunger;

   }

   public int getAge() {
      return age;
   }

   public double getHeight() {
      return height;
   }

   public boolean isHunger() {
      return hunger;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public void setHunger(boolean hunger) {
      this.hunger = hunger;
   }

   public void age() {
      this.age++;
   }

   @Override
   public String toString() {
      return "Object{" +
              "age=" + age +
              ", height=" + height +
              ", hunger=" + hunger +
              '}';
   }
}

