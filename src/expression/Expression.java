package expression;

import token.Token;

public class Expression {

	// deja utilise
	private String type;
	private String value;
	private String nom;
	// pas utilise
	
	private String typeVariable;
	
	

	public Expression() {
		type = "";
		value = ""; 
	}

	public String getValue() {
		return value;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	public String getTypeVariable() {
		return typeVariable;
	}

	public void setTypeVariable(String typeVariable) {
		this.typeVariable = typeVariable;
	}

	public Expression evaluateToken(Token t) {
		Expression e = new Expression();
		e.setType(t.getInformationToken());
		e.setNom(t.getNom());
		e.setTypeVariable(t.getType());
		
		switch(e.type) {
		
		case "Import":
			//System.out.println(e.getValue());
			e.setValue(t.getValeur());
			break;
			
		case "EndStatement":
			
			e.setValue(t.getValeur());
			//System.out.println(e.getValue());
			break;
		
		case "ClassName":
			e.setValue(t.getValeur());
			//System.out.println(e.getValue());
			break;
			
		case "start_class":
			e.setValue(t.getValeur());
			break;
			
		case "ClassVariable":
			e.setValue(t.getValeur());
			break;
			
		case "method variable":
			e.setValue(t.getValeur());
			break;
			
		case "method with no arguments":
			e.setValue(t.getValeur());
			break;

		case "start_method":
			e.setValue(t.getValeur());
			break;
			
		case "end_method":
			e.setValue(t.getValeur());
			break;
			
		case "end_class":
			e.setValue(t.getValeur());
			break;
		default:
			 e.setValue("coucoucoucou");
			 break;
		}
		
		//e.toString();
		return e;
	}
	
	
	public void setType(String informationToken) {
		this.type = informationToken;
	}
	
	public String getType() {
		return type;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

	public String toString() {
		switch (this.getType()) {
		case "Import":
			return "Type : import, value : " + this.getValue();

		case "EndStatement":
			return "Type : end statement, value : " + this.getValue();

		case "ClassName":
			return "Type : class name, value : " + this.getValue();
		
		case "start_class":
			return "Type : start_class, value : " + this.getValue();
			
		case "ClassVariable":
			return "Type : ClassVariable, value : " + this.getValue();
			
		case "method variable":
			return "Type : method variable, value : " + this.getValue();
			
		case "method width no arguments":
			return "Type : method with no arguments, value : " + this.getValue();

		case "start_method":
			return "Type : start_method, value : " + this.getValue();
			
		case "end_method":
			return "Type : end_method, value : " + this.getValue();
			
		case "end_class":
			return "Type : end_class, value : " + this.getValue();
			
		default:
			return "lalala";
		}
	}
}