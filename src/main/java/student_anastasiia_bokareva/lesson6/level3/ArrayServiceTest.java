package student_anastasiia_bokareva.lesson6.level3;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.isNumberInArray();
        test.isNotNumberInArray();
        test.countRepeats();
        test.changeFirstNumber();
        test.changeAnyNumber();


    }
    public void isNumberInArray (){
        ArrayService arr = new ArrayService();
        int[] array = {3,4,5,4};
        boolean expectedResukt = true;
        boolean realResult = arr.isNumberHere(array,3);
        checkResult(expectedResukt,realResult,"Is Number in Array ");
    }
    public void isNotNumberInArray (){
        ArrayService arr = new ArrayService();
        int[] array = {3,4,5,4};
        boolean expectedResukt = false;
        boolean realResult = arr.isNumberHere(array,6);
        checkResult(!expectedResukt,!realResult,"Is not Number in Array ");
    }
    public void countRepeats (){
        ArrayService arr = new ArrayService();
        int[] array = {3,3,2,3};
        int expectedResult = 3;
        int realResult = arr.countNumbers(array,3);
        checkResultInt(expectedResult,realResult,"Count repeats");

    }
    public void changeFirstNumber() {
        ArrayService arr = new ArrayService();
        int[] array ={3,2,1,3};
        array[0]= arr.firstNumber(array,4);
        int expectResult = 4;
        int realResult=array[0];
        checkResultInt(expectResult,realResult,"Change first number");

    }
    public void changeAnyNumber(){
        ArrayService arr = new ArrayService();
        int[]array ={2,3,4};
        int expextedResult =6;
        int realResult = arr.changeNumber(array,2,6);
        checkResultInt(expextedResult,realResult,"Change any number");

    }




    public void checkResult (boolean expectedResult, boolean realResult, String nameTest){
        if (expectedResult==realResult){
            System.out.println("test "+nameTest+" ok");
        } else {
            System.out.println("test "+ nameTest + " fail");
        }
    }
    public void checkResultInt (int expectedResult, int realResult, String nameTest){
        if (expectedResult==realResult){
            System.out.println("test "+nameTest+" ok");
        } else {
            System.out.println("test "+ nameTest + " fail");
        }
    }
}
