import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterTest {
    List<INameable> testRegister = new ArrayList<>();
    List<Double> testGrade = List.of(34.6, 78.9, 67.8, 65.7);

    @BeforeEach
    void setUp() {
        testRegister.add(new Student(testGrade, "testName", Level.LEVEL2));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetRegister() {
        assertEquals("[testName's grades = [34.6, 78.9, 67.8, 65.7]\n]", testRegister.toString());
    }

}