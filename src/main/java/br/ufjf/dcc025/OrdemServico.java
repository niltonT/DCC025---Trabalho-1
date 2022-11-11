package br.ufjf.dcc025;

import javax.swing.*;
import java.awt.*;

public class OrdemServico extends JFrame {
    
    private int id;
    private Veiculo veiculo;
    private Cliente cliente;
    

    OrdemServico(){ 
        this.veiculo = new Veiculo();
        this.cliente = new Cliente();
    };

    public void setCliente(String nome, String sobrenome, String cpf){
        this.cliente.setNome(nome);
        this.cliente.setCpf(cpf);
    }

    public Cliente getCliente(){
        return this.cliente;
    }

};