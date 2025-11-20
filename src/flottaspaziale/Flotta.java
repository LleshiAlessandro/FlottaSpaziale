/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import java.util.ArrayList;
import java.util.Random;

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
    public int getNumAstronaviInFlotta(){
        return astronavi.size();
    }
    
    //aggiungo e rimuovo un astronave dalle astronavi
    public ArrayList<Astronave> addAstronave(Astronave a1){
        astronavi.add(a1);
        return astronavi;
    }
    public ArrayList<Astronave> removeAstronave(Astronave a1){
        astronavi.remove(a1);
        return astronavi;
    }
    
    //scelgo l'astronave randomica dalla flotta, alla quale capiterà un evento
    Random astr = new Random();
    Astronave astrRandom = astronavi.get(astr.nextInt(astronavi.size()));
    
    //richiamo l'impatto del meteorite
    public void impattoMeteoriteFlotta(){
        astrRandom.impattoMeteoriteAstronave();
    }
    
    //richiamo la cura dell astronave
    public void riparazione(){
        astrRandom.riparazioneAstronave();
    }
    
    //motore in avaria
    public void motoreInAvariaFlotta(){
    Random astronaves = new Random();
    int probabilitaDiSalvataggio = new Random().nextInt(1, 10);
    Astronave a1= astronavi.get(astronaves.nextInt(astronavi.size()));
        if(a1.checkMembers() == false){
            astronavi.remove(a1);
        }
        if(probabilitaDiSalvataggio <= 3){
            astronavi.remove(a1);
        }
    }
    
    //buco nero
    public ArrayList<Astronave> bucoNero(){
        int half = astronavi.size()/2;
        ArrayList astronaviDaRimuovere = new ArrayList(half);
        for (Astronave x : astronavi){
            astronaviDaRimuovere.add(x);
        }
        for (int i = 0; i < astronaviDaRimuovere.size(); i++){
            astronavi.remove(astronaviDaRimuovere);
        }
        return astronavi;
    }
    
    //malattia aliena
    public void malattiaAlienaFlotta(){
        astrRandom.malattiaAlienaAstronave();
    }
}
