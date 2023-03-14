
package Principal;

public class Kiosco {
    
    String region;
    String codigo;
    String nombre;

    public Kiosco() {
    }

    public Kiosco(String region, String codigo, String nombre) {
        this.region = region;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Kiosco{" + "region=" + region + ", codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
