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
    
    //get del numero dei membri (ritorna un intero. Un solo numero)
    public int getNumEquipaggio(){
        return equipaggio.size();
    }
    
    //get del numero dei moduli (ritorna un intero. Un solo numero)
    public int getNumModulo(){
        return moduli.size();
    }
    
}
