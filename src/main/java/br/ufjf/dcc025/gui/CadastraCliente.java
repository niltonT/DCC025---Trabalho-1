package br.ufjf.dcc025.gui;

import java.util.*;
import java.util.List;
import javax.swing.*;
import br.ufjf.dcc025.obj.Cliente;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastraCliente extends JFrame{


    private int LARGURA = 600;
    private int ALTURA = 300;

    private List clientes;

    private JPanel painel;
    private JPanel centerPanel;
    private JPanel buttonPanel;
    
    private JTextField campoNome;
    private JTextField campoCPF;
    private JTextField campoEndereco;
    private JTextField campoComplemento;
    private JTextField campoBairro;
    private JTextField campoCelular;
    private JTextField campoEmail;
    
    private JTextArea campoObs;
    private JScrollPane obs;
    
    private JButton buttonCadastrar;
    private JButton buttonCancelar;
    private JButton buttonBuscar;

    CadastraCliente(List<Cliente> clientes){

        super("Cadastrar cliente");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(LARGURA,ALTURA);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        this.clientes = clientes;

        this.centerPanel = new JPanel(new GridLayout(2,1));
        this.painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        this.centerPanel.add(this.painel);
        this.add(this.centerPanel, BorderLayout.CENTER);

        this.painel.add(new JLabel("Nome: "));
        this.campoNome = new JTextField(29);
        this.painel.add(this.campoNome);

        this.painel.add(new JLabel("CPF: "));
        this.campoCPF = new JTextField(15);
        this.painel.add(this.campoCPF);

        this.painel.add(new JLabel("Endereço: "));
        this.campoEndereco = new JTextField(46);
        this.painel.add(this.campoEndereco);

        this.painel.add(new JLabel("Complemento: "));
        this.campoComplemento = new JTextField(20);
        this.painel.add(this.campoComplemento);

        this.painel.add(new JLabel(" Bairro: "));
        this.campoBairro = new JTextField(17);
        this.painel.add(this.campoBairro);

        this.painel.add(new JLabel("E-Mail: "));
        this.campoEmail = new JTextField(23);
        this.painel.add(this.campoEmail);

        this.painel.add(new JLabel("  Celular: "));
        this.campoCelular = new JTextField(18);
        this.painel.add(this.campoCelular);

        this.painel.add(new JLabel("Observações: "));
        this.campoObs = new JTextArea();
        this.campoObs.setLineWrap(true);
        this.campoObs.setWrapStyleWord(true);
        this.obs = new JScrollPane(this.campoObs);
        this.centerPanel.add(obs);

        
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(new FlowLayout());
        this.add(this.buttonPanel, BorderLayout.SOUTH);
        
        this.buttonCadastrar = new JButton("CADASTRAR");
        this.buttonCadastrar.addActionListener(new buttonCadastrar());
        this.buttonCadastrar.setPreferredSize(new Dimension(150,50));
        this.buttonPanel.add(this.buttonCadastrar);

        this.buttonBuscar = new JButton("BUSCAR");
        this.buttonBuscar.setPreferredSize(new Dimension(120,50));
        this.buttonPanel.add(this.buttonBuscar);
 
        this.buttonCancelar = new JButton("CANCELAR");
        this.buttonCancelar.addActionListener(new buttonCancelar());
        this.buttonCancelar.setPreferredSize(new Dimension(150,50));
        this.buttonPanel.add(this.buttonCancelar);

    }

    public void cadastra(){

        Cliente cliente = new Cliente();
        cliente.setNome(this.campoNome.getText());
        cliente.setCpf(this.campoCPF.getText());
        cliente.setEndereco(this.campoEndereco.getText());
        cliente.setComplemento(this.campoComplemento.getText());
        cliente.setBairro(this.campoBairro.getText());
        cliente.setCelular(this.campoCelular.getText());
        this.clientes.add(cliente);
    }

    class buttonCadastrar implements ActionListener{
        public void actionPerformed(ActionEvent e){
           cadastra();
           dispose();
        }
    }

    class buttonCancelar implements ActionListener{
        public void actionPerformed(ActionEvent e){
           dispose();
        }
    }

}

