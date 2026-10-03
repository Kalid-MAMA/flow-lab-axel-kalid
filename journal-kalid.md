# TP 06 — Travail collaboratif (GitHub Flow)
3. Activez la protection de `main` : Settings → Rules → Rulesets → « Require a pull request before
   merging », au moins **1 approbation**. Notez dans `journal.md` ce que la règle interdit
   exactement — testez-la en tentant un `git push` direct sur `main`, et collez le message de refus
   verbatim.

- La règle interdit de pousser directement sur main : tout changement doit
passer par une Pull Request, qui doit avoir au moins une approbation avant
d'être fusionnée. Ça vaut aussi pour moi, le propriétaire du dépôt.

- Message de refus de git push sur main :
remote: error: GH013: Repository rule violations found for refs/heads/main.
remote: Review all repository rules at https://github.com/Kalid-MAMA/flow-lab-axel-kalid/rules?ref=refs%2Fheads%2Fmain
remote:
remote: - Changes must be made through a pull request.
remote:
To https://github.com/Kalid-MAMA/flow-lab-axel-kalid.git
 ! [remote rejected] main -> main (push declined due to repository rule violations)
error: failed to push some refs to 'https://github.com/Kalid-MAMA/flow-lab-axel-kalid.git'


### 3 — La revue (25 min)
9. Approuvez la PR que vous avez relue, puis fusionnez-la en **squash**. Dans `journal.md`, notez
   le nombre de commits ajoutés sur `main` par cette fusion, et ce qu'il advient de l'Issue liée.

-Nombre de commits ajoutés sur main : 1

-L'Issue liée a été automatiquement fermée après la fusion grâce à la mention "Closes #N" dans la Pull Request.


### 4 — Le conflit d'équipe (20 min)

11. Sur la seconde, GitHub annonce un conflit. Avant d'ouvrir le fichier, écrivez dans `journal.md`
    ce que vous prévoyez de voir, puis résolvez le conflit **en local** :

    ```bash
    git switch feat/<branche>
    git fetch origin
    git merge origin/main        # ou : git pull origin main
    # résoudre, git add, git commit
    git push
    ```
    - Je m'attendais à voir des marqueurs de conflit Git (<<<<<<<, =======, >>>>>>>) dans la méthode saluer, car plusieurs personnes avaient modifié la même partie du fichier.

12. Collez dans `journal.md` le contenu de `Salutation.java` en conflit avant résolution et la
    sortie de `git log --oneline --graph --all` après. Vérifiez que le programme compile encore
    une fois le conflit résolu : une résolution qui casse la compilation est le cas le plus
    fréquent en entreprise. Dites en une phrase pourquoi le conflit est apparu ici et pas au
    TP 04.

    - Sortie de git log --oneline --graph --all

    $ git log --oneline --graph --all
* dca2341 (HEAD -> main, origin/main, origin/HEAD) Feat/salutation langue (#2)
* e856b90 Feat/kalid salutation heure (#4)
| * ae7e346 (origin/feat/kalid-salutation-heure, feat/kalid-salutation-heure) docs: documente la salutation selon l'heure
| * 24a4cdc feat: salutation selon l'heure
|/
* 1a2ab1a chore: ignore les fichiers .class
| * ddec527 (origin/feat/salutation-langue) docs: lister les langues supportées dans le README
| * 607b735 feat: ajouter le support multilingue dans saluer
|/
* 4fa9300 feat: ajoute Salutation.java de départ
* be88466 Initial commit

- Contrairement au TP 04, le conflit est apparu lors d'une Pull Request car plusieurs développeurs travaillaient simultanément sur le même dépôt distant et les mêmes portions de code.




### 5 — Relecture du flux (10 min)


13. À trois, répondez par écrit : combien de temps une branche est-elle restée ouverte ? Qui a
    relu quoi ? Qu'est-ce qui aurait été différent si `main` n'avait pas été protégée ?

-Nos branches sont restées ouvertes environ 1 heure, le temps de développer les fonctionnalités, d'ouvrir les Pull Requests, d'effectuer les revues croisées avec les Conventional Comments, puis de résoudre le conflit de fusion en local avant la validation finale.

-Qui a relu quoi ?

    J'ai relu et approuvé la Pull Request de Kalid, et Kalid a relu et validé la mienne en retour.

-Qu'est-ce qui aurait été différent si main n'avait pas été protégée ?

    Sans cette protection, on aurait pu pousser directement nos commits sur main sans concertation. Le risque aurait été d'écraser le travail de l'autre, d'intégrer du code cassant directement la compilation sans relecture préalable, et de perdre tout le suivi structuré apporté par les Pull Requests.