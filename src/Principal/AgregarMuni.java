
package Principal;

public class AgregarMuni {
   
    String departamento;
    String codigo;
    String Nombre;

    public AgregarMuni() {
    }

    public AgregarMuni(String departamento, String codigo, String Nombre) {
        this.departamento = departamento;
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "AgregarMunicipio{" + "departamento=" + departamento + ", codigo=" + codigo + ", Nombre=" + Nombre + '}';
    }
    
    
    
    
    
    
    
}
