## Analyse fonctionnelle de l'analyseur de code

#### Bonnes pratiques &agrave; respecter

* Pas d'imports inutiles
* Moins de 200 lignes
* Attributs de classe priv&eacute;s avec getters et setters

#### Premi&egrave;re &eacute;tape : tokenization
Notre programme affecte un token &agrave; chaque mot. Chaque mot fait partie d'une cat&eacute;gorie.
Nous avons plusieurs cat&eacute;gories :
* les caractères sp&eacute;ciaux : &quot;==&quot;, &quot;=&quot;, &quot;{}&quot; ,&quot;()&quot; , &quot;,&quot; , &quot;;&quot;, &quot;?&quot;, &quot;:&quot; , &quot;[]&quot; , &quot; &quot;&quot; &quot;, &quot;''&quot; , &quot;&&&quot;, &quot;||&quot;
* les types : int, string, boolean, double, float, char
* la propri&eacute;t&eacute; : public, private, static, protected

Chaque token attribu&eacute; sera ajout&eacute; &agrave; une liste, cette liste sera parcourue par le parser. 

#### Deuxi&egrave;me &eacute;tape : analyse syntaxique

L'analyse se fait dans le parser. L'arbre constitu&eacute; de tokens est parcouru et va faire un compte rendu de son contenu.
Le parser va &eacute;galement v&eacute;rifier combien de sympobles / variables / types il existe dans le code.
En sortie, le parser renvoie ses r&eacute;sultats.



#### Troisième &eacute;tape : &eacute;valuation

Pour cette dernière &eacute;tape, l'&eacute;valuation ("scoring") va nous permettre de v&eacute;rifier si les bonnes pratiques sont respect&eacute;es et mettre sous forme de rapport les r&eacute;sultats du parser

