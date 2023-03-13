package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Date;

class Ticket extends Event {

    private double amount;

    public Ticket(long id, long userId, long bookId, Date date, double amount) {
        super(id, userId, bookId, date);
        this.amount = amount;
    }

    @Override
    public Event sending(Reader reader) {
        return null;
    }
}
