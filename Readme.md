#TP 3 – Java - Héritage
Vous devez réaliser la conception et le développement d’une application décrivant lefonctionnement de jeux de hasard (jeux de tirage au sort de différents nombres). Le principe de fonctionnement est le suivant : dans un premier temps, un tirage de Tolo est organisé, puis les joueurs parient en remplissant des grilles : ils parient sur les nombres qui vont être tirés au sort. Dans un troisième temps, le tirage au sort a lieu et les joueurs ayant pariés sur les bons numéros gagnent un montant généralement proportionnel au montant initial qui a été parié.
Vous devez pouvoir représenter différents types de jeu :
1. le jeu du « Tolo » : le tirage au sort porte sur 4 nombres compris entre 1 et 20.
Les joueurs qui ont trouvé 3 ou 4 bons numéros gagnent les montants suivants :
a. si le joueur a trouvé 3 bons numéros, il gagne 5 fois le montant misé,
b. si le joueur a trouvé 4 bons numéros, il gagne 50 fois le montant misé.
2. le jeu du « Super Tolo » : celui-ci a un fonctionnement proche du Tolo. 4 numéros compris entre 1 et 20 sont tirés au sort, ainsi qu’une cinquième valeur comprise entre 1 et 10, appelée numéro de la chance. Les gains sont calculés de la manière suivante :
a. les gains sont identiques à ceux obtenus avec le jeu du Tolo si le joueur n’a pas trouvé le numéro de la chance
b. les gains sont égaux à cinq fois les gains obtenus avec le jeu du Tolo si le joueur trouve le numéro de la chance.
L’application doit fournir les services suivants.
• Créer un jeu.
• Spécifier les nombres qui ont été tirés au sort pour un jeu.
• Permettre à un joueur de jouer (« remplir » une grille) : 
quel jeu, quels numéros, quelle mise. Vous supposerez que chaque grille dispose en plus d’un code permettant de la retrouver plus facilement.
• Permettre à un joueur de connaître le gain pour une grille :
• Gain pour une grille en particulier (identifiés par son numéro).