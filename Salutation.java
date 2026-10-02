public class Salutation {

    static String saluer(String nom, String langue) {
        int heure = java.time.LocalTime.now().getHour();
        if (langue != null && langue.equalsIgnoreCase("EN")) {
            return (heure < 12) ? "Good morning, " + nom + " !" : "Good evening, " + nom + " !";
        }
        if (langue != null && langue.equalsIgnoreCase("ES")) {
            return (heure < 12) ? "Buenos días, " + nom + " !" : "Buenas tardes, " + nom + " !";
        }
        return (heure < 18) ? "Bonjour, " + nom + " !" : "Bonsoir, " + nom + " !";
    }

    public static void main(String[] args) {
        System.out.println(saluer("Monde", "FR"));
        System.out.println(saluer("World", "EN"));
    }
}