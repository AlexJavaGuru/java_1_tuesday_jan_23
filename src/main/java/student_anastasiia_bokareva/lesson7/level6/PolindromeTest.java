package student_anastasiia_bokareva.lesson7.level6;

public class PolindromeTest {
    public static void main(String[] args) {
        PolindromeTest test = new PolindromeTest();
        test.isPolindrome();
        test.isPolindromeWithOut();
        test.isNotPolindrome();

    }
    public void isPolindrome(){
        String text ="lEveL";
        Polindrome polindrome = new Polindrome();
        boolean result = polindrome.isPalindrome(text);
        boolean expectedResult = true;
        check(result,expectedResult," is polindrome ");
    }
    public void isPolindromeWithOut(){
        String text ="level";
        Polindrome polindrome = new Polindrome();
        boolean result = polindrome.isPalindrome(text);
        boolean expectedResult = true;
        check(result,expectedResult," is polindrome without");
    }

    public void isNotPolindrome(){
        String text ="levasl";
        Polindrome polindrome = new Polindrome();
        boolean result = polindrome.isPalindrome(text);
        boolean expectedResult = false;
        check(result,expectedResult," is not polindrome ");
    }

    public void check (boolean realResult, boolean expectedResult, String textName){
        if (realResult==expectedResult){
            System.out.println("Test " + textName + " is ok");
        } else {
            System.out.println("test "+ textName+ " is fail");
        }
    }
}
