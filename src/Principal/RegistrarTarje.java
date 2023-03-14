
package Principal;

public class RegistrarTarje {
   
    String NombrePosesor;
    String Numero;
    String Vencimiento;

    public RegistrarTarje() {
    }

    public RegistrarTarje(String NombrePosesor, String Numero, String Vencimiento) {
        this.NombrePosesor = NombrePosesor;
        this.Numero = Numero;
        this.Vencimiento = Vencimiento;
    }

    public String getNombrePosesor() {
        return NombrePosesor;
    }

    public void setNombrePosesor(String NombrePosesor) {
        this.NombrePosesor = NombrePosesor;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    @Override
    public String toString() {
        return "RegistrarTarjeta{" + "NombrePosesor=" + NombrePosesor + ", Numero=" + Numero + ", Vencimiento=" + Vencimiento + '}';
    }
    
    
    
    
    
}
