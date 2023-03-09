package student_andrejs_cekalins.lesson_7.level_1;

class WordsServiceDemo {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String words = wordService.findMostFrequentWord("Dog cat cat dog cat");;
        System.out.println(words);
    }
}

