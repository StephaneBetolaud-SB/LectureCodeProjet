package expression;

import token.Token;

public class Expression {

	private String type;
	private String value;
	private String variableName;
	private String importName;
	private String methodName;
	private String methodVariable;
	private String className;
	private String character;
	private String endStatement;
	private String classVariable;
	private String startMethod;
	private String endMethod;
	private String methodNoArgs;
	private String endClass;
	private String startClass;

	public Expression() {
		type = "";
		value = ""; 
		variableName = "";
		importName = "";
		methodName = "";
		methodVariable = "";
		className = "";
		character= "";
		endStatement= "";
		classVariable= "";
		startMethod= "";
		endMethod= "";
		methodNoArgs= "";
		endClass= "";
		startClass = "";
	}

	public Expression evaluateToken(Token t) {
		this.setType(t.getInformationToken());
		Expression e = new Expression();
		switch(this.type) {
		
		case "Import":
			System.out.println(e.getValue());
			break;
			
		case "EndStatement":
			e.setValue(t.getValeur());
			break;
		
		case "ClassName":
			e.setValue(t.getValeur());
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
		}
		e.toString();
		return e;
	}
	
	
	public void setType(String informationToken) {
		this.type = informationToken;
	}
	
	public String getType() {
		return type;
	}

	public String getEndMethod() {
		return endMethod;
	}

	public String getMethodVariable() {
		return methodVariable;
	}
	
	public String getStartClass() {
		return startClass;
	}
	
	public void setStartClass(String valeur) {
		startClass = valeur;
	}

	public void setEndClass(String valeur) {
		endClass = valeur;
		
	}

	public void setEndMethod(String valeur) {
		endMethod = valeur;
	}

	public void setMethodNoArgs(String valeur) {
		methodNoArgs = valeur;
	}
	
	public String getMethodNoArgs() {
		return methodNoArgs;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setStartMethod(String valeur) {
		startMethod = valeur;
	}

	public String getStartMethod() {
		return startMethod;
	}

	public String getEndStatement() {
		return endStatement;
	}

	public void setEndStatement(String value) {
		this.value = value;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassVariable() {
		return classVariable;
	}

	public void setClassVariable(String name) {
		this.className = name;
	}

	public String getImportName() {
		return importName;
	}

	public void setImportName(String value) {
		this.importName = value;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
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
			
		case "method with no arguments":
			return "Type : method with no arguments, value : " + this.getValue();

		case "start_method":
			return "Type : start_mathod, value : " + this.getValue();
			
		case "end_method":
			return "Type : end_method, value : " + this.getValue();
			
		case "end_class":
			return "Type : start_class, value : " + this.getValue();
			
		default:
			return "";
		}
	}

	

}