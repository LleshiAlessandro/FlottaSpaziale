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
public class MembroEquipaggio {
    private String nome;
    private String ruolo;
    private int salute;
    private boolean stato;
    
    //costruttore della classe
    public MembroEquipaggio(String nome,String ruolo,int salute,boolean stato){
        this.nome = nome;
        this.ruolo = ruolo;
        this.salute = salute;
        this.stato = stato;
    }
    
    //set e get del nome
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //set e get del ruolo
    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }
    public String getRuolo(){
        return ruolo;
    }
    
    //set e get della salute
    public void setSalute(int salute){
        this.salute = salute;
    }
    public int getSalute(){
        return salute;
    }
}
