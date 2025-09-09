package TP5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* @author Grupo 11 */
public class DirectorioTelefonico {

    // atributo(s)
    TreeMap<Long, Cliente> directorio = new TreeMap<>();

    // constructor(es)
    public DirectorioTelefonico() {
    } // vacío

    // método(s)
    public void agregarContacto(Long nroTel, Cliente c) {
        directorio.put(nroTel, c);
    }

    public Cliente buscarContactoXTelefono(Long nroTel) {
        return directorio.get(nroTel);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> numeros = new HashSet<>();

        for (Map.Entry<Long, Cliente> c : directorio.entrySet()) {
            if (c.getValue().getApellido().equalsIgnoreCase(apellido)) {
                numeros.add(c.getKey());
            }
        }
        return numeros;
    }

    public ArrayList<Cliente> buscarContactoXCiudad(String ciudad) {
        ArrayList<Cliente> ciudades = new ArrayList<>();

        for (Cliente c : directorio.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                ciudades.add(c);
            }
        }
        return ciudades;
    }

    public void borrarContacto(Long nroTel) {
        directorio.remove(nroTel);
    }

    // getter(s) & setter(s)
    public TreeMap<Long, Cliente> getDirectorio() {
        return directorio;
    }

    public void setDirectorio(TreeMap<Long, Cliente> directorio) {
        this.directorio = directorio;
    }

}
