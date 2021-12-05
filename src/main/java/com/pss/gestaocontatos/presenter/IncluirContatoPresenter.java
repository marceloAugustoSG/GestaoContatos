package com.pss.gestaocontatos.presenter;

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
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }
        });

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });

    }

    private void fechar() {
        view.dispose();
    }

}
