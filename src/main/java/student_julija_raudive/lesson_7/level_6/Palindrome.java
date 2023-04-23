package student_julija_raudive.lesson_7.level_6;

import java.util.ArrayList;
import java.util.Arrays;

class Palindrome {

    public boolean isPalindrome(String text) {

       text = modifyText(text);
       ArrayList<String> listOfSymbols =createAnArrayListFromText(text);
       int counter = checkEverySymbol(listOfSymbols);
       return IsPalindrome(counter, listOfSymbols);
    }

    public String modifyText(String text){
        text = text.toLowerCase();
        text = text.replaceAll(" ", "");
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        return text;
    }

    public ArrayList createAnArrayListFromText(String text){
        String[] splitText = text.split("");
        ArrayList<String> listOfSymbols = new ArrayList<String>(Arrays.asList(splitText));
        return listOfSymbols;
    }

    public int checkEverySymbol(ArrayList listOfSymbols){
        int counter = 0;
        for (int i = 0; i < (listOfSymbols.size()/2); i++) {
            boolean compare = listOfSymbols.get(i).equals(listOfSymbols.get(listOfSymbols.size() - 1 - i));
            if (compare) {
                counter += 1;
            }
        }
        return counter;
    }

    public boolean IsPalindrome(int counter, ArrayList listOfSymbols ){
        if (counter == (listOfSymbols.size() / 2)) {
            return true;
        } else return false;
    }
}
