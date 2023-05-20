package student_julija_raudive.lesson_12.level_1;

 class ExceptionDemo extends Exception {


     ExceptionDemo(){
         super();
     }

     ExceptionDemo(String message){
         super(message);
     }

     ExceptionDemo(String message, Throwable cause){
         super(message, cause);
     }

     protected  ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
         super(message, cause, enableSuppression, writableStackTrace);
     }

     ExceptionDemo(Throwable cause){
         super(cause);
     }


}
