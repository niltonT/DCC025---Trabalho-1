package br.ufjf.dcc025;

import br.ufjf.dcc025.gui.*;
import br.ufjf.dcc025.obj.*;

public class App 
{
    public static void main( String[] args )
    {
        AppGUI frame = new AppGUI();
        frame.setVisible(true);
        System.out.println("111");
        frame.printClientes();
    }

}