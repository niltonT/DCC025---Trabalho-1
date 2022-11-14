package br.ufjf.dcc025.gui;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import br.ufjf.dcc025.utils.*;

public class NovaOS extends JFrame{
    
    private static int totalOS;

    static{
        totalOS = 0;
    }

    private int LARGURA = 940;
    private int ALTURA = 400;

    private int numeroOS;
    
    private JPanel textFieldPanel;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JPanel numOSPanel;
    private JPanel datePanel;
    private JPanel buttonPanel;
    
    private JTextField campoCliente;
    private JTextField campoTecnico;
    private JTextField campoPlaca;
    private JTextField campoVeiculo;
    private JTextField numOS;
    private JTextField dataEntrada;
    private JTextField dataSaida;
    
    private JScrollPane campoReclamacao;
    private JScrollPane campoLaudo;
    private JScrollPane campoObs;

    private JButton buttonSalvar;
    private JButton buttonFechar;
    private JButton buttonBuscar;
    
    private Gbc gbc;
    
    public NovaOS(){
        super("Ordem de Serviço");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(LARGURA,ALTURA);
        //this.setResizable(false);
        this.setLayout(new GridBagLayout());
        
        this.numeroOS = totalOS + 1;

        this.textFieldPanel = new JPanel(new GridBagLayout());
        //this.textFieldPanel.setAlignmentX(RIGHT_ALIGNMENT);
        this.northPanel = new JPanel(new BorderLayout(12,0));
        this.centerPanel = new JPanel(new GridBagLayout());
        this.numOSPanel = new JPanel(new GridLayout(2,0,12,0));
        this.datePanel = new JPanel(new GridLayout(2,2,12,0));
        this.buttonPanel = new JPanel(new GridLayout(1,3,20,0));

        /*gbc = new Gbc();
        gbc.insets = new Insets(0,5,3,5);
        this.add(northPanel,gbc);
        gbc.novaLinha();
        this.add(centerPanel,gbc);*/


        //this.numOSPanel.add(new JLabel("N° OS:",JLabel.CENTER));
        this.numOS = new JTextField(5);
        this.numOS.setForeground(new Color(255,0,0));
        this.numOS.setBackground(new Color(255,255,255));
        this.numOS.setHorizontalAlignment(JTextField.CENTER);
        this.numOS.setText(Integer.toString(this.numeroOS));
        this.numOS.setEditable(false);
        //this.numOSPanel.add(this.numOS);
        
        this.campoCliente = new JTextField(25); 
        this.campoTecnico = new JTextField(20);
        this.campoPlaca = new JTextField(7);
        this.campoVeiculo = new JTextField(20);
        this.dataEntrada = new JTextField(9);
        this.dataSaida = new JTextField(9);

        gbc = new Gbc();
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
        
        
        this.dataEntrada.setHorizontalAlignment(JTextField.CENTER);
        this.dataEntrada.setForeground(new Color(255,0,0));
        this.dataEntrada.setBackground(new Color(255,255,255));
        this.dataEntrada.setText(getDataAtual());
        this.dataEntrada.setEditable(false);
        this.dataSaida.setHorizontalAlignment(JTextField.CENTER);

        //this.datePanel.add(new JLabel(("Data Entrada:"),JLabel.CENTER));
        //this.datePanel.add(new JLabel(("Data Saida:"),JLabel.CENTER));
        //this.datePanel.add(dataEntrada);
        //this.datePanel.add(dataSaida);

        /*gbc = new Gbc();
        gbc.anchor = Gbc.LINE_START;
        gbc.fill = Gbc.HORIZONTAL;
        gbc.insets = new Insets(0,5,0,5);
        this.add(numOSPanel);
        gbc.novaColuna();
        this.add(textFieldPanel,gbc);
        gbc.novaColuna();
        this.add(datePanel,gbc);*/
        this.campoReclamacao = this.setScrollPane();
        this.campoLaudo = this.setScrollPane();
        this.campoObs = this.setScrollPane();

       /*
        gbc = new Gbc();
        gbc.fill = Gbc.BOTH;
        gbc.anchor = Gbc.LINE_START;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(2,2,0,2);
        */
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
        /* 
        gbc.novoLabel();
        gbc.gridwidth = 2;
        gbc.insets = new Insets(2,2,0,2);
        gbc.insets = new Insets(0,2,0,2);
        gbc.gridwidth = 0;
        gbc.novoScroll(0, 60);
        gbc.gridwidth = 2;
        */

        this.buttonSalvar = new JButton("SALVAR");
        this.buttonBuscar = new JButton("BUSCAR");
        this.buttonFechar = new JButton("FECHAR");
        
        this.buttonPanel.add(this.buttonSalvar);
        this.buttonPanel.add(this.buttonBuscar);
        this.buttonPanel.add(this.buttonFechar);

        /*gbc = new Gbc();
        gbc.gridx = 0;
        gbc.gridy = 4;*/
        gbc.novaLinha();
        gbc.ipady = 10;
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = Gbc.HORIZONTAL;
        //gbc.insets = new Insets(10,0,10,0);
        this.add(this.buttonPanel,gbc);
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

    private class LabelBackground extends JLabel{

        public LabelBackground(String str, Color color){
            super(str);
            setOpaque(true);
            setBackground(color);
        }
    }

}
