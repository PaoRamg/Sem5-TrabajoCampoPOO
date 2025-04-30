
package sesion3;

import java.io.IOException;


public class Sesion3 {


    public static void main(String[] args) {
       
        /*EJERCICIO 7****************************************************************/
 
        /*
        Division div1 = new Division();
        div1.division();
        */
        
        /*EJERCICIO 8****************************************************************/
        /*
        Division2 div2 = new Division2();
        div2.division();
        */
        
        /*EJERCICIO 9****************************************************************/
        /*
        ValidarEdad valid = new ValidarEdad();
        try {
            valid.verificarEdad();
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        */
        
        /*EJERCICIO 10****************************************************************/
        Archivo arc = new Archivo();
        try {
            arc.leerArchivo("ejemplo.txt"); // Cambia por el nombre de tu archivo
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
    
    
}
