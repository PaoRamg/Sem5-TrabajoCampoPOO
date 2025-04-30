
package lista_de_tareas;


public class Tarea {
    private String descripcion;
    private boolean completada;
    
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true; 
    }
}
