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
public class Astronave {
    private ArrayList <MembroEquipaggio> equipaggio = new ArrayList();
    private ArrayList <Modulo> moduli = new ArrayList();
    private int vita;
    
    //costruttore della classe
    public Astronave(){
    }
    
    //set e get dei membri
    public  void setEquipaggio(MembroEquipaggio membro){
        equipaggio.add(membro);
    }
    public ArrayList<MembroEquipaggio> getEquipaggio(){
        return equipaggio;
    }
    
    //set e get dei moduli
    public  void setModulo(Modulo moduls){
        moduli.add(moduls);
    }
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
    
}
