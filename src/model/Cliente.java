package model;

import java.util.Objects;

/**
 * Clase para los datos de los clientes
 * @author tecmm
 */
public class Cliente {
    public String tel; 
    public String nombre; 
    public String direccion;
    
    public Cliente(String tel, String nombre, String direccion)
    {
        this.tel =tel; 
        this.nombre = nombre; 
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tel);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
