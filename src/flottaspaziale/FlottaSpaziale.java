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

        
        
        //introduzione del gioco
        System.out.println(" QUESTA E' L'INTRODUZIONE DEL GIOCO : " + "\n" +
                         " tu sei un astronauta che fa parte di una flotta di astronavi spaziali." + "\n" + 
                         " Nell'astronave tu avrai dei compagni e dei moduli che insieme a te compongono la tua astronave, " + "\n" +
                         " dovrai iniziare un viaggio nell'ignoto sei pronto ?");
        System.out.println("");
        
        
        //flotta
        System.out.println("che nome dai alla tua flotta ? ");
        String nomeFlotta = lettore.next();
        System.out.println("da quante navi e' composta la tua flotta ? ");
        int numNavi = lettore.nextInt();
        
        Flotta flotta = new Flotta(nomeFlotta);
        
        //fa andare avanti il viaggio
        for(int i = 0; i < numNavi; i++){

            //astronave
            System.out.println("che nome dai alla tua astronave ? ");
            String nomeAstronave = lettore.next();
            System.out.println("quanti membri ha la tua astronave ? ");
            int numEquipaggio = lettore.nextInt();
            System.out.println("quanti moduli ha la tua astronave ? ");
            int numModuli = lettore.nextInt();

            



            System.out.println("");

            //astronave
            Astronave astronavi = new Astronave();
            flotta.addAstronave(astronavi);
            
            
            //aggiungo i membri dell' equipaggio in base a quanti ne ha scelti l'utente
            for(int j = 0; j < numEquipaggio; j++){
                //membro equipaggio
                System.out.println(" che nome dai al tuo membro dell' equipaggio ? ");
                String nomeEquipaggio = lettore.next();
                
                System.out.println(" che ruolo dai al tuo membro dell' equipaggio ? comandante, ingegnere, soldato, medico ");
                String ruolo = lettore.next();
                
                //membro equipaggio
                MembroEquipaggio equipaggio = new MembroEquipaggio(nomeEquipaggio, ruolo);
                astronavi.addMembro(equipaggio);
            }
            
            
            //aggiungo i moduli in base a quanti ne ha scelti l'utente
            for(int j = 0; j < numModuli; j++){
                //moduli
                System.out.println(" che nome dai al modulo della tua astronave ? " + "\n" + "motore, alieno, propulsore, armi, salaComandi, " + "\n" + "porteDiScurezza, dormitorio, scudo,  gravita, teletrasporto");
                Modulo.NomiModuli nomeModulo = Modulo.fromString(lettore.next());
                
                //modulo
                Modulo moduli = new Modulo(nomeModulo);
                astronavi.addModulo(moduli);
            }


            EventiManager events = new EventiManager();

            flotta.eventoCasuale(events.generazioneEventi());
            
            
            
            System.out.println(flotta + "\n"
                               + " ha un numero di astronavi pari a : " + flotta.getNumAstronaviInFlotta() +"\n"
                               + "l' astronave : " + nomeAstronave + "\n"
                               + "dati astronave : " + "\n"
                               + " il numero di membri che compongono l'astronave sono : " + astronavi.getNumEquipaggio() + "\n"
                               + " il numero di moduli che appartengo all'astronave sono : " + astronavi.getNumModulo());
            System.out.println("caratteristiche membro equipaggio : ");
            for(MembroEquipaggio m: astronavi.equipaggio){
                System.out.println(" il nome del membro e' : " + m.nome + "\n" +
                                    " il suo ruolo e' : " + m.ruolo + "\n");
            }
            System.out.println("caratteristiche modulo : ");
            for(Modulo m: astronavi.moduli){
                System.out.println(" il nome del membro e' : " + m.nome);
            }
        }
        
        
        
    }
    
}
