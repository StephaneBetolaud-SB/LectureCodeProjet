package token;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tokenizer {

	// etape 1 : traiter les lignes du fichiers pour virer les espaces et \n
	
	// variables globales statiques
	
	// properties
	private static final String propertyPublic = "public";
	private static final String propertyPrivate = "private";
	private static final String propertyStatic = "static";
	private static final String propertyProtected = "protected";
	
	
	// types
	
	private static final String typeBool = "boolean";
	private static final String typeInt = "int";
	private static final String typeInteger = "Integer";
	private static final String typeBoolean = "Boolean";
	private static final String typeFloat = "float";
	private static final String typeDouble = "double";
	private static final String typeString = "string";
	private static final String typeChar = "char";
	
	
	public Tokenizer() {
		
	}
	
	public void tokenizer(File file) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		try {
			while ((line = br.readLine()) != null) {
			   // process the line.
				
				StringTokenizer st = new StringTokenizer(line);
			     while (st.hasMoreTokens()) {
			         System.out.println(st.nextToken());
			     }
				
				
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// initialisation de la liste des types
	private List<String> initTypes(){
		List<String> retour = new ArrayList<String>();
		
		retour.add(typeBool);
		retour.add(typeInt);
		retour.add(typeInteger);
		retour.add(typeBoolean);
		retour.add(typeFloat);
		retour.add(typeDouble);
		retour.add(typeString);
		retour.add(typeChar);
		
		return retour;
	}
	
	public List<String> initProperties(){
		List<String> retour = new ArrayList<String>();
		
		
		return retour;
	}
}
