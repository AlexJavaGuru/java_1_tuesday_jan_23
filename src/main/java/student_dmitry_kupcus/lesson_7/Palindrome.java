package student_dmitry_kupcus.lesson_7;

class Palindrome {
    boolean isPalindrome(String text) {
        String toLowerCase = text.toLowerCase();
        String reversedText = new StringBuffer(toLowerCase).reverse().toString();
        return reversedText.equals(toLowerCase);
    }
}
