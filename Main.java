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
        System.out.println("1 -> " + p1.getNome());
        // stampo il valore dell'attributo nome
        // cosa ottengo?
        
        // invoco il metodo setNome per impostare il nome
        // cosa ottengo?
        p1.setNome("Antonio");
        // p1.cognome = "Verdi"; 
        /* non posso modificare direttamente all'attributo cognome 
         * perché è privato. Implementare nella classe Persona un metodo
         * pubblico per modificare il cognome
         */
        
        System.out.println("2 -> " +  p1.getNome());
        // stampo il valore dell'attributo nome
        // cosa ottengo?
        
        // System.out.println(p1.cognome);
        /* non posso accedere direttamente all'attributo cognome 
         * perché è privato. Implementare nella classe Persona un metodo
         * pubblico per leggere il cognome; 
         */
        
        /* Istanziare un nuovo oggetto (p2) della classe persona, modificare
         * nome e cognome 
         *
         */
        
        
    }
}
