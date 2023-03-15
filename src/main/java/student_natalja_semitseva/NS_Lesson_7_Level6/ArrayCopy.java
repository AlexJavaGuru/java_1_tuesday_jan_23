package student_natalja_semitseva.NS_Lesson_7_Level6;


import java.util.Arrays;


public class ArrayCopy {

    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int newArrayLength = 0;//переменная,длинна массива , 0 так как не знаем какай длиной будет
        for (int i = 0; i < in.length; i++) { //Конструкция, чтобы много раз выполнять один и тот же участок кода.
            if (in[i] >= numberFrom && in[i] <= numberTo) {//условный переход
                newArrayLength++;//увеличение переменной на 1
            }
        }
        int[] resultArray = new int[newArrayLength];//это создание массива с длиной, которую мы нашли
        int j = 0;//переменная для второго цикла
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {//цикл чтобы пройтись по оригинальному массиву in
                resultArray[j] = in[i];//результат второй переменной присваевается переменной массива оригинала
                j++;//// и увеличение второй переменной на 1
            }
        }
        return resultArray;//возврат результата 2-ой переменной
    }
}