package org.sample;

public class T {

    public static void main(String[] args) {

	String str = "java programm";
	String[] split = str.split(" ");
	String output = "";
	for (String s : split) {

	    for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (i == 0) {
		    char upperCase = Character.toUpperCase(c);
		    output = output + upperCase;

		} else {
		    output = output + c;

		}
	    }
	    output = output + " ";

	}

	System.out.println(output);
    }

}
