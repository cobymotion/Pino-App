package controller;

import javax.swing.table.DefaultTableModel;
import model.listas.Dato;

/**
 * Clase para operaciones del ticket
 * @author Luis Cobián 
 */
public class TicketControlador {
    
    public DefaultTableModel generarModelo(){
        String []columnas = {"FOLIO","CLIENTE","TOTAL"};
        String [][]datos = new String[Dato.listaTickets.size()][];
        for(int i=0;i<Dato.listaTickets.size();i++)
            datos[i] = Dato.listaTickets.get(i).datosTabla();
        DefaultTableModel modelo = new 
                      DefaultTableModel(datos,columnas);
        return modelo;
    }
    
}




