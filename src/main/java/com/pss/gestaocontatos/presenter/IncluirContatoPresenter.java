package com.pss.gestaocontatos.presenter;

import DAO.ContatoDAO;
import com.pss.gestaocontatos.model.Contato;
import com.pss.gestaocontatos.view.IncluirContatoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncluirContatoPresenter {

    private IncluirContatoView view;

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
        contato = new Contato(nome, telefone);

        contatoDAO.create(contato);

    }

    private void fechar() {
        view.dispose();
    }

}
