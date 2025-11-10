/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import java.util.ArrayList;

/**
 *
 * @author lleshi.alessandro
 */
public class Flotta {
    private String nome;
    private ArrayList<Astronave> astronavi = new ArrayList();
    
    //costruttore della classe
    public Flotta(String nome){
        this.nome = nome;
    }
    
    //set e get del nome della flotta
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    //get numero delle astronavi che ci snon nella flotta
    public int getNumAtronaviInFlotta(){
        return astronavi.size();
    }
}
