
package utilidades;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author tecnicoper1
 */
public class EnviarCorreo {
    
    public void enviarCorreo(String mensaje){       
                
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");      

        
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = "DohkoGonzalez1217@gmail.com";
        String contrasena = "1053827199";
        String receptor = "Danielgb1217@hotmail.com";
        String asunto = "Nuevo Vehiculo Alquilado";
//        String mensaje="Vehiculo de placas xxx222";
        
        MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (receptor));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
//            JOptionPane.showMessageDialog(null, "");
            
            
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "Problema al enviar correo");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Problema al enviar correo");
        }
    }
    }
    
    

        
        
        

