package ec.edu.epn;

public class Calculator {
    private float ans = 0;

    public int addition(int a, int b) {
        ans = a + b;
        return (int) ans;
    }

    public int subtraction(int a, int b) {
        ans = a - b;
        return (int) ans;
    }

    public int multiplication(int a, int b) {
        ans = a * b;
        return (int) ans;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        double result = (double) a / b;
        ans = (float) result;
        return result;
    }

    public void setAns(float ans) {
        this.ans = ans;
    }

    public float getAns() {
        return ans;
    }


    // Funciones trigonométricas (en grados)
    public double sinDegrees(double degrees) {
        double result = Math.sin(Math.toRadians(degrees));
        ans = (float) result;
        return result;
    }

    public double cosDegrees(double degrees) {
        double result = Math.cos(Math.toRadians(degrees));
        ans = (float) result;
        return result;
    }

    public double tanDegrees(double degrees) {
        double result = Math.tan(Math.toRadians(degrees));
        ans = (float) result;
        return result;
    }
}
