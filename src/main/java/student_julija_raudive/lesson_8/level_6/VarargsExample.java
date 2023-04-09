package student_julija_raudive.lesson_8.level_6;

class VarargsExample {

    public void printVarargs(int... a) {

        System.out.println("Number of arguments: " +a.length);
        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}


