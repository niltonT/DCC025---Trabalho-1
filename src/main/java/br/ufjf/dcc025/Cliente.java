package br.ufjf.dcc025;

import br.ufjf.dcc025.Cliente;

public class Cliente {
 
    private String nome;
    private String cpf;
    private String endereco;
    private String complemento;
    private String bairro;
    private String celular;

    Cliente(){
        this.nome = "";
        this.cpf = "";
        this.endereco = "";
        this.complemento = "";
        this.bairro = "";
        this.celular = "";
    }

    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }

    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }
 
    public String getComplemento(){
        return this.complemento;
    }
    
    public String getBairro(){
        return this.bairro;
    }

    public String getCelular(){
        return this.celular;
    }
}
