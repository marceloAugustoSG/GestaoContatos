package com.pss.gestaocontatos.presenter;

import com.pss.gestaocontatos.view.ConsultarContatosView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsultarContatosPresenter {

    private ConsultarContatosView view;

    public ConsultarContatosPresenter() {
        view = new ConsultarContatosView();

        view.getBtnFechar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fechar();
            }
        });
    }

    private void fechar() {
        view.dispose();;
    }

}
