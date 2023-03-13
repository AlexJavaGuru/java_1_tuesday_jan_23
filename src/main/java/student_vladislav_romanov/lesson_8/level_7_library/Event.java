package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Date;

abstract class Event {

    private long id;
    private long userId;
    private long bookId;
    private Date date;

    public Event(long id, long userId, long bookId, Date date) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.date = date;
    }

    public abstract Event sending(Reader reader);
}
