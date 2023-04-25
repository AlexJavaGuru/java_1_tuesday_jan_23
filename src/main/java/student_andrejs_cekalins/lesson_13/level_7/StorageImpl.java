package student_andrejs_cekalins.lesson_13.level_7;

public class StorageImpl implements Storage  {
    private int totalSize;
    StorageImpl(int totalSize) {
        this.totalSize =totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalSize() {
        return totalSize;
    }

    @Override
    public Directory rootDirectory() {
        return null;
    }
}

