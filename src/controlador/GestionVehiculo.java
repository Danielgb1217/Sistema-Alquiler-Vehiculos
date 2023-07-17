package controlador;

import java.io.Serializable;
import java.util.*;
import java.util.regex.*;
import modelo.*;
import utilidades.LeerArchivoPlano;
import vista.MdiVehiculos;

public class GestionVehiculo implements Serializable {

    private List<AbstractVehiculo> lstVehiculos;

    private TipoVehiculo[] tipoVehiculo;

    public GestionVehiculo() {

        llenarTipoVehiculo();
//       llenarVehiculos();
       
    }

    public void llenarVehiculos() {
        
        
        lstVehiculos = LeerArchivoPlano.cargarVehiculos(tipoVehiculo);

    }

    public void registrarVehiculo(AbstractVehiculo vehiculo) {

    }

    private void llenarTipoVehiculo() {
        tipoVehiculo = new TipoVehiculo[3];
        tipoVehiculo[0] = new TipoVehiculo("Camioneta", (byte) 1);
        tipoVehiculo[1] = new TipoVehiculo("Carro", (byte) 2);
        tipoVehiculo[2] = new TipoVehiculo("Moto", (byte) 3);
    }

    public List<AbstractVehiculo> getLstVehiculos() {
        return lstVehiculos;
    }

    public void setLstVehiculos(List<AbstractVehiculo> lstVehiculos) {
        this.lstVehiculos = lstVehiculos;
    }

    public TipoVehiculo[] getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo[] tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    //-------------------------------Validacion  Placa vehiculo 
    //Expresion regular para validar matriculas de carros y motos con el formato
    //XXX###    XXX33X
    public boolean validarMatricula(String matricula) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{3}[0-9]{3}|[a-zA-Z]{3}[0-9]{2}[a-zA-Z]");
        Matcher matcher = pattern.matcher(matricula);
        return matcher.matches();
    }

}
