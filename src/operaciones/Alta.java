/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author DELL
 */
public class Alta extends javax.swing.JFrame {

    /**
     * Creates new form Alta
     */
    public volatile String nomm;
    public volatile String fechita;
    public volatile String sala;
    public volatile String telemple;
    public volatile String numehijos;
    public volatile String Habilidad;
    
    float Sal;//salario
    String fechareg;
    int numCelular;
    int numhijos;
    String habilidades;
    
    public Alta() {
        initComponents();
        this.setLocationRelativeTo(null);
        fechas();
        fecha.setText(fechareg);
        fecha.setEditable(false);
 
    }
    private volatile int dia;
    private volatile int mes;
    private volatile int año;
    
    public void fechas(){
        Calendar cal=new GregorianCalendar();
        año=cal.get(Calendar.YEAR);
        mes=cal.get(Calendar.MONTH);
        dia=cal.get(Calendar.DAY_OF_MONTH);
        
        fechareg = String.valueOf(dia)+"-"+String.valueOf(mes+1)+"-"+String.valueOf(año);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nombre_emple = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        telefon_emple = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numero_hijos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Habilidades = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Agregar = new javax.swing.JMenu();
        Eliminar = new javax.swing.JMenu();
        Actualizar = new javax.swing.JMenu();
        consultar = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingrese nombre completo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(nombre_emple, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, -1));

        jLabel1.setText("Telefono del empleado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, -1));
        getContentPane().add(telefon_emple, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 180, -1));

        jLabel3.setText("Numero de hijos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel4.setText("Fecha del alta: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 180, -1));

        jLabel5.setText("Salario:          $ ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));
        getContentPane().add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 100, -1));

        jLabel7.setText("Habilidad: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, 20));

        numero_hijos.setText("0");
        getContentPane().add(numero_hijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 50, -1));

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Valores de salario sin comas ( , )");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 50));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 50));

        Habilidades.setColumns(20);
        Habilidades.setRows(5);
        jScrollPane1.setViewportView(Habilidades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Alta Empleado: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/elegante-fondo-blanco-lineas-brillantes_1017-17580.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Agregar);

        Eliminar.setText("Eliminar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Eliminar);

        Actualizar.setText("Actualizar");
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });
        jMenuBar1.add(Actualizar);

        consultar.setText("Consultar");
        consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarMouseClicked(evt);
            }
        });
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jMenuBar1.add(consultar);

        salir.setBackground(new java.awt.Color(102, 102, 102));
        salir.setForeground(new java.awt.Color(255, 0, 51));
        salir.setText("salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        nomm=nombre_emple.getText();//nombre
        nomm=nomm.replaceAll(" ", "");//verificar que no tenga espacios o este vacio
        fechita=fecha.getText();
        fechita=fechita.replaceAll(" ", "");
        sala=salario.getText();
        sala=sala.replaceAll(" ", "");
        telemple=telefon_emple.getText();
        telemple=telemple.replaceAll(" ", "");
        numehijos=numero_hijos.getText();
        numehijos=numehijos.replaceAll (" ", "");
        Habilidad=Habilidades.getText();
        Habilidad=Habilidad.replaceAll(" ", "");     
        
        if(nomm.length()==0 && fechita.length()==0 && sala.length()==0 && telemple.length()==0 && Habilidad.length()==0){
            JOptionPane.showMessageDialog(null,"Todo esta bien");
        }else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos, por favor verifiquelo de nuevo");
            
        }
        
    }//GEN-LAST:event_GuardarActionPerformed
    
    
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked

        Alta al=new Alta();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMouseClicked
        Eliminar elim=new Eliminar();
        elim.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarMouseClicked

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
        Actualizacion act=new Actualizacion();
        act.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ActualizarMouseClicked

    private void consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseClicked
        Consultar cons=new Consultar();
        cons.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_consultarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_salirMouseExited

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        fecha.setText("");
        nombre_emple.setText("");
        numero_hijos.setText("");
        salario.setText("");
        telefon_emple.setText("");
        Habilidades.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Actualizar;
    private javax.swing.JMenu Agregar;
    private javax.swing.JMenu Eliminar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextArea Habilidades;
    private javax.swing.JButton cancelar;
    private javax.swing.JMenu consultar;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_emple;
    private javax.swing.JTextField numero_hijos;
    private javax.swing.JTextField salario;
    private javax.swing.JMenu salir;
    private javax.swing.JTextField telefon_emple;
    // End of variables declaration//GEN-END:variables
}
