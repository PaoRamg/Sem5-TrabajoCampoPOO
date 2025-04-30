
package sesion3;


public class Libro {
    
    class Pagina{
        
        private String contenido;
        
        public void ingresarContenido (String contenido){
            this.contenido = contenido;
        }
        public void mostrarContenido(){
            System.out.println(contenido);
        }
    }
    
    public void mostrarPagina(){
        Pagina pag = new Pagina();
        pag.ingresarContenido("Había una vez, una ciudad escondida de la mente depredadora más temible del mundo: el ser humano....");
        pag.mostrarContenido();
    }
}
