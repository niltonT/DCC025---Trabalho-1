package br.ufjf.dcc025;

public class Endereco {
    
    private String endereco;
    private String cep;
    private int numero;
    private String complemento;

    Endereco(){
        this.endereco = "";
        this.cep =  "00000-000";
        this.numero = 0;
        this.complemento = "";
    };

    public void setEndereco(String endereco){
        this.endereco = endereco;
    };

    public void setCep(String cep){
        if(cep.length() == 8){
            String aux = cep.substring(6,9);
            this.cep = cep.substring(0,6) + "-" + aux;
        }
    };

    public void setNumero(int numero){
        this.numero = numero;
    };

    public void setComplemento(String complemento){
        this.complemento = complemento;
    };

    public String getEndereco(){
        return this.endereco;
    };

    public String getCep(){
        return this.cep;
    };

    public int getNumero(){
        return this.numero;
    };

    public String getComplemento(){
        return this.complemento;
    }
}
