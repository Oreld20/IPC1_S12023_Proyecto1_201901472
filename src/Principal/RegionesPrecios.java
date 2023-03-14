
package Principal;

public class RegionesPrecios {
   
    String region;
    String PrecioEstandar;
    String PrecioEspecial;

    public RegionesPrecios() {
    }

    public RegionesPrecios(String region, String PrecioEstandar, String PrecioEspecial) {
        this.region = region;
        this.PrecioEstandar = PrecioEstandar;
        this.PrecioEspecial = PrecioEspecial;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPrecioEstandar() {
        return PrecioEstandar;
    }

    public void setPrecioEstandar(String PrecioEstandar) {
        this.PrecioEstandar = PrecioEstandar;
    }

    public String getPrecioEspecial() {
        return PrecioEspecial;
    }

    public void setPrecioEspecial(String PrecioEspecial) {
        this.PrecioEspecial = PrecioEspecial;
    }

    @Override
    public String toString() {
        return "RegionesPrecios{" + "region=" + region + ", PrecioEstandar=" + PrecioEstandar + ", PrecioEspecial=" + PrecioEspecial + '}';
    }
    
    
    
    
    
}
