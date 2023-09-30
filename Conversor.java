import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu de Conversión de Moneda");
            System.out.println("1. Convertir de Pesos a Dólares");
            System.out.println("2. Convertir de Dólares a Pesos");
            System.out.println("3. Convertir de Pesos a Euros");
            System.out.println("4. Convertir de Pesos a Libras Esterlinas");
            System.out.println("5. Convertir de Pesos a Yen Japonés");
            System.out.println("6. Convertir de Pesos a Won Sul-coreano");
            System.out.println("7. Salir del programa");
            System.out.print("Seleccione una opción: ");

            int opcion = input.nextInt();
            double cantidad;
            double resultado;

            switch (opcion) {
                case 1:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad / 20.0; // Suponiendo que 1 Dólar equivale a 20 Pesos
                    System.out.println("Resultado: " + resultado + " Dólares");
                    break;
                case 2:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad * 20.0; // Suponiendo que 1 Dólar equivale a 20 Pesos
                    System.out.println("Resultado: " + resultado + " Pesos");
                    break;
                case 3:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad / 23.0; // Suponiendo que 1 Euro equivale a 23 Pesos
                    System.out.println("Resultado: " + resultado + " Euros");
                    break;
                case 4:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad / 27.0; // Suponiendo que 1 Libra Esterlina equivale a 27 Pesos
                    System.out.println("Resultado: " + resultado + " Libras Esterlinas");
                    break;
                case 5:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad / 0.18; // Suponiendo que 1 Yen Japonés equivale a 0.18 Pesos
                    System.out.println("Resultado: " + resultado + " Yen Japonés");
                    break;
                case 6:
                    cantidad = obtenerCantidad(input);
                    resultado = cantidad / 0.0017; // Suponiendo que 1 Won Sul-coreano equivale a 0.0017 Pesos
                    System.out.println("Resultado: " + resultado + " Won Sul-coreano");
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese una opción válida.");
            }

            if (continuar) {
                System.out.print("¿Desea continuar? (si/no): ");
                String respuesta = input.next().toLowerCase();
                if (respuesta.equals("no")) {
                    continuar = false;
                    System.out.println("Programa finalizado");
                } else if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("Programa finalizado debido a respuesta no válida.");
                }
            }
        }

        input.close();
    }

    private static double obtenerCantidad(Scanner input) {
        double cantidad = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese la cantidad a convertir: ");
            if (input.hasNextDouble()) {
                cantidad = input.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Error: Ingrese un valor numérico válido.");
                input.next(); // Limpiar el búfer de entrada
            }
        }

        return cantidad;
    }
}
