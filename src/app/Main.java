package app;

import views.HomeWindow;

/**
 * Clase para el inicio de la aplicación
 * @author luis
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Iniciando pino 0.1");
        HomeWindow ventana = new HomeWindow(); 
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
