
package Principal;

public class Cotiza {
  
 String DepOrigen;
 String MunOrigen;
 String DepDestino;
 String MunDestino;
 String NumeroPaquete;
 String DatosFacturacion;
 String Servicio;
 String Cobro;
 String DatosFac;

    public Cotiza() {
    }

    public Cotiza(String DepOrigen, String MunOrigen, String DepDestino, String MunDestino, String NumeroPaquete, String DatosFacturacion, String Servicio, String Cobro, String DatosFac) {
        this.DepOrigen = DepOrigen;
        this.MunOrigen = MunOrigen;
        this.DepDestino = DepDestino;
        this.MunDestino = MunDestino;
        this.NumeroPaquete = NumeroPaquete;
        this.DatosFacturacion = DatosFacturacion;
        this.Servicio = Servicio;
        this.Cobro = Cobro;
        this.DatosFac = DatosFac;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "DepOrigen=" + DepOrigen + ", MunOrigen=" + MunOrigen + ", DepDestino=" + DepDestino + ", MunDestino=" + MunDestino + ", NumeroPaquete=" + NumeroPaquete + ", DatosFacturacion=" + DatosFacturacion + ", Servicio=" + Servicio + ", Cobro=" + Cobro + ", DatosFac=" + DatosFac + '}';
    }

    public String getDepOrigen() {
        return DepOrigen;
    }

    public void setDepOrigen(String DepOrigen) {
        this.DepOrigen = DepOrigen;
    }

    public String getMunOrigen() {
        return MunOrigen;
    }

    public void setMunOrigen(String MunOrigen) {
        this.MunOrigen = MunOrigen;
    }

    public String getDepDestino() {
        return DepDestino;
    }

    public void setDepDestino(String DepDestino) {
        this.DepDestino = DepDestino;
    }

    public String getMunDestino() {
        return MunDestino;
    }

    public void setMunDestino(String MunDestino) {
        this.MunDestino = MunDestino;
    }

    public String getNumeroPaquete() {
        return NumeroPaquete;
    }

    public void setNumeroPaquete(String NumeroPaquete) {
        this.NumeroPaquete = NumeroPaquete;
    }

    public String getDatosFacturacion() {
        return DatosFacturacion;
    }

    public void setDatosFacturacion(String DatosFacturacion) {
        this.DatosFacturacion = DatosFacturacion;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getCobro() {
        return Cobro;
    }

    public void setCobro(String Cobro) {
        this.Cobro = Cobro;
    }

    public String getDatosFac() {
        return DatosFac;
    }

    public void setDatosFac(String DatosFac) {
        this.DatosFac = DatosFac;
    }
    
    
    
}
