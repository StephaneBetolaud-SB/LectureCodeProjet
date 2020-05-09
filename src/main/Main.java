package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import token.Token;
import expression.Expression;

import token.Tokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tokenizer token = new Tokenizer();
		
		// chemin pour YASSIN : /home/yassin/eclipse-workspace/LectureCodeProjet/src/test/PremierTest.java
		
		File file = new File("/home/yassin/eclipse-workspace/LectureCodeProjet/src/test/PremierTest.java");
		// try de la methode tokenizer
		try {
			List<Token> tokens = token.tokenizer(file);
			List<Expression> expressions = new ArrayList<Expression>();
			Expression e = new Expression();
			for(Token t : tokens ) {
				//System.out.println(t.toString());
				expressions.add(e.evaluateToken(t));
			}
			System.out.println(expressions.size());
			for (Expression elem : expressions) {
				System.out.println(elem.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
