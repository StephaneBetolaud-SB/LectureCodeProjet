package main;

import java.io.File;
import java.io.FileNotFoundException;
import token.Tokenizer;
import scoring.Scoring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scoring score = new Scoring();
		
		File file = new File("Test.txt");
		// try de la methode tokenizer
		try {
			score.score(file);
			score.report();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
