package student_andrejs_cekalins.lesson_9.level_3.Task_6;

/*A functional interface can contain only one abstract method
 and it can contain any number of static and default(non-abstract) methods.
 */

@FunctionalInterface
interface Sample {
    // abstract method
    int calculate (int val);
}
