package assignment1package;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class lecturerTest {

    @Test
    void getUsername() {
        lecturer exampleLecturer;
        exampleLecturer = new lecturer("John", 21, LocalDate.of(2000, 12, 31), 111111111, new String[]{"CT100", "CT200"});

        assertEquals(exampleLecturer.getName() + exampleLecturer.getAge(),exampleLecturer.getUsername());
    }
}