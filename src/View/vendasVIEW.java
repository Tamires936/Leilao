/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Leilao.ProdutosDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tamires
 */
public class vendasVIEW extends javax.swing.JFrame {

    /**
     * Creates new form vendasVIEW
     */
    public vendasVIEW() {
        initComponents();
          listaVendas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableListaVenda = new javax.swing.JTable();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnVolta = new javax.swing.JButton();
        btnListaVenda = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText(" Vendas");

        TableListaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor ", "Status"
            }
        ));
        jScrollPane3.setViewportView(TableListaVenda);

        lblID.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        lblID.setText("Vendas Produto (ID)");

        btnVolta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolta.setText("Voltar");
        btnVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaActionPerformed(evt);
            }
        });

        btnListaVenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListaVenda.setText("Listar Vendas");
        btnListaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnVolta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaVenda)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolta)
                    .addComponent(btnListaVenda))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVendaActionPerformed
        
           String id = txtID.getText();
        if(id.isEmpty()){
            listaVendas();
        }else{
             try {
                 consultarID();
             } catch (SQLException ex) {
                 Logger.getLogger(vendasVIEW.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
         
    }//GEN-LAST:event_btnListaVendaActionPerformed

    private void btnVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaActionPerformed
        
         this.dispose();
        
    }//GEN-LAST:event_btnVoltaActionPerformed

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
            java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableListaVenda;
    private javax.swing.JButton btnListaVenda;
    private javax.swing.JButton btnVolta;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

 public void consultarID() throws SQLException{
        
        int idProduto = Integer.parseInt(txtID.getText());
        PreparedStatement st;
        ResultSet rs;
        boolean encontrouResultado = false;
        
        try{ 

            boolean Status;            
            ProdutosDAO produtosdao = new ProdutosDAO();
            Status = produtosdao.connectDB(); 
            
                Connection conn;
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/leiloes_tdsat","root", "826390T98#10t11");

            PreparedStatement prep;
   
            
            st = conn.prepareStatement("SELECT * FROM produtos WHERE id = ? AND status = 'Vendido'");
            st.setInt(1, idProduto);
            rs = st.executeQuery();
            
            DefaultTableModel  model = (DefaultTableModel) TableListaVenda.getModel();   
            model.setNumRows(0);
            
            while(rs.next()){
                encontrouResultado = true;
                model.addRow(new Object[]{
                rs.getString("id"),
                rs.getString("nome"),
                rs.getString("valor"), 
                rs.getString("status")
                });
            }
             rs.close();
             conn.close();
           
            if (!encontrouResultado) {
                
                JOptionPane.showMessageDialog(null,"O valor pesquisado não foi encontrado\n ou ainda não foi vendido");
                listaVendas();
            } 
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void listaVendas(){
          try{
            
           boolean Status;            
            ProdutosDAO produtosdao = new ProdutosDAO();
            Status = produtosdao.connectDB(); 

             Connection conn;
             
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/leiloes_tdsat","root", "826390T98#10t11");
             
             ResultSet rs;
            
            PreparedStatement st = conn.prepareStatement("SELECT * FROM produtos WHERE status = 'Vendido'");
            rs = st.executeQuery();
            
            DefaultTableModel  model = (DefaultTableModel) TableListaVenda.getModel();   
            model.setNumRows(0);
            
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("id"),
                rs.getString("nome"),
                rs.getString("valor"), 
                rs.getString("status")
                });
            }
            rs.close();
            conn.close();
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
    

