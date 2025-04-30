package lista_de_tareas;

import java.util.ArrayList;

public class ListaTareas {
    private ArrayList<Tarea> tareas;
    
    public ListaTareas(){
        tareas = new ArrayList<>();
    }
    
    public void agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
    }
    
    public void marcarTareaCompletada(int indice){
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).marcarComoCompletada();
        } else {
            System.out.println("Índice no válido.");
        }
    }
    public void eliminarTarea(int indice){
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        } else {
            System.out.println("Índice no válido.");
        }
    }
    
    public void mostrarTareas(){
        int i = 0;
        for (Tarea tarea : tareas) {
            String estado = tarea.isCompletada() ? "Completada" : "No completada";
            System.out.println(i + ": " + tarea.getDescripcion() + " - " + estado);
            i++;
        }
    }
}
