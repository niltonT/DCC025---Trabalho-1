package br.ufjf.dcc025;

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

    private JButton button;

    CadastraVeiculo(){

        super("Cadastrar veiculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(600,250);
        this.setResizable(false);
        this.setVisible(true);

        this.textFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.flowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.obsButtonPanel = new JPanel(new BorderLayout());
        this.borderPanel = new JPanel(new BorderLayout());
        this.gridPanel = new JPanel(new GridLayout(2,1));
        this.buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
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

        this.button = new JButton("BOTÃO");
        this.button.setPreferredSize(new Dimension(150,50));
        this.buttonPanel.add(this.button);

        this.gridPanel.setPreferredSize(new Dimension(600,100));
        
        this.add(this.gridPanel,BorderLayout.NORTH);
        this.add(this.borderPanel,BorderLayout.CENTER);
        this.add(this.buttonPanel,BorderLayout.SOUTH);
    }
    
}
