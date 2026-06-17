package src;

public class Main {
    public static double calcularPromedio(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Promedio: " + calcularPromedio(10, 10, 10));
    }
}

