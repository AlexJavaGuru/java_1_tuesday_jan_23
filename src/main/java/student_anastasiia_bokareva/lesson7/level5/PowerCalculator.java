package student_anastasiia_bokareva.lesson7.level5;

public class PowerCalculator {
    public int calculate(int number, int numberOfDegree){
        int constanta = number;
        for ( int i =2; i<= numberOfDegree; i++){
            number = number*constanta;
        }
        return number;
    }
}
