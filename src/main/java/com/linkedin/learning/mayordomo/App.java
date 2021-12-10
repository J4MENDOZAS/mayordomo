package com.linkedin.learning.mayordomo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	System.out.println("Proyecto Maven Compilado V1");
	for (String s : args) {
	    System.out.println(decora(s));
	}
    }

    protected static String decora(String s) {
	return "* " + s
    }
}
