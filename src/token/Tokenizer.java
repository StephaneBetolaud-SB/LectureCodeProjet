package token;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Tokenizer {

	// etape 1 : traiter les lignes du fichiers pour virer les espaces et \n
	
	public Tokenizer() {
		
	}
	
	public void tokenizer(File file) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		try {
			while ((line = br.readLine()) != null) {
			   // process the line.
				
				System.out.println(line);
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
