
package Principal;

public class AgregarDepa {
    
    String region;
    String nombre;
    String codigo;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AgregarDepa(String region, String nombre, String codigo) {
        this.region = region;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public AgregarDepa() {
    }

    @Override
    public String toString() {
        return "AgregarDepartamentos{" + "region=" + region + ", nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
    
    
    
    
    
    
    
}
