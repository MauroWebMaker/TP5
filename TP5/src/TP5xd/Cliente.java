package TP5xd;

/* @author Grupo 11 */

public class Cliente {
    // atributo(s)
    private Integer DNI;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    
    // constructor(es)
    public Cliente() {} // vacío por las dudas
    
    public Cliente(Integer DNI, String nombre, String apellido, String ciudad, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    // método(s)
    
    
    // getter(s) & setter(s)
    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
}
