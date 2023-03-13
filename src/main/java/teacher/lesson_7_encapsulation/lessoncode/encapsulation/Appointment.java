package teacher.lesson_7_encapsulation.lessoncode.encapsulation;

import java.util.Date;

public class Appointment {

    private Date start;
    private Date end;

    public boolean isOverlap(Appointment another) {
        return this.start == another.start && another.start.getTime() > this.end.getTime();
    }
}


/*

appointmentOne.isOverlap(oppointmentTwo);
 */