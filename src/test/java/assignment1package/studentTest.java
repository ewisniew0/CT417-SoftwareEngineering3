package assignment1package;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @Test
    void getUsername() {
        course_program course = new course_program("Computer Science & IT", new DateTime(2020, 8, 1, 8, 0), new DateTime(2020, 8, 1, 8, 0));
        student exampleStudent[]={new student("John", 21, LocalDate.of(2000, 12, 31), 111111111, course, new module[]{})};

        course.setEnrolled_students(exampleStudent);

        assertEquals(exampleStudent[0].getName() + exampleStudent[0].getAge(), exampleStudent[0].getUsername());
    }
}