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
    private String nome;
    private boolean statoIntegrita;
    private boolean ingegnere;
    
    //costruttore della classe
    public Modulo(String nome, boolean statoIntegrita){
        this.nome = nome;
        this.statoIntegrita = statoIntegrita;
    }
    
    //set e get del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIng(boolean ing){
        this.ingegnere = ing;
    }
    
    //set e get dello statoIntegrita
    public void setStatoIntegrita(boolean statoIntegrita){
        this.statoIntegrita = statoIntegrita;
    }
    public boolean getStatoIntegrita(){
        return statoIntegrita;
    }
    
    //motore in avaria da finire
    public void motoreInAvariaModulo(){
        if(ingegnere == true){
            
        }
        else{
            System.out.println(" non c'e' l' ingegnere ");
        }
    }
}
