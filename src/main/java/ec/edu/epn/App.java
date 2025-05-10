package ec.edu.epn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int resultado = calculator.addition(5, 3);
            System.out.println("Resultado de la suma: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error al realizar la operación: " + e.getMessage());
        }
    }
}
