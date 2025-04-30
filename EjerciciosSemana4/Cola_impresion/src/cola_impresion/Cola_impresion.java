package cola_impresion;

import java.util.Scanner;


public class Cola_impresion {

    public static void main(String[] args) {
        ColaImpresion colaImpresion = new ColaImpresion();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Cola de Impresión ---");
            System.out.println("1. Agregar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int paginas = scanner.nextInt();
                    Documento nuevoDocumento = new Documento(nombre, paginas);
                    colaImpresion.agregarDocumento(nuevoDocumento);
                    break;

                case 2:
                    colaImpresion.imprimirDocumento();
                    break;

                case 3:
                    colaImpresion.mostrarCola();
                    break;

                case 4:
                    System.out.println("Saliendo de la cola de impresión...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

}
