package student_anastasiia_bokareva.lesson7.level6;

public class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo){
        ArrayCopy copy = new ArrayCopy();
        int counter = copy.counter(in,numberFrom,numberTo);
        int [] arrayTwo = new int[counter];
        int number;
        int lenght=0;
        for (int i = 0; i< in.length;i++){
            number=in[i];
            if ((number<=numberTo)&&(numberFrom<=number)){
                arrayTwo[lenght]=number;
                lenght++;
            }
        }
        return arrayTwo;
    }

    int counter (int in[], int numberFrom, int numberTo){
        int lenght=0;
        for (int i=0; i< in.length; i++){
            if ((in[i]<=numberTo)&&(numberFrom<=in[i])){
                lenght++;
            }
        }
       return lenght;
    }
}
