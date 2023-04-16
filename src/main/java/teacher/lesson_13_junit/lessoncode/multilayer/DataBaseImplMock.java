package teacher.lesson_13_junit.lessoncode.multilayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataBaseImplMock implements DataBase {

    private boolean isSaveWasTriggered;
    private Integer saveInputValue;

    private boolean isReadWasTriggered;
    private Integer readInputValue;

    private boolean isGetAllItemsWasTriggered;

    public void save(Integer data) {
        isSaveWasTriggered = true;
        saveInputValue = data;
    }

    public Optional<Integer> read(Integer data) {
        isReadWasTriggered = true;
        readInputValue = data;
        return Optional.ofNullable(data);
    }

    public List<Integer> getAllItems() {
        isGetAllItemsWasTriggered = true;
        return new ArrayList<>();
    }

    public boolean isSaveWasTriggered() {
        return isSaveWasTriggered;
    }

    public Integer getSaveInputValue() {
        return saveInputValue;
    }

    public boolean isReadWasTriggered() {
        return isReadWasTriggered;
    }

    public Integer getReadInputValue() {
        return readInputValue;
    }

    public boolean isGetAllItemsWasTriggered() {
        return isGetAllItemsWasTriggered;
    }
}
