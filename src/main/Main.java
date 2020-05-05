package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import token.Token;

import token.Tokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tokenizer token = new Tokenizer();
		
		File file = new File("..\\LectureCodeProjet\\src\\test\\PremierTest.java");
		// try de la methode tokenizer
		try {
			List<Token> tokens = token.tokenizer(file);
			for(Token t : tokens ) {
				System.out.println(t.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
