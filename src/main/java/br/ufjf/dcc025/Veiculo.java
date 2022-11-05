package br.ufjf.dcc025;

import java.util.Calendar;
import java.util.Date;

public class Veiculo {
    
    private String   montadora;
    private String   modelo;
    private int      ano;
    private String   placa;

    Veiculo(){
        this.montadora = "";
        this.modelo    = "";
        this.placa     = "";
        this. ano      = 0;
    };

    public void setMontadora(String montadora){
        this.montadora = montadora;
    };

    public void setModelo(String modelo){
        this.modelo = modelo;
    };

    public void setAno(int ano){
        Date data = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        if(ano > 1900 && ano < calendar.get(Calendar.YEAR) + 1){
            this.ano = ano;
        }
    };

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

    public int getAno(){
        return this.ano;
    };

    public String getPlaca(){
        return this.placa;
    };
}
