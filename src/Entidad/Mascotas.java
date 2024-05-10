
package Entidad;


public class Mascotas {
    String  dniDuenio;
    String nombre;
    String edad;
    String condicion;

    public Mascotas(String dniDuenio, String nombre, String edad, String condicion) {
        this.dniDuenio = dniDuenio;
        this.nombre = nombre;
        this.edad = edad;
        this.condicion = condicion;
    }

    public String getDniDuenio() {
        return dniDuenio;
    }

    public void setDniDuenio(String dniDuenio) {
        this.dniDuenio = dniDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    
    
}
