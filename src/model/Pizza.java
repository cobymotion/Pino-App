package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para datos de pizza
 * @author tecmm
 */
public class Pizza extends Producto {
    public String tam; 
    public boolean borde; 
    public List<String> ingredientes; 
    
    public Pizza(){
        //////// Primero ejecuta el constructor del padre
        super();
        System.out.println("Soy pizza");
        ingredientes = new ArrayList<>();
    }
    
    @Override
    public double getPrecio()
    {
        double precio = super.precio;
        if(ingredientes.size()>5)
            precio+=10; 
        return precio;     
    }
    
    
}
