
package lista_de_tareas;

import java.util.Scanner;


public class Lista_de_Tareas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTareas lista = new ListaTareas();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n**********************");
            System.out.println("\n*** MENÚ DE TAREAS ***");
            System.out.println("\n**********************");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.print("Ingresa la descripción de la tarea: ");
                    String descripcion = sc.nextLine();
                    lista.agregarTarea(descripcion);
                    break;
                case 2:
                    lista.mostrarTareas();
                    break;
                case 3:
                    System.out.print("Ingresa el número de la tarea a marcar como completada: ");
                    int indiceCompletar = sc.nextInt();
                    lista.marcarTareaCompletada(indiceCompletar);
                    break;
                case 4:
                    System.out.print("Ingresa el número de la tarea a eliminar: ");
                    int indiceEliminar = sc.nextInt();
                    lista.eliminarTarea(indiceEliminar);
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no valida, intenta de nuevo.");
            }
        }

        sc.close();
    }
    
}
