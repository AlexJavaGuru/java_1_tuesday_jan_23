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
    void revert(int[]array){
        int arrayLength = array.length-1;
        int revertedArray;
        for (int i=0;i<arrayLength/2;i++){
            revertedArray=array[i];
            array[i]=array[arrayLength];
            array[arrayLength]=revertedArray;
            arrayLength--;
        }
    }
    void sort (int[] array){
        int arrayLength = array.length-1;
        int sortedArray=array[0];
        int saveNumber;
        for (int i=1;i<arrayLength;i++){
            if (sortedArray>array[i]) {
                saveNumber=array[i];
                array[i]=sortedArray;
                array[i-1]=saveNumber;
                sortedArray=array[i];
            } else {
                sortedArray=array[i];
            }
        }
    }
}
