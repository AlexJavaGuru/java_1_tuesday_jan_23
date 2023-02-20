package student_daniels_belejuns.lesson_4.level_7;

public class LeapYearTest {
public static void main(String[]args){
    leapYearTest();
    nonLeapYearTest();
}
static void leapYearTest(){
    LeapYear year = new LeapYear();
    boolean expected = true;
    boolean actual = year.isLeapYear(2024);
    if(expected == actual){
        System.out.println("Leap year passed");
    }else {
        System.out.println("Leap year failed");
    }
}
static void nonLeapYearTest(){
    LeapYear year = new LeapYear();
    boolean expected = false;
    boolean actual = year.isLeapYear(2000);
    if(expected == actual){
        System.out.println("non Leap year passed");
    }else {
        System.out.println("non Leap year failed");
    }
}
}
