
package Principal;

public class DatosFactu {
    
    String nombre;
    String direccion;
    String nit;

    public DatosFactu() {
    }

    public DatosFactu(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "DatosFacturacion{" + "nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + '}';
    }
    
    
}
