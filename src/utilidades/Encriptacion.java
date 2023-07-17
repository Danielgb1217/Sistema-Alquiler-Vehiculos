package utilidades;

import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class Encriptacion {

    public Encriptacion() {

    }

//    public static void main(String[] args) {
//
//        String secretKey = "1217";
//        Encriptacion en = new Encriptacion();
//        String encriptada;
//        encriptada = en.encriptarPassword(secretKey, JOptionPane.showInputDialog("ingrese cadena "));
//        JOptionPane.showMessageDialog(null, encriptada);
//        String des = en.desencriptarPassword(secretKey, encriptada);
//        JOptionPane.showMessageDialog(null, des);
//    }

    public String encriptarPassword(String secretKey, String password) {

        String contraseniaEncriptada = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");//Definimos el tipo de encriptacion que utiliaremos
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] llavePasswordCopia = Arrays.copyOf(llavePassword, 24);   //Copia del arreglo pero con capacidad de 24

            //instruccion para crear la llave de encriptacion
            SecretKey key = new SecretKeySpec(llavePasswordCopia, "DESede");

            Cipher cifrado = Cipher.getInstance("DESede");

            cifrado.init(Cipher.ENCRYPT_MODE, key); //Le paso la llave de encriptacion y el tipo de cifrado

            //Encriptacion...transformamos la cadena a un arreglo de buyes
            byte[] passwordEncriptado = password.getBytes("utf-8");

            //copia de areglo de byte encriptado
            byte[] passwordEncriptadoCopia = cifrado.doFinal(passwordEncriptado);

            //Encriptacion en mode de areglo de bytes
            byte[] base64Bytes = Base64.encodeBase64(passwordEncriptadoCopia);

            contraseniaEncriptada = new String(base64Bytes);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la Encriptacion", "Error", 0);
        }

        return contraseniaEncriptada;

    }

    public String desencriptarPassword(String secretKey, String passwordEncriptado) {

        String contraseniaDesencriptada = "";

        try {

            //Desencriptamos la cadena entrante encriptada en base64
            byte[] cadena = Base64.decodeBase64(passwordEncriptado.getBytes("utf-8"));// obtenemos sus bytes en utf-8 ? Acentos
            MessageDigest md5 = MessageDigest.getInstance("MD5");//Objeto utilizado para la desencriptacion

            //Areglo de bytes para transformar en areglo de bytes la llave secreta
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] llavePasswordCopia = Arrays.copyOf(llavePassword, 24);

            //instruccion para crear la llave de encriptacion
            SecretKey key = new SecretKeySpec(llavePasswordCopia, "DESede");

            Cipher decifrado = Cipher.getInstance("DESede");
            decifrado.init(Cipher.DECRYPT_MODE, key);

            byte[] passwordDesencriptadoCopia = decifrado.doFinal(cadena);

            contraseniaDesencriptada = new String(passwordDesencriptadoCopia, "utf-8"); //Transformamos en string con utf-8

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la desencriptacion", "Error", 0);
        }

        return contraseniaDesencriptada;
    }

}
