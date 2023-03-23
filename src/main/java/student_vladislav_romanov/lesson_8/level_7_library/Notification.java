package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Date;

class Notification extends Event {

    private String type;

    public Notification(long id, long userId, long bookId, Date date, String type) {
        super(id, userId, bookId, date);
        this.type = type;
    }

    @Override
    public Event sending(Reader reader) {
        return null;
    }
}
