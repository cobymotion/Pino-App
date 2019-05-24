
package controller.util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

/**
 * Clase que obtiene la fecha del sistema
 * @author luis
 */
public class FechaSistema implements ActionListener{

    private final JLabel txtFecha; 
    private final JLabel txtHora; 

    public FechaSistema(JLabel txtFecha, JLabel txtHora) {
        this.txtFecha = txtFecha;
        this.txtHora = txtHora;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Date fechaSistema = new Date(); 
        String patternHora = "hh:mm:ss a"; 
        String patternFecha = "dd-MM-YYYY";
        SimpleDateFormat formatFecha = new SimpleDateFormat(patternFecha); 
        txtFecha.setText("Fecha: " + formatFecha.format(fechaSistema));
        SimpleDateFormat formatHora = new SimpleDateFormat(patternHora); 
        Calendar hoy = Calendar.getInstance();
        txtHora.setText("Hora: " + String.format(formatHora.format(fechaSistema), hoy));
    }
    
}
