package student_anastasiia_bokareva.lesson6.level3;

public class ArrayService {
    boolean isNumberHere (int[] array,int findNumber){
        for (int number:array){
            if (findNumber==number){
                return true;
            }
        }
        return false;
    }
    int countNumbers (int[] array, int findNumber){
        int counter=0;
        for (int i =0; i<array.length;i++){
            if (findNumber==array[i]){
                counter=counter+1;
            }
        }
        return counter;
    }
    int firstNumber (int[] array, int changedNumber ){
        array[0]=changedNumber;
        return array[0];
    }
    int changeNumber (int[] array, int arrayLength, int changedNumber ){
        array[arrayLength]=changedNumber;
        return array[arrayLength];
    }
}
