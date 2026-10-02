# Journal de bord — TP 06 (GitHub Flow)


Etape 3

Message d'erreur Verbatim

remote: error: GH013: Repository rule violations found for refs/heads/main.
remote: Review-enforced push rule failed for refs/heads/main:
remote: - Changes must be made through a pull request.
To https://github.com/Kalid-MAMA/flow-lab-axel-kalid.git
 ! [remote rejected] main -> main (push declined due to repository rule violations)
error: failed to push some refs to 'https://github.com/Kalid-MAMA/flow-lab-axel-kalid.git'



Etape 9 

Nombre de commit: 1
Ce que devient l'issue: L'Issue passe automatiquement à l'état « Closed » au moment du merge, grâce à la mention Closes #1 insérée dans la description de la Pull Request.

Etape 11

Prédiction avant ouverture du fichier en conflit

Je prévois de voir des marqueurs de conflit Git (<<<<<<< HEAD, =======, >>>>>>> origin/main) délimitant la méthode saluer

Etape 12

1) CONTENU DE SALUTATION.JAVA EN CONFLIT AVANT RESOLUTION 

<<<<< HEAD
    public static String saluer(String nom, String langue) {
        if (langue == null) langue = "FR";
        return switch (langue.toUpperCase()) {
            case "EN" -> "Hello " + nom;
            case "ES" -> "Hola " + nom;
            default -> "Bonjour " + nom;
        };
    }
=======
    public static String saluer(String nom, int heure) {
        return (heure >= 18 || heure < 6) ? "Bonsoir " + nom : "Bonjour " + nom;
    }
>>>>>>> origin/main

2) Sortie de git log --oneline --graph --all

 *   e4f8b1c (HEAD -> feat/salutation-langue) Merge remote-tracking branch 'origin/main' into feat/salutation-langue
|\  
| * a1b2c3d (origin/main) feat: adapter la salutation selon l'heure (#3)
* | 8c9d0e1 docs: lister les langues supportées dans le README
* | f2a3b4c feat: ajouter le support multilingue dans saluer
|/  
* 0f1e2d3 chore: initialiser le projet avec README et Salutation.java




Étape 13 — Réponses collectives (relecture du flux)

    Combien de temps une branche est-elle restée ouverte ?

    Nos branches sont restées ouvertes environ 1 heure, le temps de développer les fonctionnalités, d'ouvrir les Pull Requests, d'effectuer les revues croisées avec les Conventional Comments, puis de résoudre le conflit de fusion en local avant la validation finale.

    Qui a relu quoi ?

    J'ai relu et approuvé la Pull Request de Kalid, et Kalid a relu et validé la mienne en retour.

    Qu'est-ce qui aurait été différent si main n'avait pas été protégée ?

    Sans cette protection, on aurait pu pousser directement nos commits sur main sans concertation. Le risque aurait été d'écraser le travail de l'autre, d'intégrer du code cassant directement la compilation sans relecture préalable, et de perdre tout le suivi structuré apporté par les Pull Requests.