
package sesion3;

public class Banco {
    static double tasaInteres=0.0;

    public static void actualizarTasaInteres(double nuevaTasa) {
        tasaInteres = nuevaTasa;
    }
    
    public static void mostrarTasa() {
        System.out.println("La tasa de interés es: " + tasaInteres + "%");
    }
    
   
}
