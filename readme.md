## Analyse fonctionnelle de l'analyseur de code

#### Bonnes pratiques à respecter

* Pas d'imports inutiles
* Moins de 200 lignes
* Attributs de classe privés avec getters et setters

#### Première étape : tokenization
Notre programme affecte un token à chaque mot. Chaque mot fait partie d'une catégorie.
Nous avons plusieurs catégories :
* les caractères spéciaux : "==", "=", "{}" ,"()" , "," , ";", "?", ":" , "[]" , " "" ", "''" , "&&", "||"
* les types : int, string, boolean, double, float, char
* la propriété : public, private, static, protected

Chaque token attribué sera ajouté à une liste, cette liste sera parcourue par le parser. 


#### Deuxième étape : analyse syntaxique

L'analyse se fait dans le parser. L'arbre constitué de tokens est parcouru et va faire un compte rendu de son contenu.
Le parser va également vérifier combien de sympobles / variables / types il existe dans le code.
En sortie, le parser renvoie ses résultats.



#### Troisième étape : évaluation

Pour cette dernière étape, l'évaluation ("scoring") va nous permettre de vérifier si les bonnes pratiques sont respectées et mettre sous forme de rapport les résultats du parser

