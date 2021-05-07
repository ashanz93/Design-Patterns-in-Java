package Behavioural.Interpreter;

import java.text.MessageFormat;

public class InterpreterDemo {
	
	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		
		Expression andExp = new AndExpression(terminal2, terminal3);
		
		Expression orExp = new OrExpression(andExp, terminal1);
		return new AndExpression(orExp, terminal3);
	}

	public static void main(String[] args) {
		String context = "Lions Bears";
		Expression define = buildInterpreterTree();
		System.out.println(MessageFormat.format("{0} is {1}", context, define.interpret(context)));
	}

}
