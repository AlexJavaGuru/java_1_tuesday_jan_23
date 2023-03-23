package student_anastasiia_bokareva.lesson7.level6;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.array();
        test.zeroArray();
        test.zeroArrayBiggest();

    }
    public int[] array(){
        ArrayCopy copy = new ArrayCopy();
        int numberFrom = 4;
        int numberTo = 16;
        int[] arrayFirst = {3,4,5,2,1,6,7,8,16};
        int[] newArray = copy.copyInRange(arrayFirst,numberFrom,numberTo);
        int [] arrayExpected ={4,5,6,7,8,16};
        check(newArray,arrayExpected," copy Array");
        return newArray;
    }
    public int[] zeroArray(){
        ArrayCopy copy = new ArrayCopy();
        int numberFrom = 4;
        int numberTo = 16;
        int[] arrayFirst = {3,2,3,1,1,1};
        int[] newArray = copy.copyInRange(arrayFirst,numberFrom,numberTo);
        int [] arrayExpected ={};
        check(newArray,arrayExpected," zero Array");
        return newArray;
    }
    public int[] zeroArrayBiggest(){
        ArrayCopy copy = new ArrayCopy();
        int numberFrom = 4;
        int numberTo = 16;
        int[] arrayFirst = {18,20,30};
        int[] newArray = copy.copyInRange(arrayFirst,numberFrom,numberTo);
        int [] arrayExpected ={};
        check(newArray,arrayExpected," biggest numbers Array");
        return newArray;
    }

    public void check ( int[] realResult, int[] expectedResult, String testName){
        if (Arrays.equals(expectedResult, realResult)){
            System.out.println("Test "+testName+" is ok");
        } else {
            System.out.println("Test "+testName +" is fail");
        }
    }
}
