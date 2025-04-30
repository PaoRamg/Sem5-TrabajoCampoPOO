package conjunto_de_contactos;

import java.util.Scanner;

public class Conjunto_de_Contactos {

    public static void main(String[] args) {
        AgendaContactos agenda = new AgendaContactos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Agenda de Contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el email: ");
                    String email = scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono, email);
                    agenda.agregarContacto(nuevoContacto);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    Contacto contactoEliminar = new Contacto(nombreEliminar, "", "");
                    agenda.eliminarContacto(contactoEliminar);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;

                case 4:
                    agenda.mostrarContactos();
                    break;

                case 5:
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
