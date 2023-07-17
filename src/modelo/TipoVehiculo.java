
package modelo;

import java.io.Serializable;


public class TipoVehiculo implements Serializable{
    
    private String tipoVehiculo;
    private byte codigo;

    public TipoVehiculo(String tipoVehiculo, byte codigo) {
        this.tipoVehiculo = tipoVehiculo;
        this.codigo = codigo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "TipoVehiculo{" + "tipoVehiculo=" + tipoVehiculo + ", codigo=" + codigo + '}';
    }

  

    
  
    
    
    
    
}
