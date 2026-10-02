// Starting point for TP 06. One method, one line per member: the conflicts are real because
// everyone edits the same place, which is exactly what happens on a shared codebase.
public class Salutation {

  public static void main(String[] args) {
    System.out.println(saluer("user"));
  }

  // Salutation selon l'heure : avant 12h, de 12h à 18h, puis le soir.
  static String saluer(String nom) {
    // TODO: chaque membre du groupe ajoute ICI sa salutation, dans sa propre branche.
    int heure = java.time.LocalTime.now().getHour();
    if (heure < 12) {
      return "Bonjour, " + nom + " !";
    } else if (heure < 18) {
      return "Bon après-midi, " + nom + " !";
    }
    return "Bonsoir, " + nom + " !";
  }
}
