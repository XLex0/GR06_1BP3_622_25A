package ec.edu.epn;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Código modificado: operaciones con radianes ===");

        try {
            int resultado = calculator.addition(5, 3);
            System.out.println("Resultado de la suma: " + resultado);

            double sinRes = calculator.sin(Math.PI / 2);  // sin(π/2) = 1
            System.out.println("Resultado de sin(π/2): " + sinRes);

            double cosRes = calculator.cos(Math.PI);      // cos(π) = -1
            System.out.println("Resultado de cos(π): " + cosRes);

        } catch (Exception e) {
            System.out.println("Ocurrió un error al realizar la operación: " + e.getMessage());
        }
    }
}
