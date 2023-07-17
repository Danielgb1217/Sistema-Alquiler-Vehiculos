
package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author tecnicoper1
 */
public class regexEmail {

    /**
     *
     * @param email
     * @return
     */
    public static boolean validarEmail (String email) {
		Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// Elemplo de implementación

    /**
     *
     * @param args
     */
	public static void  main (String[] args) {
		if(regexEmail.validarEmail("danielgb12171umanizales.edu")){
                    
                    JOptionPane.showMessageDialog(null, "Esta bueno");
                }
                else{
                     JOptionPane.showMessageDialog(null, "Esta malo");
                }
	}
}