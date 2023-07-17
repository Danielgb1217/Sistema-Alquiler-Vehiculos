
package modelo;

import java.io.Serializable;
import java.util.Objects;


public class Moto extends AbstractVehiculo implements Serializable{

    private boolean casco;
    private TipoVehiculo tipoVehiculo;

    public Moto(TipoVehiculo tipoVehiculo, boolean casco, String matricula, int km, boolean estado, double valorAlquiler) {
        super(tipoVehiculo,matricula, km, estado, valorAlquiler);
        this.casco = casco;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public double calcularAlquiler(int kmRecorridos) {

    return 1000*(double)kmRecorridos;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipoVehiculo = tipovehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }



    

    public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getTipoVehiculo().getTipoVehiculo(),isCasco(),  getMatricula(), getKm(), isEstado(), getValorAlquiler()  };
        return data;
          
                
    }

    @Override
    public String toString() {
        return casco +""+matricula+""+km+""+estado+""+valorAlquiler;
                
    }

 
    

    



}
