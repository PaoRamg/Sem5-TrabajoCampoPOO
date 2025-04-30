package sesion3;
import java.util.Scanner;

public class Division {
    
    public void division (){
        
        Scanner lectura = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el primer número entero: ");
            int numerador = lectura.nextInt();
            System.out.print("Ingrese el segundo número entero: ");
            int denominador = lectura.nextInt();
            int resultado = numerador / denominador;
            System.out.println("La división entre " + numerador + " y " + denominador + " es: "+ resultado);
        }
        catch (ArithmeticException e){
            System.out.println("Error!! El denominador debe ser diferente a cero.");
        }
    }  
}
