
package modelo;
import java.io.Serializable;
//guarda los tipos de Usuarios de la aplicacion  administrador, usuario

/**
 *
 * @author tecnicoper1
 */
public class TipoUsuario implements Serializable{
   
    private byte codigo;
    private String descripcion;

    /**
     *
     * @param codigo
     * @param descripcion
     */
    public TipoUsuario(byte codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public byte getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  descripcion ;
    }
    
    
    
}
