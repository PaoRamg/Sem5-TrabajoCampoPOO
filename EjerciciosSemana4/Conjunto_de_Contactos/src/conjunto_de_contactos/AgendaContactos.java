
package conjunto_de_contactos;

import java.util.HashSet;


public class AgendaContactos {
    private HashSet<Contacto> contactos;

    public AgendaContactos() {
        this.contactos = new HashSet<>();
    }

    public void agregarContacto(Contacto contacto) {
        if (contactos.add(contacto)) {
            System.out.println("Contacto agregado: " + contacto);
        } else {
            System.out.println("El contacto ya existe: " + contacto);
        }
    }

    public void eliminarContacto(Contacto contacto) {
        if (contactos.remove(contacto)) {
            System.out.println("Contacto eliminado: " + contacto);
        } else {
            System.out.println("El contacto no se encontró: " + contacto);
        }
    }

    public void buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                return;
            }
        }
        System.out.println("Contacto no encontrado con el nombre: " + nombre);
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
        } else {
            System.out.println("Contactos en la agenda:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}
