package br.ufjf.dcc025.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastraVeiculo extends JFrame {

    private JPanel textFieldPanel;
    private JPanel obsButtonPanel;
    private JPanel flowPanel;
    private JPanel borderPanel;
    private JPanel gridPanel;
    private JPanel buttonPanel;


    private JTextField campoPlaca;
    private JTextField campoMontadora;
    private JTextField campoModelo;
    private JTextField campoAnoFab;
    private JTextField campoAnoModelo;
    private JTextField campoCliente;

    private JTextArea campoObs;
    private JScrollPane obs;

    private JButton buttonCadastrar;
    private JButton buttonCancelar;
    private JButton buttonBuscar;

    public CadastraVeiculo(){

        super("Cadastrar veiculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);

        this.textFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.obsButtonPanel = new JPanel(new BorderLayout());
        this.borderPanel = new JPanel(new BorderLayout());
        this.gridPanel = new JPanel(new GridLayout(2,1));
        this.buttonPanel = new JPanel(new FlowLayout());
        
        this.campoMontadora = new JTextField(15);
        this.textFieldPanel.add(new JLabel("Montadora: "));
        this.textFieldPanel.add(this.campoMontadora);
        
        this.campoModelo = new JTextField(23);
        this.textFieldPanel.add(new JLabel("Modelo: "));
        this.textFieldPanel.add(this.campoModelo);
        
        this.campoPlaca = new JTextField(7);
        this.textFieldPanel.add(new JLabel("Placa: "));
        this.textFieldPanel.add(this.campoPlaca);

        this.campoAnoFab = new JTextField(5);
        this.textFieldPanel.add(new JLabel("Ano fab.: "));
        this.textFieldPanel.add(this.campoAnoFab);
        
        this.campoAnoModelo = new JTextField(5);
        this.textFieldPanel.add(new JLabel("Ano mod.: "));
        this.textFieldPanel.add(this.campoAnoModelo);
        this.gridPanel.add(textFieldPanel);
        
        this.campoCliente = new JTextField(20);
        this.flowPanel.add(new JLabel("Cliente: "));
        this.flowPanel.add(this.campoCliente);
        this.gridPanel.add(this.flowPanel);
        
        this.obsButtonPanel.add(new JLabel("Observações: "),BorderLayout.NORTH);
        this.campoObs = new JTextArea();
        this.campoObs.setLineWrap(true);
        this.campoObs.setWrapStyleWord(true);
        this.obs = new JScrollPane(this.campoObs);
        this.obsButtonPanel.add(obs,BorderLayout.CENTER);
        this.obsButtonPanel.setPreferredSize(new Dimension(600,100));
        this.borderPanel.add(this.obsButtonPanel,BorderLayout.CENTER);
        this.gridPanel.setPreferredSize(new Dimension(600,100));

        
        this.buttonCadastrar = new JButton("CADASTRAR");
        //this.buttonCadastrar.addActionListener(new ButtonClick());
        this.buttonCadastrar.setPreferredSize(new Dimension(150,50));
        this.buttonPanel.add(this.buttonCadastrar);

        this.buttonBuscar = new JButton("BUSCAR");
        this.buttonBuscar.setPreferredSize(new Dimension(120,50));
        this.buttonPanel.add(this.buttonBuscar);
 
        this.buttonCancelar = new JButton("CANCELAR");
        this.buttonCancelar.setPreferredSize(new Dimension(150,50));
        this.buttonPanel.add(this.buttonCancelar);
        
        this.add(this.gridPanel,BorderLayout.NORTH);
        this.add(this.borderPanel,BorderLayout.CENTER);
        this.add(this.buttonPanel,BorderLayout.SOUTH);
    }
}
