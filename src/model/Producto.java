package model;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
