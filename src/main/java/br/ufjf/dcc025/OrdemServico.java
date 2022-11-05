package br.ufjf.dcc025;

public class OrdemServico {
    
    private int      id;
    private Veiculo  veiculo;
    private Cliente  cliente;
    private Endereco endereco;

    OrdemServico(){
        this.veiculo = new Veiculo();
        this.cliente = new Cliente();
        this.endereco = new Endereco();
    };

    public void setCliente(String nome, String sobrenome, String cpf){
        this.cliente.setNome(nome);
        this.cliente.setSobrenome(sobrenome);
        this.cliente.setCpf(cpf);
    }

    public void setEndereco(String endereco, String cep, int numero, String complemento){
        this.endereco.setEndereco(endereco);
        this.endereco.setCep(cep);
        this.endereco.setNumero(numero);
        this.endereco.setComplemento(complemento);
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

}
