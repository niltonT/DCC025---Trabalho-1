package br.ufjf.dcc025.obj;

public class Veiculo {
    
    private String   montadora;
    private String   modelo;
    private String   anoFab;
    private String   anoModelo;   
    private String   placa;

    public Veiculo(){
        this.montadora = "";
        this.modelo    = "";
        this.placa     = "";
        this.anoFab    = "";
        this.anoModelo = "";
    };

    public void setMontadora(String montadora){
        this.montadora = montadora;
    };

    public void setModelo(String modelo){
        this.modelo = modelo;
    };

    public void setAnoModelo(String ano){
        this.anoModelo = ano;
    };

    public void setAnoFab(String ano){
        this.anoFab = ano;
    }

    public void setPlaca(String placa){
        if(placa.length() == 7){
            this.placa = placa;
        }
    };

    public String getMontadora(){
        return this.montadora;
    };

    public String getModelo(){
        return this.modelo;
    };

    public String getAnoModelo(){
        return this.anoModelo;
    };

    public String getAnoFab(){
        return this.anoFab;
    }

    public String getPlaca(){
        return this.placa;
    };
}
