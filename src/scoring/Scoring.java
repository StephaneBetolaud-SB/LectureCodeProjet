package scoring;

import java.io.File;
import java.io.FileNotFoundException;

import token.*;
import parser.Parser;
import java.util.ArrayList;
import java.util.List;

public class Scoring {
	
	private int score = 0;
	private int numberOfLines;
	private int declaredVariables;
	private int imports;
	private int privateVariables;
	
	public Scoring() {
		
	}
	
	public void score(File f) throws FileNotFoundException {
		Tokenizer t = new Tokenizer();
		
		t.tokenizer(f);
		List<Token> tokens = new ArrayList<Token>();
		tokens = t.tokenizer(f);
		
		Parser p = new Parser();
		List<Expression> ast = new ArrayList<Expression>();
		
		ast = p.parser(tokens);
		
		
		// boucle sur ast pour additionner
	}
	
	public void report() {
		System.out.println("------ Résultats ------");
		
		System.out.println("Nombre de lignes : " + this.numberOfLines);
		System.out.println("Variables déclarées : " + this.declaredVariables);
		System.out.println("Nombre d'imports : " + this.imports);
		System.out.println("Variables privées : " + this.privateVariables);
	}
	
	public Tokenizer token;
}
