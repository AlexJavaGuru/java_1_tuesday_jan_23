package student_anastasiia_bokareva.lesson6.level3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.isNumberInArray();
        test.isNotNumberInArray();
        test.countRepeats();
        test.changeFirstEqualToFindNumber();
        test.changeAnyNumber();
        test.revertedArray();
        test.sortSmallToBig();


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
    public void changeFirstEqualToFindNumber() {
        ArrayService arr = new ArrayService();
        int[] array ={3,2,1,3};
        int expectResult = 4;
        int realResult=arr.firstEqalToFindNumberChange(array,4,3);;
        checkResultInt(expectResult,realResult,"Change first equal find number");

    }
    public void changeAnyNumber(){
        ArrayService arr = new ArrayService();
        int[]array ={2,3,4,2};
        int[] expextedResult ={6,3,4,6};
        int[] realResult = arr.changeAllEqualToFindNumber(array,2,6);
        checkResultArray(expextedResult,realResult,"Change all numbers which are equal to find number");

    }
    public void revertedArray() {
        ArrayService arr = new ArrayService();
        boolean result =true;
        int[] array = {3,4,5};
        int[] expectedArray = {5,4,3};
        arr.temp(array);
        for (int i = 0; i < array.length; i++) {
            if ((result = true) && (array[i] == expectedArray[i])) {
                result = true;
            }
        }
        checkResult(result,true,"Revert test");
    }
    public void sortSmallToBig(){
        ArrayService arr = new ArrayService();
        int[] array ={3,2,4};
        int[] expectedArray ={2,3,4};
        arr.sort(array);
        for (int i =0;i<array.length;i++){
            checkResultInt(array[i],expectedArray[i],"Sort test ");
        }
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
    public void checkResultArray (int[] expectedResult, int[] realResult, String nameTest){
        if (Arrays.equals(expectedResult,realResult)){
            System.out.println("test "+nameTest+" ok");
        } else {
            System.out.println("test "+ nameTest + " fail");
        }
    }
}
