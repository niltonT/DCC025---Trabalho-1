package br.ufjf.dcc025.gui;

import javax.swing.*;
import java.awt.*;

public class AppGUI extends JFrame{
    
    private JPanel buttonPainel;
    private JButton buttonOS, buttonSair;

    public AppGUI(){
        super();
        this.setLayout(new GridLayout(3,1));

        this.buttonPainel = new JPanel();
        this.buttonPainel.setLayout(new GridLayout(1,2));
        this.buttonPainel.setSize(200,600);
        this.add(this.buttonPainel);

        this.buttonOS = new JButton();
        this.buttonOS.setText("Ordem de serviço");
        this.buttonOS.setVisible(true);
        this.buttonPainel.add(this.buttonOS);

        this.buttonSair = new JButton();
        this.buttonSair.setText("Sair");
        this.buttonSair.setVisible(true);
        this.buttonPainel.add(this.buttonSair);
    }
}
