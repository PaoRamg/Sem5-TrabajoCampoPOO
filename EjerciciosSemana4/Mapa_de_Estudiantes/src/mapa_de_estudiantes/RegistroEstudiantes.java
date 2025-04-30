package mapa_de_estudiantes;
import java.util.HashMap;

public class RegistroEstudiantes {
    private HashMap<Integer, Estudiante> estudiantes;

        public RegistroEstudiantes() {
            estudiantes = new HashMap<>();
        }

        public void agregarEstudiante(int id, Estudiante estudiante) {
            estudiantes.put(id, estudiante);
        }

        public Estudiante obtenerEstudiante(int id) {
            return estudiantes.get(id);
        }

        public void eliminarEstudiante(int id) {
            estudiantes.remove(id);
        }

        public void mostrarEstudiantes() {
            for (Integer id : estudiantes.keySet()) {
                System.out.println("ID: " + id + ", " + estudiantes.get(id));
            }
        }
}
