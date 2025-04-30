
package sesion3;

public class Auto {
    
    class Motor {
    private String tipo;
    
    public void IngresarTipoMotor(String tipo){
        this.tipo=tipo;
    }
    
    public void MostrarTipoMotor(){
        System.out.println("El tipo de motor del auto es: " + tipo);
    }
}
        public void mostrarR(){
        Motor mtr = new Motor();
        mtr.IngresarTipoMotor("Eéctrico");
        mtr.MostrarTipoMotor();
    }
}
