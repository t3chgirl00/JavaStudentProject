import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student testStudent;
    List<Double> testGrade = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        testGrade.add(45.6);
        testGrade.add(56.7);
        testStudent = new Student(testGrade, "Keziah", Level.LEVEL2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Student Grades = [45.6, 56.7]", testStudent.toString());
    }

    @org.junit.jupiter.api.Test
    void getAverageGrade() {
        assertEquals(51.150000000000006, testStudent.getAverageGrade());
    }
}