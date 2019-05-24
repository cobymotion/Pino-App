package controller;

import java.util.List;
import model.Producto;

/**
 *  Operaciones para los elementos de productos 
 * @author tecmm
 */
public interface OperacionesCatalogo {

    public boolean agregarProducto(Producto producto);
    public boolean bajaProducto(String id); 
    public List<Producto> consultarProductos();
    public Producto consultarProducto(String id);
    
}
