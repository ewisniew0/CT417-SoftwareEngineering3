package assignment1package;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class studentTest {

    @Test
    void getUsername() {
        student exampleStudent;
        exampleStudent = new student("John", 21, LocalDate.of(2000, 12, 31), 111111111, "BCT", new String[]{"CT100", "CT200"});

        assertEquals(exampleStudent.getName() + exampleStudent.getAge(),exampleStudent.getUsername());
    }
}