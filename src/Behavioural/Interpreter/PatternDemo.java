package Behavioural.Interpreter;

import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		String input = "Lions, and tigers, and bears! Oh my!";
		
		Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
		Matcher m = p.matcher(input);
		
		while(m.find()) {
			System.out.println(MessageFormat.format("Found a {0}.", m.group()));
		}
	}

}
