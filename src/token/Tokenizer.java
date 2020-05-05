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
	private static final String typeString = "String";
	private static final String typeChar = "char";
	
	// special chars
	
	/*EGAL,
	
	VIRGULE,
	POINT_INTERROGATION,
	POINT_VIRGULE,
	DEUX_POINTS,
	CROCHET_OUVRANT,
	CROCHET_FERMANT,
	ET,
	OU,
	GUILLEMET,
	COTE,
	SLASH,
	ANTISLASH */
	
	private static final String equal = "=";
	private static final String doubleEqual = "==";
	private static final String openedBracket = "{";
	private static final String closedBracket = "}";
	private static final String openedParenthesis = "(";
	private static final String closedParenthesis = ")";
	private static final String comma = ",";
	private static final String semiColon = ";";
	private static final String colon = ":";
	private static final String crochetOuvrant = "[";
	private static final String crochetFermant = "]";
	private static final String and = "&&";
	private static final String or = "||";
	private static final String doubleQuote = "\"";
	private static final String simpleQuote = "'";
	private static final String slash = "/";
	private static final String antislash = " \\ ";

	private static List<String> listeProperties = initProperties();
	private static List<String> listeTypes= initTypes();
	private static List<String> listeSpecialChars = initSpecialChars();
	
	public Tokenizer() {
		
	}
	/*String nom,String informationToken, String type, String valeur */
	
	public List<Token> tokenizer(File file) throws FileNotFoundException {
		List<Token> listToken = new ArrayList<Token>();
		List<String> strings = tokenizerToArrayList(file);
		for(int i = 0 ; i < strings.size() ; i++) {
			boolean isStringProperty = isProperty(strings.get(i));
			if(isStringProperty) {
				boolean isStringType = isType(strings.get(i+1));
				if(isStringType) {
					if(strings.get(i+3).equals(semiColon)) {
						Token token = new Token(strings.get(i+2).toString(),"ClassVariable",strings.get(i+1), "noValue");
						listToken.add(token);
					}
					else {
						Token token = new Token(strings.get(i+2).toString(),"ClassVariable",strings.get(i+1),strings.get(i+4));
						listToken.add(token);
					}
				}
				else {
					if(strings.get(i+1).equals("class")) {
						Token token = new Token(strings.get(i+2), "ClassName","","noValue");
						listToken.add(token);
					}
					else {
						// il s'agit d'une methode on verra plus tard
					}
				}
			}
		}
		return listToken;
	}
	
	// initialisation de la liste des types
	private static List<String> initTypes(){
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
	
	private static List<String> initProperties(){
		List<String> retour = new ArrayList<String>();
		
		retour.add(propertyPublic);
		retour.add(propertyPrivate);
		retour.add(propertyStatic);
		retour.add(propertyProtected);
		
		return retour;
	}
	
	private static List<String> initSpecialChars(){
		List<String> retour = new ArrayList<String>();
		retour.add(equal);
		retour.add(doubleEqual);
		retour.add(openedBracket);
		retour.add(closedBracket);
		retour.add(openedParenthesis);
		retour.add(closedParenthesis);
		retour.add(comma);
		retour.add(semiColon);
		retour.add(colon);
		retour.add(crochetOuvrant);
		retour.add(crochetFermant);
		retour.add(and);
		retour.add(or);
		retour.add(doubleQuote);
		retour.add(simpleQuote);
		retour.add(slash);
		retour.add(antislash);
		
		return retour;
	}
	
	private boolean isProperty(String property) {
		for(String str : listeProperties) {
			if(property.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean isType(String type) {
		for(String str : listeTypes) {
			if(type.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	private List<String> tokenizerToArrayList(File file) throws FileNotFoundException{
		List<String> retour = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		try {
			while ((line = br.readLine()) != null) {
			   // process the line.
				StringTokenizer st = new StringTokenizer(line);
			    while (st.hasMoreTokens()) {
			         String currentString = st.nextToken();
			        retour.add(currentString);
			     }
			}
			br.close();
			return retour;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retour;
		}
	}
}
