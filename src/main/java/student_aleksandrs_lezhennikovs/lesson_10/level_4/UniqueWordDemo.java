package student_aleksandrs_lezhennikovs.lesson_10.level_4;

class UniqueWordDemo {
    public static void main(String[] args) {
        String text = "Create a set containing the words in a text [closed]";
        UniqueWordFinder checkApp = new UniqueWordFinder();
        System.out.println(checkApp.find(text));
    }
}
