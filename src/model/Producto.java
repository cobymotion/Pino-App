package model;

/**
 * Clase para datos de los productos
 * @author tecmm
 */
public class Producto {
    
    public String id; 
    public String nombre; 
    public double precio; 
    
    public Producto() {  // new Procucto()
        System.out.println("Soy un producto");
    }
    
    public double getPrecio()
    {
        return precio;     
    }
    
    public String[] datos(){
       String arre[] = new String[3]; 
       arre[0] = id; 
       arre[1] = nombre;
       arre[2] = "" + getPrecio(); 
       return arre;
    }
}
