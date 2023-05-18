package student_aleksandrs_lezhennikovs.lesson_13.level_7;

class File extends Resource {
    private String extension;

    public File(String name, int size, String extension) {
        super(name, size);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
