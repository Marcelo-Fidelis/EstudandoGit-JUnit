package com.junitTest;

public class Calculadora {
	private Double operadorUm,operadorDois;
	private	char operando;
	
	Calculadora(Double operadorUm, char operando, Double operadorDois){
		this.operadorUm = operadorUm;
		this.operadorDois = operadorDois;
		this.operando = operando;
	}
	
	
	public Double operar() {
		switch(operando) {
		case '+':
			return this.operadorUm + this.operadorDois;
			
		case '-':
			return this.operadorUm - this.operadorDois;
		
		case '*':
			return this.operadorUm * this.operadorDois;
		
		case '/':
			return this.operadorUm / this.operadorDois;
		
		default:
			return this.operadorUm + this.operadorDois;
			
		
		}
	}

	public boolean isPar() {
		if(this.operar() % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
