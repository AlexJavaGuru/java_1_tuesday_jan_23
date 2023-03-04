package student_andrejs_cekalins.lesson_7.level_1.Task_1;

import java.util.Scanner;

class WordService {

    public String findMostFrequentWord(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String input = scanner.nextLine();
        System.out.println("Most frequent word is: ");
        input = input.toLowerCase();
        String[] words = input.split(" ");
        int count;
        int maxCount = 0;
        text = "";
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > maxCount && words[i] != "0") {
                text = words[i];
                maxCount = count;
            }
        }
        return text;
    }
}


