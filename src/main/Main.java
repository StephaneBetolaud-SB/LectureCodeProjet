package main;

import java.io.File;
import java.io.FileNotFoundException;
import token.Tokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tokenizer token = new Tokenizer();
		
		File file = new File("..\\LectureCodeProjet\\src\\test\\PremierTest.java");
		// try de la methode tokenizer
		try {
			token.tokenizer(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
