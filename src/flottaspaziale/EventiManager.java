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
public class EventiManager {
    private Random rdn = new Random();
    private int i = rdn.nextInt(4) + 1;//random da 1 a 4, che mi sceglie l'evento della classe enum
    
    //costruttore della classe
    public EventiManager(){
        
    }
    
    //enumerato degli eventi, ci sono i miei eventi
    enum Evento{
        alieniABordo,//alieni a bordo, danneggia o la naveo l'intera flotta
        cura,//cura per l'equipaggio
        riparazione,//riparazione della astronave o della flotta intera
        asteroide;//la astronave o la flotta finisce su un campo di asteroidi
    }
}
