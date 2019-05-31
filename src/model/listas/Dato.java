package model.listas;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Producto;
import model.Ticket;

/**
 * Clase provisional para manejar las listas de los 
 * datos que manejara el sistema
 * @author Luis Cobián 
 */
public class Dato {
    public static List<Producto> listaProductos = 
            new ArrayList<>();
    public static List<Cliente> listaCliente = 
            new ArrayList<>();
    public static List<Ticket> listaTickets = 
            new ArrayList<>();
}
