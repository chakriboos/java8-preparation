package java8.strtokenizer;

import java.util.StringTokenizer;

public class StrTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Title=Java;" + "auth=he+rb;" + "year=20+16;";
		StringTokenizer tkn = new StringTokenizer(input, "=;");
		int i = 0;
		while (tkn.hasMoreTokens() && i == 0) {
			System.out.println(tkn.nextToken() + " - " + tkn.nextToken());
			i++;
		}
		tkn.nextToken("+");
		
		while(tkn.hasMoreTokens()) {
			System.out.println(tkn.nextToken());
		}
	}

}
