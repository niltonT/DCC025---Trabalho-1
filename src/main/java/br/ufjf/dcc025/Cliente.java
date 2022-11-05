package br.ufjf.dcc025;

import br.ufjf.dcc025.Cliente;

public class Cliente {
 
    private String nome;
    private String sobrenome;
    private int cpf;

    Cliente(){
        this.nome = "";
        this.sobrenome = "";
        this.cpf = 0;
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome.toUpperCase();
    }

    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = Integer.parseInt(cpf);
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public int getCpf(){
        return this.cpf;
    }
}
