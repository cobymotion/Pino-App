package model;

import java.util.ArrayList;
import java.util.List;
import model.listas.Dato;

/**
 * Clase con los datos para los tickets 
 * @author tecmm
 */
public class Ticket {
    public int folio; /// automatico
    public String fecha; 
    public List<Producto> productos;
    public String titulo;
    public Cliente cliente;
    public String rfc;
    public String telefono; 
    
    public Ticket(){
         titulo = "PIZZA NOSTRA"; 
         productos = new ArrayList<>();
         rfc = "XXXX000000XXX";
         telefono = "33 11 00 31 58";
         cliente = new Cliente("", "", "");
         folio = Dato.listaTickets.size()+1;
    }
    
    public double getTotal(){
        double total = 0; 
        for(Producto p : productos)
            total+=p.getPrecio();
        return total;
    }
    
    public String[] datosTabla(){
        String[] arre = new String[3];
        arre[0] = "" + folio; 
        arre[1] = cliente.nombre; 
        // Permite formatear la cantidad en pesos 
        arre[2] = "$ " + String.format("%.2f",getTotal());
        return arre;        
    }
    
    
}
