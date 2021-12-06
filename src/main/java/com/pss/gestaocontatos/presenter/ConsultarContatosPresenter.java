package com.pss.gestaocontatos.presenter;

import DAO.ContatoDAO;
import com.pss.gestaocontatos.model.Contato;
import com.pss.gestaocontatos.view.ConsultarContatosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class ConsultarContatosPresenter {

    private ConsultarContatosView view;
    private ContatoDAO contatos;
    private DefaultTableModel tmContatos;

    public ConsultarContatosPresenter(ContatoDAO contatos) {
        this.contatos = contatos;
        view = new ConsultarContatosView();
        carregarContatos();

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        // quantidade de contatos
        view.getTxtQtdTotal().setText(Integer.toString(contatos.getContatos().size()));

        view.getBtnExcluir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deletarContato();
                carregarContatos();
            }
        });

    }

    private void fechar() {
        view.dispose();;
    }

    private void carregarContatos() {

        tmContatos = new DefaultTableModel(
                new Object[][]{},
                new String[]{"Nome", "Telefone"});

        view.getTblConsultaContatos().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tmContatos.setNumRows(0);
        ListIterator<Contato> it = contatos.getContatos().listIterator();

        while (it.hasNext()) {
            Contato contato = it.next();
            tmContatos.addRow(new Object[]{contato.getNome(), contato.getTelefone()});

        }
        view.getTblConsultaContatos().setModel(tmContatos);
    }

    private void desabilitarBtns() {
        view.getBtnExcluir().setEnabled(false);
        view.getBtnVisualizar().setEnabled(false);

    }

    private void habilitarBtns() {
        view.getBtnExcluir().setEnabled(true);
        view.getBtnVisualizar().setEnabled(true);

    }

    private void deletarContato() {

        int linha = tmContatos.getColumnCount();

        if (linha == -1) {
            JOptionPane.showMessageDialog(view, "Voce deve selecionar um contato da tabela");
        } else {
            habilitarBtns();;
            int cod = (int) view.getTblConsultaContatos().getValueAt(linha, 0);
            contatos.delete((int) cod);
        }
    }
}
