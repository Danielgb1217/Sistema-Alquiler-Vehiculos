package controlador;

import Excepciones.*;
import java.util.*;
import java.util.regex.*;
import javax.swing.JOptionPane;
import modelo.*;
import utilidades.Encriptacion;
import utilidades.LeerArchivoPlano;

/**
 *
 * @author tecnicoper1
 */
public class GestionUsuario {

    private TipoUsuario[] tipoUsuario;
    private List<Usuario> lstUsuarios;
    private Encriptacion encriptar;

    /**
     *
     */
    public GestionUsuario() {
        llenarTipoUsuario();
        llenarUsuarios();
        encriptar = new Encriptacion();

    }

    /**
     *
     */
    public void llenarTipoUsuario() {

        tipoUsuario = new TipoUsuario[3];
        tipoUsuario[0] = new TipoUsuario((byte) 1, "Administrador");
        tipoUsuario[1] = new TipoUsuario((byte) 2, "UsuarioGeneral");
        tipoUsuario[2] = new TipoUsuario((byte) 3, "Secretaria");
    }

    /**
     *
     */
    public void llenarUsuarios() {

        lstUsuarios = LeerArchivoPlano.cargarUsuarios(tipoUsuario);

    }

    public Usuario validarUsuario(String login, String password) throws UsuarioException {
        for (Usuario usuarioAutenticado : lstUsuarios) {
            System.out.println("usuarioAutenticado = " + usuarioAutenticado.getPasswd());
            if (usuarioAutenticado.getLogin().compareTo(login) == 0 && 
                    encriptar.desencriptarPassword("1217", usuarioAutenticado.getPasswd()).compareTo(password) == 0) {

                return usuarioAutenticado;
            }

        }
        if (true) {
            throw new UsuarioException("El usuario no se encuentra registrado");            
        }
        return null;
    }

    public boolean validarEmail(String email) throws UsuarioException {

        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return matcher.matches();
        } else {
            throw new UsuarioException("El correo electronico no es valido");
        }

    }

    /**
     *
     * @return
     */
    public TipoUsuario[] getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     *
     * @param tipoUsuario
     */
    public void setTipoUsuario(TipoUsuario[] tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     *
     * @return
     */
    public List<Usuario> getLstUsuarios() {
        return lstUsuarios;
    }

    /**
     *
     * @param lstUsuarios
     */
    public void setLstUsuarios(List<Usuario> lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }

}
