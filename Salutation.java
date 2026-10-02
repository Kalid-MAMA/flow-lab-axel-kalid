public class Salutation {

    public static String saluer(String nom, String langue) {
        if (langue == null) {
            langue = "FR";
        }
        return switch (langue.toUpperCase()) {
            case "EN" -> "Hello " + nom;
            case "ES" -> "Hola " + nom;
            default -> "Bonjour " + nom;
        };
    }

    public static void main(String[] args) {
        System.out.println(saluer("Monde", "FR"));
        System.out.println(saluer("World", "EN"));
        System.out.println(saluer("Mundo", "ES"));
    }
}