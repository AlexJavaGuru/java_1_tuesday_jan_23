package student_oksana_tarasova.lesson_7.level_7;

class WordServiceTask13 {

    public String findMostFrequentWord(String text) {
        WordServiceTask13 wordService = new WordServiceTask13();
        String[] words = wordService.textAsAnArray(text);
        int[] countWords = wordService.countWords(words);
        String firstRepeatedWord = wordService.firstFrequentlyRepeatedWord(words, countWords);
        return firstRepeatedWord;
    }

    public static String[] textAsAnArray(String text) {
        String[] words = text.split(" ");
        return words;
    }

    public static int[] countWords(String[] words) {
        int[] countWord = new int[words.length];
        for (int i = 0; i < countWord.length; i++) {
            int count = 0;
            for (String word : words) {
                if (words[i].equals(word)) {
                    count++;
                }
            }
            countWord[i] = count;
        }
        return countWord;
    }

    public static String firstFrequentlyRepeatedWord(String[] words, int[] countWord) {
        int max = 0;
        for (int i = 0; i < countWord.length; i++) {
            if (countWord[i] > max) {
                max = i;
            }
        }
        return words[max];
    }
}
