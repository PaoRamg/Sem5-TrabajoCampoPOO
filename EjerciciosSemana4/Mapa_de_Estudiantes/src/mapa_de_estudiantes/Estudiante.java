package mapa_de_estudiantes;


public class Estudiante {
    private String nombre;
    private double calificacion;

    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Calificación: " + calificacion;
    }
}
