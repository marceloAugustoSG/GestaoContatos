package com.pss.gestaocontatos.presenter;

import DAO.ContatoDAO;
import com.pss.gestaocontatos.model.Contato;
import com.pss.gestaocontatos.view.IncluirContatoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class IncluirContatoPresenter {

    private IncluirContatoView view;
    private ConsultarContatosPresenter presenter;

    public IncluirContatoPresenter() {
        view = new IncluirContatoView();
        view.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvar();
            }
        });
        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
        
        
    }
    
  

    private void salvar() {
        Contato contato;
        ContatoDAO contatoDAO = new ContatoDAO();

        String nome = view.getTxtNome().getText();
        String telefone = view.getTxtTelefone().getText();

        if (nome.isEmpty() || telefone.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Nome ou Telefone não podem ser nulos");
        } else {
            contato = new Contato(nome, telefone);
            contatoDAO.create(contato);
            JOptionPane.showMessageDialog(view, "Contato " + contato.getNome() + " salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();

        }
    }

    private void limparCampos() {
        view.getTxtNome().setText("");
        view.getTxtTelefone().setText("");
    }

    private void fechar() {
        view.dispose();
    }

}
