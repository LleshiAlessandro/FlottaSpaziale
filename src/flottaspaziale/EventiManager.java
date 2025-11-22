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
    
    //costruttore della classe
    public EventiManager(int r){
        r = rdn.nextInt(4) + 1;//random da 1 a 4, che mi sceglie l'evento della classe enum
    }
    
    //enumerato degli eventi, ci sono i miei eventi
    enum Evento{
        alieniABordo,//alieni a bordo, può essere buono o cattivo, se è buono faccio che cura l' astronave,
                     //anche l'equiapggio e dona delle nuove tecnologie, + moduli,
                     //se è cattivo distrugge l'astronave FATTO (non sono sicuro quidni chiedere al prof)
        cura,//cura per l'equipaggio FATTO
        riparazione,//riparazione della astronave FATTO
        asteroide,//la astronave finisce su un campo di asteroidi subisce danni FATTO
        avariaMotore,//il motore di un astronave va in avaria e viene distrutta la nave FARE
        traditore,//in base al suo ruolo cambia quello che fa ad esembio ingegnere sabota il motore, etc etc DA FARE
        malattiaAliena,//uccide la metà dei membri FATTO (non sono sicuro quidni chiedere al prof)
        guastoModulo,//cambia lo stato del modulo e lo disattiva(modulo: ATTIVO; modulo: NON ATTIVO), quindi puoi perdere una nave DA FARE
        bucoNero;//ti viene rimossa metà della flotta FATTO (non sono sicuro quidni chiedere al prof)
    }
    
    //metodo per gestire il mio enumerato del mio Evento
    public void gestioneEventi(){
        
    }
}
