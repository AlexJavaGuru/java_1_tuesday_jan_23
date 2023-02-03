package student_andrejs_cekalins.lesson_3.level_7.task_29;

class CarDemo {
    public static void main(String[] args) {
        Car car1 =new Car("Volvo", "blue","V60");
        Car car2 =new Car("BMW", "red","320",false);

        String carBrand  = car1.getCarBrand();
        System.out.println("Car brand is: " + carBrand );
        String carColor  = car1.getCarColor();
        System.out.println("Car is: " + carColor);
        String carModel  = car1.getCarModel();
        System.out.println("Model is: " + carModel);
        Boolean isCarNew  = car1.isNew();
        System.out.println("Is car new: " + isCarNew);
        car1.carEngine();

        System.out.println();
        String car2CarBrand  = car2.getCarBrand();
        System.out.println("Car brand is: " + car2CarBrand);
        String car2CarColor  = car2.getCarColor();
        System.out.println("Car is: " + car2CarColor);
        String car2CarModel  = car2.getCarModel();
        System.out.println("Model is: " + car2CarModel);
        Boolean isCar2CarNew  = car2.isNew();
        System.out.println("Is car new: " + isCar2CarNew);
        car2.changeModel("328");
        System.out.println("Now new model is: " +car2.model);


    }
}
