/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import flottaspaziale.EventiManager.Evento;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lleshi.alessandro
 */
public class Flotta {
    private String nome;
    private ArrayList<Astronave> astronavi = new ArrayList();
    private Astronave astrRandom;
    
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
    

    
    //richiamo l'impatto del meteorite FATTO
    public void impattoMeteoriteFlotta(){
        astrRandom.impattoMeteoriteAstronave();
    }
    
    //richiamo la cura dell astronave FATTO
    public void riparazione(){
        astrRandom.riparazioneAstronave();
    }
    
    //cura dell equipaggio FATTO
    public void curaEquipaggioFlotta(){
        astrRandom.curaEquipaggioAstronave();
    }
    
    //motore in avaria FATTO
    public void motoreInAvariaFlotta(){
    Random astronaves = new Random();
    int probabilitaDiSalvataggio = new Random().nextInt(11);
    Astronave a1= astronavi.get(astronaves.nextInt(astronavi.size()));
        if(a1.checkMemberIngegnere() == false){
            astronavi.remove(a1);
        }
        if(probabilitaDiSalvataggio <= 3){
            astronavi.remove(a1);
        }
    }
    
    //buco nero FATTO
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
    
    //malattia aliena FATTO
    public void malattiaAlienFlotta(){
    int probabilitaDiSalvataggio = new Random().nextInt(11);
        if(astrRandom.checkMemberMedico() == false){
            astrRandom.malattiaAlienaAstronave();
        }
    }
    
    //richiamo alieni a bordo FATTO
    public void AlienABordo(){
        //alieno buono cura l'astronave e l'equipaggio, aggiunge dei moduli alieni
        if(astrRandom.checkAlienAstronave() == 1){
            astrRandom.curaAstronave(); //ripara l'astronave
            astrRandom.addModuloAlieno(); //da vedere se è giusto con il prof
            astrRandom.curaEquipaggioAstronave(); //cura l'equipaggio dell' astronave
        }
        //alieno cattivo distrugge una nave
        else if(astrRandom.checkAlienAstronave() == 2){
            astronavi.remove(astrRandom);
        }
    }
    
    public void eventoCasuale(Evento generazineEventi){
        //scelgo l'astronave randomica dalla flotta, alla quale capiterà un evento
        Random astr = new Random();
        astrRandom = astronavi.get(astr.nextInt(astronavi.size()));

        //alieni a bordo
        if(generazineEventi == Evento.alieniABordo){
            this.AlienABordo();
        }
        
        //impatto meteorite
        if(generazineEventi == Evento.asteroide){
            this.impattoMeteoriteFlotta();
        }
        
        //malattia aliena
        if(generazineEventi == Evento.malattiaAliena){
            this.malattiaAlienFlotta();
        }
        
        //cura
        if(generazineEventi == Evento.riparazione){
            this.riparazione();
        }
        
        //motore in avaria
        if(generazineEventi == Evento.avariaMotore){
            this.motoreInAvariaFlotta();
        }
        
        //cura dell' equipaggio
        if(generazineEventi == Evento.cura){
            this.curaEquipaggioFlotta();
        }
        
        //buco nero
        if(generazineEventi == Evento.cura){
            this.bucoNero();
        }
    }
    
    @Override
    public String toString(){
        return "il nome della flotta e' : " + nome + "\n" + " il numero di astronavi contenute nella flotta e' : " + getNumAstronaviInFlotta();
    }
}
