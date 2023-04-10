package student_aleksandrs_lezhennikovs.lesson_10.level_4;

class UniqueWordsDemo {
    public static void main(String[] args) {
        String text = "Create a set containing the words in a text [closed], containing the words in a text [closed]";
        UniqueWordsFinder checkApp = new UniqueWordsFinder();
        System.out.println(checkApp.find(text));
    }
}
