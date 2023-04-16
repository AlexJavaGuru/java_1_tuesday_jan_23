package student_anastasiia_bokareva.lesson6.level1;

public class NumberUtilsDemo {
    public static void main(String[] args) {
        NumberUtilsDemo test = new NumberUtilsDemo();
        test.isEvenNumber();
        test.isOddNumber();
    }
    public void isEvenNumber (){
        NumberUtils numberUtils = new NumberUtils();
        if ((2%2==0)&&(numberUtils.isEven(2))) {
            System.out.println("Test Even = ok");
        }
    }

    public void isOddNumber (){
        NumberUtils numberUtils = new NumberUtils();
        if ((3%2!=0)&&!(numberUtils.isEven(3))) {
            System.out.println("Test Odd = ok");
        }
    }
}
