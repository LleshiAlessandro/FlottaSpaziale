/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import java.util.Random;

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
    
    //cura dell equipaggio
    public int curaEquipaggio(){
                int rdn = new Random().nextInt(10);
        if(rdn > 8){
            salute += 100;
        }
        else if (rdn < 8 && rdn > 3){
            salute+= 30;
        }
        else if (rdn < 3){
            salute += 10;
        }
        return salute;
    }
    
    public boolean checkRuolo(){
        if (ruolo.equals("ingegnere")){
            return true;
        }
        else{
            return false;
        }
    }
}
