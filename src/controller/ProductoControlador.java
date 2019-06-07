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
        Producto p = new Producto(); 
        p.id = id; 
        //int pos = Dato.listaProductos.indexOf(p);
        int pos=-1; 
        for(int i=0;i<Dato.listaProductos.size();i++)
            if(id.equals(Dato.listaProductos.get(i).id))
            {
                pos = i; 
                break;
            }
        if(pos>=0)
            p = Dato.listaProductos.get(pos);
        else 
            p = null; 
        return p;
    }
    
}





