package br.ufjf.dcc025.gui;

import javax.swing.*;
import java.awt.*;

public class TabelaVendas extends JPanel {
    
    private float totalVendas;
    private float descontoTotal;
    private float subtotalVendas;
    
    private JTextField produto;
    private JTextField quantidade;
    private JTextField preco;
    private JTextField desconto;
    private JTextField subTotal;
    
    private JTable tab;
    private Object [][] vendas = {{produto,quantidade,preco,desconto,subTotal}};
    private String [] colunas = {"Produto","Qtd.","Preço","Desconto","subTotal"};
    
    

    public TabelaVendas(){
        super(new GridBagLayout());

        this.tab = new JTable(this.vendas,this.colunas);




        this.add(this.tab);
    }




}
