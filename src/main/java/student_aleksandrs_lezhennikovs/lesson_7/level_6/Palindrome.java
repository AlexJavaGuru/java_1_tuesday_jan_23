package student_aleksandrs_lezhennikovs.lesson_7.level_6;

class Palindrome {

    boolean isPalindrome(String text) {
        String lowerCaseText = text.toLowerCase();
        char[] letterArray = lowerCaseText.toCharArray();
        int stringLength = letterArray.length;
        int fromEnd = stringLength - 1;
        for (int fromStart = 0; fromStart < stringLength / 2; fromStart++) {
            if (letterArray[fromStart] != letterArray[fromEnd]) {
                return false;
            }
            fromEnd--;
        }
        return true;
    }

}
