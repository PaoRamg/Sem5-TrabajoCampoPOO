package mapa_de_estudiantes;
import java.util.Scanner;

public class Mapa_de_Estudiantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroEstudiantes registro = new RegistroEstudiantes();
        int opcion;

        do {
            System.out.println("\n--- REGISTRO DE ESTUDIANTES ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Obtener estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del estudiante: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Calificación: ");
                    double calificacion = sc.nextDouble();
                    registro.agregarEstudiante(id, new Estudiante(nombre, calificacion));
                    break;
                case 2:
                    System.out.print("ID del estudiante a buscar: ");
                    int idBuscar = sc.nextInt();
                    Estudiante estudiante = registro.obtenerEstudiante(idBuscar);
                    if (estudiante != null) {
                        System.out.println("Estudiante encontrado: " + estudiante);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("ID del estudiante a eliminar: ");
                    int idEliminar = sc.nextInt();
                    registro.eliminarEstudiante(idEliminar);
                    System.out.println("Estudiante eliminado.");
                    break;
                case 4:
                    registro.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        sc.close();
    }

}
