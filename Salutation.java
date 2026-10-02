import java.time.LocalTime;

public class Salutation {

    /**
     * Salue une personne selon la langue choisie et l'heure de la journée.
     * Supporte le français (FR), l'anglais (EN) et l'espagnol (ES).
     */
    public static String saluer(String nom, String langue) {
        int heure = LocalTime.now().getHour();

        if (langue != null && langue.equalsIgnoreCase("EN")) {
            return (heure < 12) ? "Good morning, " + nom + " !" : "Good evening, " + nom + " !";
        }
        if (langue != null && langue.equalsIgnoreCase("ES")) {
            return (heure < 12) ? "Buenos días, " + nom + " !" : "Buenas tardes, " + nom + " !";
        }

        // Par défaut en français (FR)
        if (heure < 12) {
            return "Bonjour, " + nom + " !";
        } else if (heure < 18) {
            return "Bon après-midi, " + nom + " !";
        } else {
            return "Bonsoir, " + nom + " !";
        }
    }

    public static void main(String[] args) {
        // Démonstration des salutations selon la langue et le moment de la journée
        System.out.println(saluer("Kalid", "FR"));
        System.out.println(saluer("Axel", "EN"));
        System.out.println(saluer("Monde", "ES"));
    }
}