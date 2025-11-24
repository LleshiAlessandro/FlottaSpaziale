/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import java.util.Scanner;


/**
 *
 * @author lleshi.alessandro
 */
public class FlottaSpaziale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        
        //flotta
        System.out.print("che nome dai alla tua flotta ? ");
        String nomeFlotta = lettore.next();
        System.out.print("da quante navi e' composta la tua flotta ? ");
        int numNavi = lettore.nextInt();
        
        //astronave
        System.out.print("che nome dai alla tua astronave ? ");
        String nomeAstronave = lettore.next();
        System.out.print("quanti membri ha la tua astronave ? ");
        int numEquipaggio = lettore.nextInt();
        System.out.print("quanti moduli ha la tua astronave ? ");
        int numModuli = lettore.nextInt();
        
        //membro equipaggio
        System.out.print("che nome dai al tua membro dell' equipaggio ? ");
        String nomeEquipaggio = lettore.next();
        System.out.print("che ruolo dai al tuo membro dell' equipaggio ? ");
        String ruolo = lettore.next();
        
        //moduli
        System.out.print("che nome dai al modulo della tua astronave ? ");
        Modulo.NomiModuli nomeModulo = Modulo.fromString(lettore.next());
        
        System.out.println("");
        
        //flotta
        Flotta flotta = new Flotta(nomeFlotta);
        
        //astronave
        Astronave astronavi = new Astronave();
        
        //membro equipaggio
        MembroEquipaggio equipaggio = new MembroEquipaggio(nomeEquipaggio, ruolo);
        
        //modulo
        Modulo moduli = new Modulo(nomeModulo);
        
        flotta.addAstronave(astronavi);
        astronavi.addMembro(equipaggio);
        astronavi.addModulo(moduli);
        
        
        EventiManager events = new EventiManager();
        
        flotta.eventoCasuale(events.generazioneEventi());
        
        System.out.println(flotta + "\n"
                           + " ha un numero di astronavi pari a : " + flotta.getNumAstronaviInFlotta() +"\n"
                           + "l' astronave : " + nomeAstronave + "\n"
                           + "dati astronave : " + "\n"
                           + " il numero di membri che compongono l'astronave sono : " + astronavi.getNumEquipaggio() + "\n"
                           + " il numero di moduli che appartengo all'astronave sono : " + astronavi.getNumModulo() + "\n"
                           +"caratteristiche membro equipaggio : " + "\n"
                           + " il nome del membro e' : " + nomeEquipaggio +"\n"
                           + " il suo ruolo e' : " + ruolo + "\n"
                           + "caratteristiche modulo : " + "\n"
                           + " il nome del modulo e' : " + nomeModulo);
        System.out.println(String.valueOf(events));
        
        
        
    }
    
}
