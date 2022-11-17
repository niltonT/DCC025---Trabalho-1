package br.ufjf.dcc025.gui;

import br.ufjf.dcc025.obj.Cliente;
import br.ufjf.dcc025.utils.Gbc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/*
    Nome: Nilton Rego Teixeira
    Matricula: 202035006
 */

public class AppGUI extends JFrame{
    
    private int LARGURA = 960;
    private int ALTURA = 600;

    private List<Cliente> clientes;

    private JPanel mainButtonPanel;
    private JPanel cadastro;
    private JPanel ordemServico;

    private JTabbedPane tabbedPane;

    private JButton buttonOS, buttonFechar;
    private JButton cadastraCliente, cadastraVeiculo;
    private JButton novaOS;

    public AppGUI(){
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(LARGURA,ALTURA);
        this.setLayout(new GridBagLayout());

        this.clientes = new ArrayList<>();

        this.tabbedPane = new JTabbedPane();
        this.cadastro = new JPanel(new GridBagLayout());
        this.ordemServico = new JPanel(new GridBagLayout());

        this.cadastraCliente = new JButton("<html><center>Cadastrar<br>Cliente</center>");
        this.cadastraCliente.addActionListener(new buttonCliente());
        this.cadastraVeiculo = new JButton("<html><center>Cadastrar<br>Veículo</center>");
        this.cadastraVeiculo.addActionListener(new buttonVeiculo());
        this.novaOS = new JButton("Nova OS");
        this.novaOS.addActionListener(new buttonNovaOS());
        
        this.tabbedPane.add("Cadastro",this.cadastro);
        this.tabbedPane.add("Ordem de Serviço",this.ordemServico);

        this.mainButtonPanel = new JPanel();
        this.mainButtonPanel.setLayout(new GridLayout(1,2));
        this.mainButtonPanel.setSize(200,600);

        this.buttonOS = new JButton();
        this.buttonOS.setText("Ordem de serviço");
        this.buttonOS.setVisible(true);
        this.mainButtonPanel.add(this.buttonOS);

        this.buttonFechar = new JButton();
        this.buttonFechar.setText("Fechar");
        this.buttonFechar.setVisible(true);
        this.mainButtonPanel.add(this.buttonFechar);

        this.setComponentsPosition();
    }

    private void setComponentsPosition(){
        
        Gbc gbc = new Gbc();
        gbc.fill = Gbc.VERTICAL;
        gbc.insets = new Insets(0,5,0,5);
        gbc.ipady = 15;
        this.cadastro.add(this.cadastraCliente,gbc);
        gbc.novaColuna();
        this.cadastro.add(this.cadastraVeiculo,gbc);
        gbc.novaColuna();
        gbc.weightx = 1.0;
        this.cadastro.add(new JPanel(),gbc);
        gbc.gridx = 0;
        gbc.ipady = 30;
        gbc.weightx = 0.0;
        this.ordemServico.add(this.novaOS,gbc);
        gbc.novaColuna();
        gbc.weightx = 1.0;
        this.ordemServico.add(new JPanel(),gbc);
        
        gbc = new Gbc();
        gbc.anchor = Gbc.LINE_START;
        gbc.ipadx = LARGURA;
        this.add(this.tabbedPane,gbc);
    }

    public void printClientes(){
        for(Cliente cliente : this.clientes){
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        }
    }

    class buttonCliente implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            CadastraCliente frame = new CadastraCliente(clientes);
            frame.setVisible(true);
        }
    }

    class buttonVeiculo implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            CadastraVeiculo frame = new CadastraVeiculo();
            frame.setVisible(true);
        }
    }

    class buttonNovaOS implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            NovaOS frame = new NovaOS();
            frame.setVisible(true);
        }
    }
}
