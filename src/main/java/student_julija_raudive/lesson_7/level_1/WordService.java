package student_julija_raudive.lesson_7.level_1;



class WordService {

    public String findMostFrequentWord(String text) {

        return findMostFrequentWordFromArray(splitText(text));

    }

    public String[] splitText(String text) {

        text = text.toLowerCase();
        text =text.replaceAll("[^a-zA-Z0-9]", " ");
        String[] arr;
        arr = text.split(" ");
        return arr;

    }

    public String findMostFrequentWordFromArray(String[] arr) {

        String word = null;
        int counterResult = 0;

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }

            if (counterResult < counter) {
                counterResult = counter;
                word = arr[i];
            }
        }
        return word;

    }


}
