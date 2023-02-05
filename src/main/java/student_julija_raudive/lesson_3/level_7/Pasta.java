package student_julija_raudive.lesson_3.level_7;

 class Pasta {

    String type;
    int weightInGrams;
    int timeToCook;

    Pasta (String type, int weightInGrams, int timeToCook){
        this.type = type;
        this.weightInGrams = weightInGrams;
        this.timeToCook = timeToCook;
    }

    void PastaInfo(){
        System.out.println(type + "\nWeight: " + weightInGrams + " g" + "\nTime to cook: " + timeToCook + " min" + "\n");
    }

      void setTimeToCook(int timeToCook) {
         this.timeToCook = timeToCook;
     }

      void setWeightInGrams(int weightInGrams) {
         this.weightInGrams = weightInGrams;
     }

     void Cook(int time){

         if (time == timeToCook){
             System.out.println("Your " + type + " is cooked. Bon Appetit!");
         }
         else if(time < timeToCook){
             System.out.println("Your " + type + " is not ready!");
         }
         else{
             System.out.println("Your " + type + " is overcooked. Throw it away!");
         }
     }


 }
