package com.pss.gestaocontatos.presenter;

import DAO.ContatoDAO;
import com.pss.gestaocontatos.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPresenter {
    
    private static ContatoDAO contatos;

    public static void main(String[] args) {
        PrincipalView view = new PrincipalView();

        contatos = new ContatoDAO();

        view.getOpmConsultarContatos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ConsultarContatosPresenter(contatos);
            }
        });
        
        view.getOpmIncluirContato().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new IncluirContatoPresenter();
            }
        });
        
        view.getOpmEncerrarSistema().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.dispose();
            }
        });
        
        view.setVisible(true);

    }

}
