package ec.edu.epn;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator c = null;

    @BeforeAll
    public static void setUp() {
        c = new Calculator();
    }

    @Test
    public void given_two_integer_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
    }

    @Test
    public void given_two_integer_when_subtraction_then_ok() {
        assertEquals(2, c.subtraction(8, 6));
    }

    @Test
    public void given_two_integer_when_division_by_zero_then_exception() {
        assertThrows(ArithmeticException.class, () -> {
            c.division(10, 0);
        });
    }

    @Test
    public void given_two_integer_when_division_then_ok() {
        assertEquals(5, c.division(10, 2));
    }

    @Test
    public void given_two_integer_when_multiplication_then_ok() {
        assertEquals(8, c.multiplication(4, 2));
    }

    // ------------------ TRIGONOMETRIC TESTS ------------------

    @Test
    public void given_zero_radians_when_sin_then_ok() {
        assertEquals(0.0, c.sin(0), 0.0001);
    }

    @Test
    public void given_pi_over_two_radians_when_sin_then_ok() {
        assertEquals(1.0, c.sin(Math.PI / 2), 0.0001);
    }

    @Test
    public void given_zero_radians_when_cos_then_ok() {
        assertEquals(1.0, c.cos(0), 0.0001);
    }

    @Test
    public void given_pi_radians_when_cos_then_ok() {
        assertEquals(-1.0, c.cos(Math.PI), 0.0001);
    }

    @Test
    public void given_zero_radians_when_tan_then_ok() {
        assertEquals(0.0, c.tan(0), 0.0001);
    }

    @Test
    public void given_pi_over_four_radians_when_tan_then_ok() {
        assertEquals(1.0, c.tan(Math.PI / 4), 0.0001);
    }

    // En grados (usando funciones que convierten internamente)
    @Test
    public void given_90_degrees_when_tanDegrees_then_large_result() {
        assertTrue(Double.isInfinite(c.tanDegrees(90)) || Math.abs(c.tanDegrees(90)) > 1e10);
    }

    @Test
    public void given_0_degrees_when_sinDegrees_then_ok() {
        assertEquals(0.0, c.sinDegrees(0), 0.0001);
    }

    @Test
    public void given_90_degrees_when_sinDegrees_then_ok() {
        assertEquals(1.0, c.sinDegrees(90), 0.0001);
    }

    @Test
    public void given_180_degrees_when_cosDegrees_then_ok() {
        assertEquals(-1.0, c.cosDegrees(180), 0.0001);
    }

    @AfterAll
    public static void tearDown() {
        c.setAns(0);
        c = null;
    }
}
