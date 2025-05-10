package ec.edu.epn;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ParameterTest {

    private final Calculator c = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "-1, 4, 3",
            "0, 0, 0",
            "-3, -2, -5"
    })
    void testAddition(int a, int b, int expected) {
        assertEquals(expected, c.addition(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0.0",
            "90, 1.0",
            "180, 0.0",
            "270, -1.0"
    })
    void testSinDegrees(double degrees, double expected) {
        assertEquals(expected, c.sinDegrees(degrees), 0.0001);
    }
}
