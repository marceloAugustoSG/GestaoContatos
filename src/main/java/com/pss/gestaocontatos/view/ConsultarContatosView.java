package com.pss.gestaocontatos.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ConsultarContatosView extends javax.swing.JFrame {
    
    public ConsultarContatosView() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(this.getParent());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisualizar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtQtdTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaContatos = new javax.swing.JTable();
        cbOrdenarTelefone = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar contatos");

        btnVisualizar.setText("Visualizar");

        btnSalvar.setText("Salvar");

        btnFechar.setText("Fechar");

        jLabel1.setText("Total");

        txtQtdTotal.setText("0");

        tblConsultaContatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultaContatos);

        cbOrdenarTelefone.setText("Ordenar por telefone");
        cbOrdenarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenarTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbOrdenarTelefone)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVisualizar)
                        .addGap(10, 10, 10)
                        .addComponent(btnSalvar)
                        .addGap(10, 10, 10)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(txtQtdTotal)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(cbOrdenarTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizar)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQtdTotal))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOrdenarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenarTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrdenarTelefoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JCheckBox cbOrdenarTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsultaContatos;
    private javax.swing.JLabel txtQtdTotal;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnFechar() {
        return btnFechar;
    }
    
    public void setBtnFechar(JButton btnFechar) {
        this.btnFechar = btnFechar;
    }
    
    public JButton getBtnSalvar() {
        return btnSalvar;
    }
    
    public void setBtnSalvar(JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }
    
    public JButton getBtnVisualizar() {
        return btnVisualizar;
    }
    
    public void setBtnVisualizar(JButton btnVisualizar) {
        this.btnVisualizar = btnVisualizar;
    }
    
    public JCheckBox getCbOrdenarTelefone() {
        return cbOrdenarTelefone;
    }
    
    public void setCbOrdenarTelefone(JCheckBox cbOrdenarTelefone) {
        this.cbOrdenarTelefone = cbOrdenarTelefone;
    }
    
    public JTable getTblConsultaContatos() {
        return tblConsultaContatos;
    }
    
    public void setTblConsultaContatos(JTable tblConsultaContatos) {
        this.tblConsultaContatos = tblConsultaContatos;
    }
    
    public JLabel getTxtQtdTotal() {
        return txtQtdTotal;
    }
    
    public void setTxtQtdTotal(JLabel txtQtdTotal) {
        this.txtQtdTotal = txtQtdTotal;
    }
}
