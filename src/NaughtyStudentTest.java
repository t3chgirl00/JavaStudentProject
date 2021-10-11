import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaughtyStudentTest {
    NaughtyStudent testNaughtyStudent;
    List<Double> testNaughtyGrade = new ArrayList<>();

    @BeforeEach
    void setUp() {
        testNaughtyGrade.add(67.8);
        testNaughtyGrade.add(89.7);
        testNaughtyStudent = new NaughtyStudent(testNaughtyGrade);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAverageGrade() {
        assertEquals(86.625, testNaughtyStudent.getInflatedAverages());
    }

    @Test
    void inflatedGrades() {
        assertEquals(Arrays.asList(74.58, 98.67), testNaughtyStudent.inflatedGrades());
    }
}