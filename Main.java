/**
 * Aggiungi qui una descrizione della classe Main
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Main {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        // istanzio l'oggetto (p1) della classe Persona
        System.out.println("nome di p1 prima di setNome -> " + p1.getNome());
        // stampo il valore dell'attributo nome
        // cosa ottengo? null
        
        p1.setNome("Antonio");
        p1.setCognome("Rossi");
        
        System.out.println("nome di p1 dopo set-> " +  p1.getNome());
        System.out.println("cognome di p1 -> " +  p1.getCognome());
        
        /* Istanziare un nuovo oggetto (p2) della classe persona, modificare
         * nome e cognome 
         */
        Persona p2 = new Persona();
        p2.setNome("Luigi");
        p2.setCognome("Verdi");
        
        System.out.println("nome di p2 -> " +  p2.getNome());
        System.out.println("cognome di p2 -> " +  p2.getCognome());
                
        
        
    }
}
