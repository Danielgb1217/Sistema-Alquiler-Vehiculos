package controlador;

import java.io.Serializable;
import java.util.List;
import modelo.AbstractVehiculo;
import modelo.Camioneta;
import modelo.Carro;
import modelo.InformeAlquiler;
import modelo.Moto;
import modelo.TipoVehiculo;
import modelo.Usuario;
import utilidades.LeerArchivoPlano;

public class AlquilaVehiculo implements Serializable {

    private AbstractVehiculo vehiculo;
    private Usuario usuario;
    private List<InformeAlquiler> listadoInformeAlquiler;
    private List<InformeAlquiler> reporteDisponibiidadVehculos;

    public AbstractVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(AbstractVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "vehiculo=" + vehiculo + ", usuario=" + usuario + '}';
    }

    public List<InformeAlquiler> llenarInformeVehiculos() {

        listadoInformeAlquiler = LeerArchivoPlano.cargarInformeAlquiler();
        return listadoInformeAlquiler;
    }

        public void llenarReporteDisponibilidadVehiculos() {

        reporteDisponibiidadVehculos = LeerArchivoPlano.cargarReporteDisponibilidad();
        
    }
    
    public List<InformeAlquiler> getListadoInformeAlquiler() {
        return listadoInformeAlquiler;
    }

    public List<InformeAlquiler> getReporteDisponibiidadVehculos() {
        return reporteDisponibiidadVehculos;
    }

    public void setReporteDisponibiidadVehculos(List<InformeAlquiler> reporteDisponibiidadVehculos) {
        this.reporteDisponibiidadVehculos = reporteDisponibiidadVehculos;
    }

    
    public void setListadoInformeAlquiler(List<InformeAlquiler> listadoInformeAlquiler) {
        this.listadoInformeAlquiler = listadoInformeAlquiler;
    }

    public double alquilarVehiculo(AbstractVehiculo vehiculo, Usuario usuario, int kmRecorridos) {

        if (vehiculo instanceof Camioneta) {

            double valorCapacidad = ((Camioneta) vehiculo).getCapacidad() * 5000;
            double costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos) + valorCapacidad;
            return costoAlquiler;
        } else if (vehiculo instanceof Carro) {
            double costoAlquiler;
            if (((Carro) vehiculo).isExtras()) {

                costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos) + 50000;
            } else {
                costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos);
            }
            return costoAlquiler;
        } else if (vehiculo instanceof Moto) {
            double costoAlquiler;
            if (((Moto) vehiculo).isCasco()) {

                costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos) + 10000;
            } else {
                costoAlquiler = vehiculo.calcularAlquiler(kmRecorridos);
            }
            return costoAlquiler;
        }

        return 0;
    }

}
