package com.pss.gestaocontatos.view;

import DAO.ContatoDAO;
import com.pss.gestaocontatos.presenter.ConsultarContatosPresenter;
import com.pss.gestaocontatos.presenter.IncluirContatoPresenter;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PrincipalView extends javax.swing.JFrame {

    private ContatoDAO contatos;

    public PrincipalView() {
        initComponents();
        contatos = new ContatoDAO();
        setVisible(true);
        setLocationRelativeTo(this.getParent());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opmIncluirContato = new javax.swing.JMenuItem();
        opmConsultarContatos = new javax.swing.JMenuItem();
        opmEncerrarSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestão de contatos");

        jMenu1.setText("Opções");

        opmIncluirContato.setText("Incluir contato");
        opmIncluirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmIncluirContatoActionPerformed(evt);
            }
        });
        jMenu1.add(opmIncluirContato);

        opmConsultarContatos.setText("Consultar contatos");
        opmConsultarContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmConsultarContatosActionPerformed(evt);
            }
        });
        jMenu1.add(opmConsultarContatos);

        opmEncerrarSistema.setText("Encerrar sistema");
        opmEncerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opmEncerrarSistemaActionPerformed(evt);
            }
        });
        jMenu1.add(opmEncerrarSistema);

        mbPrincipal.add(jMenu1);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opmIncluirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmIncluirContatoActionPerformed
        IncluirContatoPresenter presenterIncluir = new IncluirContatoPresenter();
    }//GEN-LAST:event_opmIncluirContatoActionPerformed

    private void opmEncerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmEncerrarSistemaActionPerformed
        this.dispose();
    }//GEN-LAST:event_opmEncerrarSistemaActionPerformed

    private void opmConsultarContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opmConsultarContatosActionPerformed

        new ConsultarContatosPresenter(contatos);
    }//GEN-LAST:event_opmConsultarContatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenuItem opmConsultarContatos;
    private javax.swing.JMenuItem opmEncerrarSistema;
    private javax.swing.JMenuItem opmIncluirContato;
    // End of variables declaration//GEN-END:variables

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenuBar getMbPrincipal() {
        return mbPrincipal;
    }

    public void setMbPrincipal(JMenuBar mbPrincipal) {
        this.mbPrincipal = mbPrincipal;
    }

    public JMenuItem getOpmConsultarContatos() {
        return opmConsultarContatos;
    }

    public void setOpmConsultarContatos(JMenuItem opmConsultarContatos) {
        this.opmConsultarContatos = opmConsultarContatos;
    }

    public JMenuItem getOpmIncluirContato() {
        return opmIncluirContato;
    }

    public void setOpmIncluirContato(JMenuItem opmIncluirContato) {
        this.opmIncluirContato = opmIncluirContato;
    }

    public JMenuItem getOpmEncerrarSistema() {
        return opmEncerrarSistema;
    }

    public void setOpmEncerrarSistema(JMenuItem opmEncerrarSistema) {
        this.opmEncerrarSistema = opmEncerrarSistema;
    }

}
