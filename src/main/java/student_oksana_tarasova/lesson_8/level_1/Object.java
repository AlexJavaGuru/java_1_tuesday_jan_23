package student_oksana_tarasova.lesson_8.level_1;

class Object {
   int age;
   double height;
   boolean hunger;
   double maxSpeed;

   public Object(int age, double height, boolean hunger, double maxSpeed) {
      this.age = age;
      this.height = height;
      this.hunger = hunger;
      this.maxSpeed = maxSpeed;
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

   public double getMaxSpeed() {
      return maxSpeed;
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

   public void setMaxSpeed(double maxSpeed) {
      this.maxSpeed = maxSpeed;
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
              ", maxSpeed=" + maxSpeed +
              '}';
   }
}

