<h1>Rapport</h1>
Lorsque je test de ma méthode ajouterEmploye, une exception NullPointerException a été levé parceque la case j ne contient pas d'objet. Ce qui fait que l'invocation de methode getId() génère l'exception. Cette erreur se situe au niveau de la ligne 42 de la classe principale GestionEmployes.
Cf figure 1
<img src="captures/1.png">
fig 1 : Exceptoion NullPointerException suite à l'execution de la méthode ajouterEmploye </br>
Après correction de l'exception, la méthode ajouterEmploye a marché et la méthode afficherEmployes() affiche les deux employés que contient le tableau.  
Cf figure 2
<img src="captures/2.png">
fig 2 : Affichage des employés grâce à la méthode afficherEmployes() </br>
Selon le critère de recherche, dans la méthode rechercherEmploye, nous avons utilisés l'opérateur OU. Ainsi la méthode fournira un résultat de recherche selon que le critère correspond au nom ou au poste. l'execution de cette fonction 
donne la figure ci-dessous cf fig 3
<img src="captures/31.png">
fig 3: Recherche d'un employé par nom ou par post </br>
Pour le calcul de la masse salariale, il n'y a pas eu de particularité à signaler. le test a marché cf fig 2
<img src="captures/31.png">
Méthode de trie : </br>
Pour la fonction trierEmployesParSalaire nour avons utilisé la méthode static compareParSalaire qui compare une liste d'employée par salaire. </br>
le test en order décroissant fournit le résultat suivant:
<img src="captures/11.png">.







