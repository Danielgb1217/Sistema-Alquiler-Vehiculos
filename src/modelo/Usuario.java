package modelo;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tecnicoper1
 */
public class Usuario extends Tercero implements Serializable {

    private String login;
    private String passwd;
    private TipoUsuario tipoUsuario;
    private byte edad;
    private boolean vision;
    private boolean audicion;

 
    public Usuario(String login, String passwd, TipoUsuario tipoUsuario, String nombre, String apellido, String cedula, 
            byte edad,
            boolean vision, boolean audicion) {
        super(nombre, apellido, cedula);
        this.login = login;
        this.passwd = passwd;
        this.tipoUsuario = tipoUsuario;
        this.edad= edad;
        this.vision = vision;
        this.audicion = audicion;
    }

    /**
     *
     * @return
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     *
     * @param passwd
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public boolean isVision() {
        return vision;
    }

    public void setVision(boolean vision) {
        this.vision = vision;
    }

    public boolean isAudicion() {
        return audicion;
    }

    public void setAudicion(boolean audicion) {
        this.audicion = audicion;
    }

    
    
    /**
     *
     * @return
     */
    //Modificacion del metodo get para obtener solo el valor del string del objetio tipoUsuario
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

  public Object[] obtenerArregloObjeto(){
        
        Object[] data = { getLogin(), getPasswd(), getTipoUsuario(), getNombre(), getApellido(), getCedula(),
        getEdad(), isVision(), isAudicion()};
        return data;          
    
    }

 

}
