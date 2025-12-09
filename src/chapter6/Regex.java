package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		System.out.println("run regex");

		Pattern ptrn = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		Matcher matcher = ptrn.matcher("foobar@gmail.com");
		System.out.println("input sstring match regex: " + matcher.matches());
	}
}
