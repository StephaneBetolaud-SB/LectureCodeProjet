package parser;

import java.util.ArrayList;
import java.util.List;

import token.*;
import expression.Expression;
public class Parser {
	
	public Parser() {
		
	}
	
	public List<Expression> parser(List<Token> tokens){
		
		List<Expression> retour = createListExpression(tokens);
		
		
		return retour;
	}
	
	public List<Expression> createListExpression(List<Token> tokens){
		
		List<Expression> retour = new ArrayList<Expression>();
		Expression e = new Expression();
		for(Token t : tokens ) {
			//System.out.println(t.toString());
			retour.add(e.evaluateToken(t));
		}
		return retour;
		
	}
	
}
