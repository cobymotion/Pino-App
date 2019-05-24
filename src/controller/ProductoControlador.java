package controller;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Producto;
import model.listas.Dato;

/**
 * Clase para las operaciones con productos 
 * @author tecmm
 */
public class ProductoControlador
   implements OperacionesCatalogo{
    
    public DefaultTableModel generarModelo(){
        String []columns = {"CLAVE","NOMBRE","PRECIO"};
        String datos[][] = new String[Dato.listaProductos.size()][];
        for(int i=0;i<Dato.listaProductos.size();i++)
            datos[i] = Dato.listaProductos.get(i).datos();
        DefaultTableModel modelo = new DefaultTableModel
                   (datos, columns);
        return modelo;
    }

    @Override
    public boolean agregarProducto(Producto producto) {
         Dato.listaProductos.add(producto);
         return true;
    }

    @Override
    public boolean bajaProducto(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> consultarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto consultarProducto(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}





