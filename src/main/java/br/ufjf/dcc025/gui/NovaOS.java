package br.ufjf.dcc025.gui;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import br.ufjf.dcc025.utils.*;
import java.awt.event.*;

/*
    Nome: Nilton Rego Teixeira
    Matricula: 202035006
 */

public class NovaOS extends JFrame{
    
    private static int totalOS;

    static{
        totalOS = 0;
    }

    private int LARGURA = 940;
    private int ALTURA = 420;

    private int numeroOS;

    private JPanel buttonPanel;
    
    private JTextField numOS;
    private JTextField campoCliente;
    private JTextField campoTecnico;
    private JTextField campoPlaca;
    private JTextField campoVeiculo;
    private JTextField dataEntrada;
    private JTextField dataSaida;
    
    private JScrollPane campoReclamacao;
    private JScrollPane campoLaudo;
    private JScrollPane campoObs;

    private JButton buttonSalvar;
    private JButton buttonFechar;
    private JButton buttonBuscar;

    
    public NovaOS(){

        super("Ordem de Serviço");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(LARGURA,ALTURA);
        this.setResizable(false);
        this.setLayout(new GridBagLayout());
        
        this.numeroOS = totalOS + 1;
        
        this.buttonPanel = new JPanel(new GridLayout(1,3,20,0));
        
        this.numOS = new JTextField(5);
        this.numOS.setForeground(new Color(255,0,0));
        this.numOS.setBackground(new Color(255,255,255));
        this.numOS.setHorizontalAlignment(JTextField.CENTER);
        this.numOS.setText(Integer.toString(this.numeroOS));
        this.numOS.setEditable(false);

        this.campoCliente = new JTextField(25); 
        this.campoTecnico = new JTextField(20);
        this.campoPlaca = new JTextField(7);
        this.campoVeiculo = new JTextField(20);
        
        this.dataEntrada = new JTextField(9);
        this.dataEntrada.setHorizontalAlignment(JTextField.CENTER);
        this.dataEntrada.setForeground(new Color(255,0,0));
        this.dataEntrada.setBackground(new Color(255,255,255));
        this.dataEntrada.setText(getDataAtual());
        this.dataEntrada.setEditable(false);
        
        this.dataSaida = new JTextField(9);
        this.dataSaida.setHorizontalAlignment(JTextField.CENTER);

        this.campoReclamacao = this.setScrollPane();
        this.campoLaudo = this.setScrollPane();
        this.campoObs = this.setScrollPane();

        this.buttonSalvar = new JButton("SALVAR");
        this.buttonSalvar.addActionListener(new buttonSalvar());
        this.buttonBuscar = new JButton("BUSCAR");
        this.buttonFechar = new JButton("FECHAR");
        this.buttonFechar.addActionListener(new buttonCancelar());
        
        this.buttonPanel.add(this.buttonSalvar);
        this.buttonPanel.add(this.buttonBuscar);
        this.buttonPanel.add(this.buttonFechar);

        this.setComponentsPosition();
    }

    private String getDataAtual(){
        LocalDate date = LocalDate.now();
        String formatDate =  Integer.toString(date.getDayOfMonth())
        + "/" + Integer.toString(date.getMonthValue()) 
        + "/" + Integer.toString(date.getYear());
        return formatDate;
    }

    private JScrollPane setScrollPane(){
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        return new JScrollPane(textArea);
    }

    private void setComponentsPosition(){

        Gbc gbc = new Gbc();
        gbc.insets = new Insets(5,5,0,5);
        this.add(new JLabel("N° OS:",JLabel.CENTER),gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5,0,0,0);
        this.add(new JLabel("Cliente: "),gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.WEST;
        this.add(this.campoCliente,gbc);
        gbc.insets = new Insets(5,5,0,5);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(5,0,0,0);
        this.add(new JLabel("Placa: "),gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.WEST;
        this.add(this.campoPlaca,gbc);
        gbc.insets = new Insets(5,5,0,5);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(new JLabel(("Data Entrada:"),JLabel.CENTER),gbc);
        gbc.novaColuna();
        this.add(new JLabel(("Data Saida:"),JLabel.CENTER),gbc);
        gbc.novaLinha();
        this.add(this.numOS,gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0,0,0,0);
        this.add(new JLabel(" Tecnico: "),gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.WEST;
        this.add(this.campoTecnico,gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.EAST;
        this.add(new JLabel("Veiculo: "),gbc);
        gbc.novaColuna();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0,0,0,5);
        this.add(this.campoVeiculo,gbc);
        gbc.novaColuna();
        gbc.insets = new Insets(0,5,0,5);
        this.add(dataEntrada,gbc);
        gbc.novaColuna();
        this.add(dataSaida,gbc);

        gbc.fill = Gbc.HORIZONTAL;
        gbc.anchor = Gbc.WEST;
        gbc.insets = new Insets(5,5,0,5);
        gbc.gridwidth = 4;
        gbc.novaLinha();
        this.add(new LabelBackground(" Reclamação:", Color.LIGHT_GRAY),gbc);
        gbc.novaColuna();
        this.add(new LabelBackground(" Laudo:", Color.LIGHT_GRAY),gbc);
        gbc.insets = new Insets(0,5,0,5);
        gbc.novaLinha();
        gbc.novoScroll(0,150);
        this.add(this.campoReclamacao,gbc);
        gbc.novaColuna();
        this.add(this.campoLaudo,gbc);
        gbc.novaLinha();
        gbc.novoLabel();
        gbc.insets = new Insets(5,5,0,5);
        gbc.gridwidth = 7;
        this.add(new LabelBackground(" Observação:",Color.LIGHT_GRAY),gbc);
        gbc.novaLinha();
        gbc.novoScroll(0,60);
        gbc.insets = new Insets(0,5,0,5);
        this.add(this.campoObs,gbc);

        gbc.novaLinha();
        gbc.ipady = 10;
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = Gbc.HORIZONTAL;
        this.add(this.buttonPanel,gbc);
    }

    private class LabelBackground extends JLabel{

        public LabelBackground(String str, Color color){
            super(str);
            setOpaque(true);
            setBackground(color);
        }
    }

    class buttonSalvar implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
        }
    }

    class buttonCancelar implements ActionListener{
        public void actionPerformed(ActionEvent e){
           dispose();
        }
    }

}
