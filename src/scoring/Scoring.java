package scoring;

import java.io.File;
import java.io.FileNotFoundException;

import token.*;
import parser.Parser;
import java.util.ArrayList;
import java.util.List;

import expression.Expression;

public class Scoring {
	
	private int score = 0;
	private int numberOfLines;
	private int declaredVariables;
	private int imports;
	private int privateVariables;
	private ArrayList<Expression> expressions;
	
	public Scoring() {
		this.expressions = new ArrayList<Expression>();
	}
	
	public void score(File f) throws FileNotFoundException {
		Tokenizer t = new Tokenizer();
		
		t.tokenizer(f);
		List<Token> tokens = new ArrayList<Token>();
		tokens = t.tokenizer(f);
		
		Parser parser = new Parser();
		ArrayList<Expression> expressions = (ArrayList<Expression>) parser.createListExpression(tokens);
		
		for(Expression e : expressions) {
			System.out.println("nom : " + e.getNom() + ", type : " + e.getType() + ", type variable : " + e.getTypeVariable() + ", valeur : " + e.getValue());
		}
		
		this.expressions = expressions;
		
		
		// boucle sur ast pour additionner
	}
	
	public void report() {
		System.out.println("------ Resultats ------");
		
		
		int lignes = evaluateLines();
		int imports = evaluateImports();
		int variablesClass = evaluateVariablesClasse();
		int beginEnd = evaluateBeginEnd();
		int variableMethod = evaluateVariablesMethode();
		
		int resultat = lignes + imports + variablesClass + variableMethod + beginEnd;
		System.out.println("La note de votre code est de " + resultat + "/5");
	}
	
	public Tokenizer token;
	
	public int evaluateLines() {
		if(expressions.size() < 100) {
			System.out.println("Le fichier fait moins de 200 lignes");
			return 1;
		}
		else {
			System.out.println("Le fichier fait plus de 200 lignes et cela n'est pas conforme a la bonne pratique de programmation en java");
			return 0;
		}
	}
	
	public int evaluateImports() {
		for(Expression e : this.expressions) {
			if(e.getType().equals("Import")) {
				return 1;
			}
		}
		return 0;
	}
	
	public int evaluateVariablesClasse() {
		int correct = 0;
		int nbr = 0;
		for(int i = 0 ; i < expressions.size() ; i++) {
			if(expressions.get(i).getType().equals("ClassVariable")) {
				nbr ++;
				if(expressions.get(i+1).getType().equals("EndStatement")) {
					correct ++;
				}
			}
		}
		if(correct == nbr) {
			return 1;
		}
		else {
			System.out.println("il manque un ou plusieurs points virgule après declaration de variables de classes");
			return 0;		}
	}
	
	public int evaluateBeginEnd() {
		int correct = 0;
		int nbr = 0;
		for(Expression e : expressions) { 
			if(e.getType().equals("start_class")) {
				nbr ++;
				
			}
			if(e.getType().equals("end_class")) {
				correct++;
			}
			if(e.getType().equals("start_method")) {
				nbr++;
			}
			if(e.getType().equals("end_method")) {
				correct++;
			}
		}
		if(correct == nbr) {
			System.out.println("Toutes les classes ouvertes ont été fermées");
			return 1;
		}
		else {
			System.out.println("une classe ou une methode n'est pas fermée");
			return 0;
		}
	}
	
	public int evaluateVariablesMethode() {
		int correct = 0;
		int nbr = 0;
		for(int i = 0 ; i < expressions.size() ; i++) {
			if(expressions.get(i).getType().equals("method variable")) {
				nbr ++;
				if(expressions.get(i+1).getType().equals("EndStatement")) {
					correct ++;
				}
			}
		}
		if(correct == nbr) {
			return 1;
		}
		else {
			System.out.println("il manque un ou plusieurs points virgule après declaration de variables de methodes");
			return 0;	
		}
	}
	
}
