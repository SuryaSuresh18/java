package my;

import java.util.StringTokenizer;

public class StringTokenizerEg {

	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Welcome to Java class at Anudip"," ");
		//To print in tokens
		while(s.hasMoreTokens()){
			System.out.println(s.nextToken());
		}
	}

}
