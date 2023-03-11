package student_vladislav_romanov.lesson_7.level_6;

class Palindrome {

    boolean isPalindrome(String text) {
        String[] string = cleanString(text).toLowerCase().split("");
        for (int i = 0, j = string.length - 1; i < string.length - 1; i++, j--) {
            if (!string[i].equals(string[j])) {
                return false;
            }
        }
        return true;
    }

    private String cleanString(String text) {
        return text.replaceAll("\\s|\\.|,|;", "");
    }

}
