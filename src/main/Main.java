package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import token.Token;
import expression.Expression;
import scoring.Scoring;
import token.Tokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tokenizer token = new Tokenizer();
		
		// chemin pour YASSIN : /home/yassin/eclipse-workspace/LectureCodeProjet/src/test/PremierTest.java
		
		File file = new File("..\\LectureCodeProjet\\src\\test\\PremierTest.java");
		// try de la methode tokenizer
		try {
			
			Scoring scoring = new Scoring();
			
			scoring.score(file);
			scoring.report();
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}