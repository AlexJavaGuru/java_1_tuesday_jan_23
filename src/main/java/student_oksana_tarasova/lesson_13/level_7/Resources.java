package student_oksana_tarasova.lesson_13.level_7;

class Resources {

    File file;
    Directory directory;

    public Resources(File file) {
        this.file = file;
    }

    public Resources(Directory directory) {
        this.directory = directory;
    }

    @Override
    public String toString() {
        String print = "";
        if(file != null) {
            print = "Resources{" +
                    "file=" + file +
                    '}';
        }
        if (directory != null) {
            print =  "Resources{" +
                    "directory=" + directory +
                    '}';
        }
        return print;
    }
}
