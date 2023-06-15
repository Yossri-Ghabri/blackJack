# blackJack

 --- Compteur de valeur d'une main au jeu du Blackjack ---

Le Blackjack est un jeu de hasard tres populaine dans les casinos.

Le but de ce jeu de cartes

consiste a® faire un meilleur score que la banque, sans depasser 21.

Le but de ce Kata est d'implementer les regles de calcul de la valeur d'une main.

Il n'est pas question ici de simuler la presence de plusieurs joueurs ou d'un croupier. IL est demande d'appliquer les regles telles qu'elles sont decrites dans 1'exercice.

Regles [Etape 1]

Une main est initialement constituee de deux cartes.

Les cartes representees par un chiffre (de 2 a 18) valent leur chiffre en points.

Les figures (J,Q et K) valent 10 points

L'As vaut 11 points.

Pour reussir cette etape, il est necessaire que les tests du fichier

TestSepl.java reussissent

[Etape 2]:

On peut rajouter autant de cartes que l'on souhaite dans une main, une par une.

La valeur en points d'une main est egale a la somme des points de chacune de ses cartes.

Pour reussir cette etape il est necessaire que les test des fichiers TestStep1.java et TestStep2.java reussissent.

[Etape 3]

Si la main a une valeur strictement egale a 21 avec deux cartes (A + 10/3/Q/K), c'est un Blackja
Si la main a une valeur superieure a 21, elle est perdue (busted).
[Etape 4]

Si la main a une valeur superieure a 21 alors qu'elle
a encore un As,

on considere que 1'as ne vaut plus qu'un point

(refaire le calcul tant qu'il reste des As et que le score depasse 21)

Exemple : Une main qui contient A et 6 vaut 17 points. Si on ajoute 5 dans la main, la valeur passe a 12 points (1+6+5)

Pour reussir cette etape, il est necessaire que les tests des fichiers TestStepl.java, TestStep2.java, TestStep3.java et TestStep4.java reussissent   )
