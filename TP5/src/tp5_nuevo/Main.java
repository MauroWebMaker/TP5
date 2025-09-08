package tp5_nuevo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/* @author Grupo 11 */

public class Main {
    public static HashSet<Cliente> listaAlumnos = new HashSet<>();
    public static TreeMap<Long, Cliente> directoriooo = new TreeMap<>();
    
    public static void main(String[] args) {
        // creación de objetos
        DirectorioTelefonico D1 = new DirectorioTelefonico();
        Cliente C1 = new Cliente(42778631, "Facundo", "Lopez", "Merlo", "Mujeres de mi Tierra 1690");
        Cliente C2 = new Cliente(44752772, "Mauro", "Reta", "San Luis", "Lince 110");
        Cliente C3 = new Cliente(42357107, "Juan Cruz", "Rodriguez", "La Punta", "Bv. Tobar Garcia 02");
        Cliente C4 = new Cliente(42238525, "Agustin", "Mazza", "Juana Koslay", "Los Zorzales 558");
        Cliente C5 = new Cliente(46807350, "Jeremias", "Hoyo", "Cortaderas", "La Escondida 50");
        ArrayList<Cliente> c1 = new ArrayList<>();
        Set<Long> c2 = new HashSet<>();
        
        // "cuerpo" del main
        D1.agregarContacto(1111111111L, C1);
        D1.agregarContacto(2222222222L, C2);
        D1.agregarContacto(3333333333L, C3);
        D1.agregarContacto(4444444444L, C4);
        D1.agregarContacto(5555555555L, C5);

        System.out.println(D1.buscarContactoXTelefono(4444444444L).toString());
        c1 = D1.buscarContactoXCiudad("Merlo");
        c2 = D1.buscarTelefono("Reta");
        
        for (Long numero : c2) {
            System.out.println(numero);
        }
        
        for (Cliente c : c1) {
            System.out.println(c.toString());
        }
         // anda todo joyaaaaa
    }

}
