package br.ufjf.dcc025.utils;

import java.awt.*;

public class Gbc extends GridBagConstraints {

    public Gbc(){
        super();
        this.gridx = 0;
        this.gridy = 0;
    }

    public void novaColuna(){
        this.gridx = this.gridx + (this.gridwidth);
    }

    public void novaLinha(){
        this.gridy = this.gridy + (this.gridheight);
        this.gridx = 0;
    }

    public void novoLabel(){
        this.ipadx = 0;
        this.ipady = 0;
    }

    public void novoScroll(int ipadx, int ipady){
        this.ipady = ipady;
        this.ipadx = ipadx;
    }
}
