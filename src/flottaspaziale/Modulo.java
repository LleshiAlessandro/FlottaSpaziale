/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

/**
 *
 * @author lleshi.alessandro
 */
public class Modulo {
    private NomiModuli nome;
    private boolean statoIntegrita;
    
    
    public enum NomiModuli{
        motore,
        alieno,
        propulsore,
        armi,
        salaComandi,
        porteDiScurezza,
        dormitorio,
        scudo,
        gravita,//modulo per riportare la gravità nell'astronave
        teletrasporto;
    }
    
    //costruttore della classe
    public Modulo(NomiModuli nome, boolean statoIntegrita){
        this.nome = nome;
        this.statoIntegrita = statoIntegrita;
    }
    
    //set e get del nome
    public void setNome(NomiModuli nome){
        this.nome = nome;
    }
    public NomiModuli getNome(){
        return nome;
    }
    
    //set e get dello statoIntegrita
    public void setStatoIntegrita(boolean statoIntegrita){
        this.statoIntegrita = statoIntegrita;
    }
    public boolean getStatoIntegrita(){
        return statoIntegrita;
    }
    
}
