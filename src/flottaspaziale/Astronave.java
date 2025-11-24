/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import flottaspaziale.Modulo.NomiModuli;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lleshi.alessandro
 */
public class Astronave {
    private String nome;
    private ArrayList <MembroEquipaggio> equipaggio = new ArrayList();
    private ArrayList <Modulo> moduli = new ArrayList(); //faccio partire la lista di moduli con il motore
    private int vita;

    //costruttore della classe
    public Astronave(){
        this.vita = 100;
    }
    
    //membro dell equipaggio random
    Random membr = new Random();

    

    
    //costruttore della classe
    public Astronave(String n){
        this.nome = n;
    }
    
    //get dei membri
    public ArrayList<MembroEquipaggio> getEquipaggio(){
        return equipaggio;
    }
    
    //get dei moduli
    public ArrayList<Modulo> getModulo(){
        return moduli;
    }
    
    //set e get della vita
    public void setVita(int vita){
        this.vita = vita;
    }
    public int getVita(){
        return vita;
    }
    
    //get del numero dei membri (ritorna un intero. Un solo numero)
    public int getNumEquipaggio(){
        return equipaggio.size();
    }
    
    //get del numero dei moduli (ritorna un intero. Un solo numero)
    public int getNumModulo(){
        return moduli.size();
    }
    
    //aggiungi un membro e rimuovi un membro dalla lista dell' equipaggio
    public ArrayList<MembroEquipaggio> addMembro(MembroEquipaggio m1){
        equipaggio.add(m1);
        return equipaggio;
    }
    public ArrayList<MembroEquipaggio> removeMembro(MembroEquipaggio m1){
        equipaggio.remove(m1);
        return equipaggio;
    }
    
    //aggiungi un modulo e rimuovi un modulo dalla lista deli moduli
    public ArrayList<Modulo> addModulo(Modulo m1){
        moduli.add(m1);
        return moduli;
    }
    public ArrayList<Modulo> removeModulo(Modulo m1){
        moduli.remove(m1);
        return moduli;
    }
    
    //fare i metodi per la gestione degli eventi
    
    //impatto meteorite
    public int impattoMeteoriteAstronave(){
        int rdn = new Random().nextInt(10);
        if(rdn > 8){
            vita = 100;
        }
        else if (rdn < 8 && rdn > 3){
            vita-= 50;
        }
        else if (rdn < 3){
            vita = 0;
        }
        return vita;
    }

    //cura dell equipaggio
    public void curaEquipaggioAstronave(){
        MembroEquipaggio membroRandom = equipaggio.get(membr.nextInt(equipaggio.size()));
        membroRandom.curaEquipaggio();
    }
    
    //riparazione dell'astronave
    public int riparazioneAstronave(){
        int rdn = new Random().nextInt(10);
        if(rdn > 8){
            vita += 100;
        }
        else if (rdn < 8 && rdn > 3){
            vita+= 30;
        }
        else if (rdn < 3){
            vita += 10;
        }
        return vita;
    }
    
    //check member x l'ingegnere
    public boolean checkMemberIngegnere(){
    boolean i = true;
        for (MembroEquipaggio x : equipaggio){
            if (x.checkRuolo() == false){
                i = false;
            }
            i = true;
        }
        return i;
    }
    
    //check member x il medico
    public boolean checkMemberMedico(){
    boolean i = true;
        for (MembroEquipaggio x : equipaggio){
            if (x.checkRuolo() == false){
                i = false;
            }
            i = true;
        }
        return i;
    }
    
    //malattia aliena
    public ArrayList<MembroEquipaggio> malattiaAlienaAstronave(){
        int half = equipaggio.size()/2;
        ArrayList equipaggioDaRimuovere = new ArrayList(half);
        for (MembroEquipaggio x : equipaggio){
            equipaggioDaRimuovere.add(x);
        }
        for (int i = 0; i < equipaggioDaRimuovere.size(); i++){// in caso servisse un foreach si può fare
            equipaggio.remove(equipaggioDaRimuovere);
        }
        return equipaggio;
    }
    
    //controllo se l'alieno è buono(1) o cattivo(2) x alieni a bordo
    public int checkAlienAstronave(){
        int checkAlien = 0;
        int randAlien = new Random().nextInt(1, 2);
        
        // alieno buono
        if(randAlien == 1){
            checkAlien = randAlien;
        }
        
        // alieno cattivo
        else if(randAlien == 2){
            checkAlien = randAlien;
        }
        return checkAlien; //returna 1 o 2
    }
    
    //cosa fa l' alieno a bordo buono: cura l'astronave e aggiunge dei moduli
    public int curaAstronave(){
        int rdn = new Random().nextInt(1, 10);
        if(rdn > 8){
            vita = 100;
        }
        else if (rdn < 8 && rdn > 3 && vita <= 70){
            vita+= 30;
        }
        else if (rdn < 3){
            vita += 10;
        }
        return vita;
    }
    public ArrayList<Modulo> addModuloAlieno(){
        Modulo m = new Modulo(NomiModuli.alieno);
        if (!moduli.contains(m)){
            moduli.add(m);
        }                
        return moduli;
    }
    
    @Override
    public String toString(){
        return " il  nome dell' astronave e' : " + nome + "\n" + " la vita dell' astronave e' : " + vita + "\n" + " il numero di membri che compongolo l'equipaggio dell' astronave sono : " + equipaggio.size() + "\n" + "i moduli che compongolo l' astronave sono : " + moduli.size();
    }
}
