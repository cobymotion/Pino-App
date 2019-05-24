package controller.util;

import javax.swing.JTable;
import javax.swing.table.TableColumn;


/**
 * 
 * @author tecmm
 */
public class TableFix {
    
    public static void fixTableProductos(JTable table){
         TableColumn  column; 
         column = table.getColumnModel().getColumn(0);
         column.setPreferredWidth(100);
         column.setMaxWidth(100);
         column.setMinWidth(100);
         column = table.getColumnModel().getColumn(2);
         column.setPreferredWidth(100);
         column.setMaxWidth(100);
         column.setMinWidth(100);
        
    }
    
}
