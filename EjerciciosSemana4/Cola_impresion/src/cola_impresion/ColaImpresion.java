package cola_impresion;

import java.util.LinkedList;


public class ColaImpresion {
private LinkedList<Documento> cola;

    public ColaImpresion() {
        this.cola = new LinkedList<>();
    }

    public void agregarDocumento(Documento documento) {
        cola.addLast(documento);
        System.out.println("Documento agregado a la cola: " + documento);
    }

    public void imprimirDocumento() {
        if (!cola.isEmpty()) {
            Documento documento = cola.removeFirst();
            System.out.println("Imprimiendo documento: " + documento);
        } else {
            System.out.println("No hay documentos en la cola para imprimir.");
        }
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola de impresión está vacía.");
        } else {
            System.out.println("Documentos en la cola de impresión:");
            for (Documento documento : cola) {
                System.out.println(documento);
            }
        }
    }
}
