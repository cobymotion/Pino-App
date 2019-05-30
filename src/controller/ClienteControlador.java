package controller;

import model.Cliente;
import model.listas.Dato;

/**
 * clase para las operaciones con el cliente
 * @author tecmm
 */
public class ClienteControlador {
    
    
    public boolean agregar(Cliente c){
        Dato.listaCliente.add(c); 
        return true;
    }
    
    public boolean siExiste(String telefono){        
        Cliente c  = new Cliente(telefono,"","");
        return Dato.listaCliente.contains(c);
    }
    
    public Cliente buscarCliente(String telefono){      
        Cliente c  = new Cliente(telefono,"","");
        int pos = Dato.listaCliente.indexOf(c);
        if(pos>=0)
            c = Dato.listaCliente.get(pos);
        else 
            c = null; 
        return c; 
    }
    
    
}
