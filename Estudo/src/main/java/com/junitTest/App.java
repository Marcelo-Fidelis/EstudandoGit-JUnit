package com.junitTest;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(2.0,'*',7.0);
		
		System.out.println(calculadora.operar().toString());

	}

}
