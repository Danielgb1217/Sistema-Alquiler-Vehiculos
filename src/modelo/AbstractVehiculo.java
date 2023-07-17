package modelo;

import javax.swing.JOptionPane;

public abstract class AbstractVehiculo implements VehiculoAble {

    protected String matricula;
    protected int km;
    protected boolean estado;
    protected double valorAlquiler;
    private TipoVehiculo tipoVehiculo;
    
    public AbstractVehiculo(TipoVehiculo tipoVehiculo, String matricula, int km, boolean estado, double valorAlquiler) {
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.km = km;
        this.estado = estado;
        this.valorAlquiler = valorAlquiler;
        
    }

   
    public void alquilar() {

    }

  
    public void devolver(int kmFinal) {

    }

    public abstract double calcularAlquiler(int km);

    
    public String mostrarDatos(){
       
        
         return null;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
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
        JOptionPane.showMessageDialog(null, "estoy en el padre");
        return null;
    }
    


    @Override
    public String toString() {
        return "AbstractVehiculo{" + "matricula=" + matricula + ", km=" + km + ", estado=" + estado + ", valorAlquiler=" + valorAlquiler + '}';
    }
  

}
