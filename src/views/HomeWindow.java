
package views;

import controller.ProductoControlador;
import controller.TicketControlador;
import controller.util.FechaSistema;
import controller.util.TableFix;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import views.dialogs.OrdenDialog;
import views.dialogs.ProductosDialog;

/**
 *Ventana principal de la aplicación 
 * @author luis
 */
public class HomeWindow extends javax.swing.JFrame {

    /**
     * Variables para almacenar la posición donde se da click en la pantalla 
     */
    int xMouse; 
    int yMouse; 
    
    /**
     * Variable para saber si la ventana esta maximizada
     */
    private static boolean estaMaximizada;
    
    /**
     * Variable para la actualización de la fecha
     */
    private Timer timer;
    
    /**
     * Creates new form HomeWindow
     */
    public HomeWindow() {
        initComponents();
        try{
            setIconImage(new ImageIcon(getClass()
                    .getResource("res/Pizza-icon.png")).getImage());
        }catch(Exception e){
            System.out.println("No loaded icon image");
            e.printStackTrace();
        }
        actualizarOrdenes();
        timer = new Timer(60, new FechaSistema(txtFecha, txtHora));
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        panellateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnOrdenes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCaja = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTituloBajo = new javax.swing.JLabel();
        txtTituloAlto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Nostra");
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1021, 726));
        setSize(new java.awt.Dimension(1021, 726));

        fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoMouseDragged(evt);
            }
        });
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoMousePressed(evt);
            }
        });

        panellateral.setBackground(new java.awt.Color(86, 153, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/logo-nostra.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("PIZZA NOSTRA");

        jLabel4.setText("Magdalena, Jalisco");

        jLabel5.setText("33 11 00 31 58");

        jLabel6.setText("386 744 08 95");

        btnOrdenes.setBackground(new java.awt.Color(85, 141, 81));
        btnOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectOrdenesClick(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-pizza-15.png"))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ORDENES DE SERVICIO");

        javax.swing.GroupLayout btnOrdenesLayout = new javax.swing.GroupLayout(btnOrdenes);
        btnOrdenes.setLayout(btnOrdenesLayout);
        btnOrdenesLayout.setHorizontalGroup(
            btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrdenesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOrdenesLayout.setVerticalGroup(
            btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrdenesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnProductos.setBackground(new java.awt.Color(112, 178, 107));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectProductosClick(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-ingredientes-15.png"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("PRODUCTOS");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnCaja.setBackground(new java.awt.Color(112, 178, 107));
        btnCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectCajaClick(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-caja-registradora-filled-15.png"))); // NOI18N

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("CAJA");

        javax.swing.GroupLayout btnCajaLayout = new javax.swing.GroupLayout(btnCaja);
        btnCaja.setLayout(btnCajaLayout);
        btnCajaLayout.setHorizontalGroup(
            btnCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCajaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCajaLayout.setVerticalGroup(
            btnCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCajaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel13.setText("Siempre sonreír");

        txtFecha.setText("Fecha: ");

        txtHora.setText("Hora:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-calculadora-filled-50.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCalcutor(evt);
            }
        });

        javax.swing.GroupLayout panellateralLayout = new javax.swing.GroupLayout(panellateral);
        panellateral.setLayout(panellateralLayout);
        panellateralLayout.setHorizontalGroup(
            panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrdenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panellateralLayout.createSequentialGroup()
                .addGroup(panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellateralLayout.createSequentialGroup()
                        .addGroup(panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panellateralLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(panellateralLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel13))
                            .addGroup(panellateralLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtFecha))
                            .addGroup(panellateralLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtHora)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panellateralLayout.setVerticalGroup(
            panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellateralLayout.createSequentialGroup()
                .addGroup(panellateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellateralLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(panellateralLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(28, 28, 28)
                .addComponent(txtFecha)
                .addGap(18, 18, 18)
                .addComponent(txtHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(163, 217, 119));

        txtTituloBajo.setText("ORDENES DE SERVICIO");

        txtTituloAlto.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTituloAlto.setText("ORDENES DEL DIA DE HOY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtTituloBajo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(txtTituloAlto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTituloBajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTituloAlto)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-cerrar-ventana-filled-15.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClick(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblDatos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDatos.setGridColor(new java.awt.Color(255, 255, 255));
        tblDatos.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblDatos.setRowHeight(24);
        tblDatos.setSelectionBackground(new java.awt.Color(85, 141, 81));
        jScrollPane1.setViewportView(tblDatos);

        jButton1.setBackground(new java.awt.Color(163, 217, 119));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-más-filled-32.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaBotonClick(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(163, 217, 119));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-eliminar-filled-32.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/res/icons8-maximizar-la-ventana-15.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizarClick(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(panellateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addContainerGap())))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panellateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17))
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1021, 726));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Funcionamiento para cerrar la ventana con el boton X
     * @param evt 
     */
    private void closeIconMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClick
        // TODO add your handling code here:
        System.out.println("Cerrando");
        timer.stop();
        System.exit(0);
    }//GEN-LAST:event_closeIconMouseClick

    /**
     * Captura la posición donde se dio clic en la pantalla 
     * Se utiliza para poder desplazar la ventana 
     * @param evt 
     */
    private void fondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX(); 
        yMouse = evt.getY(); 
    }//GEN-LAST:event_fondoMousePressed

    /**
     * Mueve la posición de la ventana segun se arrastra le mouse a lo largo de 
     * la pantalla 
     * @param evt 
     */
    private void fondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseDragged
        // TODO add your handling code here:
        if(!estaMaximizada){
            int x = evt.getXOnScreen(); 
            int y =evt.getYOnScreen(); 
            this.setLocation(x-xMouse, y-yMouse);
       }
    }//GEN-LAST:event_fondoMouseDragged

    /**
     * Evento que sucede al dar clic en el boton de ordenes 
     * @param evt 
     */
    private void selectOrdenesClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectOrdenesClick
        // TODO add your handling code here:
        resetColorsBtns();
        seleccionColor(btnOrdenes);
        actualizarOrdenes();
    }//GEN-LAST:event_selectOrdenesClick

    private void actualizarOrdenes(){
        txtTituloBajo.setText("ORDENES");
        txtTituloAlto.setText("LISTA DE ORDENES");
        TicketControlador control = new TicketControlador();
        tblDatos.setModel(control.generarModelo());
    }
    
    /**
     * Evento que sucede al dar clic en el boton de productos 
     * @param evt 
     */
    private void selectProductosClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectProductosClick
            resetColorsBtns();
        seleccionColor(btnProductos);
        //Evento
        txtTituloBajo.setText("PRODUCTOS");
        txtTituloAlto.setText("LISTA DE PRODUCTOS");
        //controlador
        ProductoControlador control = new ProductoControlador();
        tblDatos.setModel(control.generarModelo());
        TableFix.fixTableProductos(tblDatos);
    }//GEN-LAST:event_selectProductosClick

    /**
     * Evento que sucede al dar clic en el boton de caja 
     * @param evt 
     */
    private void selectCajaClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCajaClick
        // TODO add your handling code here:
        resetColorsBtns();
        seleccionColor(btnCaja);
    }//GEN-LAST:event_selectCajaClick

    private void maximizarClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizarClick
        if(!estaMaximizada)
        {
            HomeWindow.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            HomeWindow.this.setMaximizedBounds(env.getMaximumWindowBounds());
            estaMaximizada = true;
        }else{
            setExtendedState(JFrame.NORMAL);
            estaMaximizada=false; 
        }
    }//GEN-LAST:event_maximizarClick

    
    /***
     * Metodo para abrir la calculadora del sistema
     * @param evt 
     */
    private void openCalcutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openCalcutor
        String nameOs = System.getProperty("os.name"); 
        System.out.println("Sistema operativo: " + nameOs);
        Runtime runtime = Runtime.getRuntime();
        try{
            switch(nameOs){
                case "Linux":
                    runtime.exec("gnome-calculator");
                    break;
                case "Windows":
                    runtime.exec("calc.exe");
                    break;
                case "MAC OS X":
                    runtime.exec("calculator"); // investigar 
                    break;
                default: 
                    if(nameOs.contains("Windows"))
                        runtime.exec("calc.exe");
                    else
                        JOptionPane.showMessageDialog(this, "No se encontro un sistema operativo valido", "Información"
                                    , JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            System.out.println("Ocurrio un error al abrir la calculadora");
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se pudo encontrar una calculadora en tu sistema", "ERROR"
                                    , JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_openCalcutor

    private void agregaBotonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaBotonClick
        switch(txtTituloBajo.getText()){
            case "PRODUCTOS":
                ProductosDialog dialog = new ProductosDialog
                                          (this, true, "Agregar producto");
                dialog.setLocationRelativeTo(this);
                dialog.setVisible(true);
                ProductoControlador control = 
                        new ProductoControlador();
                tblDatos.setModel(control.generarModelo());
                break;
            case "ORDENES":
                OrdenDialog orden = new OrdenDialog
                                           (this, true); 
                orden.setLocationRelativeTo(this);
                orden.setVisible(true);
                actualizarOrdenes();
        } // llave del switch
    }//GEN-LAST:event_agregaBotonClick

    
    private void resetColorsBtns(){
        defaultColor(btnCaja);
        defaultColor(btnOrdenes);
        defaultColor(btnProductos);
    }
    
    private void seleccionColor(JPanel btn){
        btn.setBackground(new Color(85,141,81));
    }
    
    private void defaultColor(JPanel btn){
        btn.setBackground(new Color(112,178,107));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCaja;
    private javax.swing.JPanel btnOrdenes;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panellateral;
    private javax.swing.JTable tblDatos;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtTituloAlto;
    private javax.swing.JLabel txtTituloBajo;
    // End of variables declaration//GEN-END:variables
}
