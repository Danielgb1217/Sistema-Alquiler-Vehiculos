
package modelo;

import java.io.Serializable;

/**
 *
 * @author tecnicoper1
 */
public class Tercero implements Serializable {
    
    private String nombre;
    private String apellido;
    private String cedula;

    /**
     *
     * @param nombre
     * @param apellido
     * @param cedula
     */
    public Tercero(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return nombre + " "+apellido;
    }
    
    
    
}
