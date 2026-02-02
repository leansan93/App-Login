
package com.mycompany.login.igu;

import com.mycompany.login.logica.ControladoraLogica;
import com.mycompany.login.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrincipalAdmin extends javax.swing.JFrame {
    ControladoraLogica control;
    Usuario usr;
    public PrincipalAdmin(ControladoraLogica control, Usuario usr) {
        initComponents();
        this.control=  control ;
        this.usr= usr; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnNuevoUsuario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNombreUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Administrativo de usuarios ");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        btnEditar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEditar.setText("Editar Usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBorrar.setText("Borrar Usuario ");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnRecargar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRecargar.setText("Cargar Tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNuevoUsuario.setText("Crear Nuevo usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtNombreUser.setEditable(false);
        txtNombreUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreUser.setText("jTextField1");
        txtNombreUser.setBorder(null);
        txtNombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUserActionPerformed
       //  Usuario user 
    }//GEN-LAST:event_txtNombreUserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNombreUser.setText(usr.getNombreUsuario());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
           AltasUsuarios altausers= new AltasUsuarios(control);
           altausers.setVisible(true);
           altausers.setLocationRelativeTo(null);
         
           
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // validar  que la tabla tenga elementos    
        if (tablaUsuarios.getRowCount()>0){
            // controlar que  haya seleccionado un elemento 
            if (tablaUsuarios.getSelectedRow() != -1){
                    // obtengo el id del elemento a eliminar
                    int id_usuario= Integer.parseInt( String.valueOf( tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
               
                    // llamo al metodo borrar 
                    control.borrarUsuario(id_usuario);
                    // Avisar al usuario que se elimino correctamente 
                    mostrarMensaje("Se borro el usuario correctamente ", "Info", "Eliminacion correcta");
                    
                    
                    
                    // actualizo la tabla 
                    cargarTabla();
            
            }  
            else{
                    mostrarMensaje("no se selecciono un usuario para eliminar", "Error", "Error al borrar");
                } 
        }
        else{
            mostrarMensaje("la tabla esta vacia ", "Error", "Error al borrar");
        
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         // validar  que la tabla tenga elementos    
        if (tablaUsuarios.getRowCount()>0){
            // controlar que  haya seleccionado un elemento 
            if (tablaUsuarios.getSelectedRow() != -1){
                    // obtengo el id del elemento a editar
                    int id_usuario= Integer.parseInt( String.valueOf( tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
               
                    // llamo al metodo editar 
                    EdicionUsuarios pantallaEdicion= new EdicionUsuarios(id_usuario, control);
                    pantallaEdicion.setVisible(true);
                    pantallaEdicion.setLocationRelativeTo(null);
                    
            }
        
         else{
                    mostrarMensaje("no se selecciono un usuario para editar", "Error", "Error al editar");
                } 
        }
        else{
            mostrarMensaje("la tabla esta vacia ", "Error", "Error al editar");
        
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
            cargarTabla();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void cargarTabla() {
           // definir el modelo que queremos que tenga la tabla 
        DefaultTableModel modeloTabla= new DefaultTableModel(){
        // que las filas y columnas no sean editables 
        @Override
        public boolean isCellEditable(int row , int colum){
            return false;
           }    
        };
        
        // establecemos los nombres de las columnas 
        String titulos[]= {"Id", "Usuario", "Rol"};
        modeloTabla.setColumnIdentifiers(titulos );
        tablaUsuarios.setModel(modeloTabla);
        // traer de la Base de datos la lista de usuarios 
        List <Usuario> listaUsuarios = control.traerUsuarios();
        // pregunta si la lista esta vacia si no lo esta lo recorre 
        if (listaUsuarios != null ){
            // recorre la lista 
            for (Usuario usu: listaUsuarios ){
                // lo guarda en un array de objetos para luego pasarlo al modelo tabla
                Object objeto []= {usu.getId(), usu.getNombreUsuario() , usu.getUnRol().getNombreRol()} ;
                // por cada fila se muestra el usuario 
                modeloTabla.addRow(objeto);
            }
        }
            
    }
       
            
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables

     // muestra mensaje de tipo informacion y de error 
     public void mostrarMensaje (String mensaje , String tipo , String titulo ){
           JOptionPane optionPane = new JOptionPane (mensaje);
           if(tipo.equals("info")){
                    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
           else if (tipo.equals("Error")){
               optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            
                   
    }
}
