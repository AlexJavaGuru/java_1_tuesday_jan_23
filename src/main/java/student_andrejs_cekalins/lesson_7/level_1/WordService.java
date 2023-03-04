package student_andrejs_cekalins.lesson_7.level_1;

import java.util.Scanner;

public class WordService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String input = scanner.nextLine();
        System.out.println("Most frequent word is: ");


        public void changeUpperLetters(String input); {
            input = input.toLowerCase();
        }
    }

    public String findMostFrequentWord(String text) {

        public void splitTextToWords(){
            String words[] = input.split(" ");

            int count;
            for (int i = 0; i < words.length; i++) {
                count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "0";
                    }
                }
                if (count > 1 && words[i] != "0") {
                    System.out.println(words[i]);
                }
            }
        }
        return text;
    }
}
