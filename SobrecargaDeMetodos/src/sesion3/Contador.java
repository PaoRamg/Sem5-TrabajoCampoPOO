
package sesion3;

    
public class Contador {
    static int totalObjetos = 0;
    
    public Contador (){
        totalObjetos++;
    }
    public void mostrarTotal(){
        System.out.println("Número de objetos creados: " + totalObjetos);
    }
    
}
