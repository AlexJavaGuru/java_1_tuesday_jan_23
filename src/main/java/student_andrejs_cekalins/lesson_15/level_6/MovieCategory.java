package student_andrejs_cekalins.lesson_15.level_6;

public enum MovieCategory {
    REGULAR,
    NEW_RELEASE,
    CHILDREN;

    @Override
    public String toString() {
        return "MovieCategory{" +
                ", REGULAR ='" + REGULAR + '\'' +
                ", NEW_RELEASE ='" + NEW_RELEASE + '\'' +
                ", CHILDREN =" + CHILDREN +
                '}';
    }
}
