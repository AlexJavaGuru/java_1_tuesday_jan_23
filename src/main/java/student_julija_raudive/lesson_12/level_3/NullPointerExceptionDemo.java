package student_julija_raudive.lesson_12.level_3;

class NullPointerExceptionDemo {


    public static void main(String[] args) {

        myMethod(null);

    }

    public static void myMethod(NullPointerExceptionDemo obj) {
        System.out.println(obj.toString());
    }

}

//NullPointerException thrown when an application attempts to use null in a case where an object is required. These include:
//Calling the instance method of a null object.
//Accessing or modifying the field of a null object.
//Taking the length of null as if it were an array.
//Accessing or modifying the slots of null as if it were an array.
//Throwing null as if it were a Throwable value.
