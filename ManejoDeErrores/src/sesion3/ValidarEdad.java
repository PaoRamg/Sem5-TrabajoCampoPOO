package sesion3;
import java.util.Scanner;
public class ValidarEdad {
    
    public void verificarEdad(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una edad: ");
        int edad = sc.nextInt();
        if (edad <18){
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18");
        }
        else {
            System.out.println("Edad validada! Es mayor de edad.");
        }
    }      
}
