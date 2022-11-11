package br.ufjf.dcc025;

import javax.swing.*;
import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        //AppGUI frame = new AppGUI();
        CadastraVeiculo frame = new CadastraVeiculo();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,350);
        frame.setVisible(true);
    }

}