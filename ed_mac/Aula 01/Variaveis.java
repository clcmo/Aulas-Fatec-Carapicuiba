/**
*	MATERIA: ESTRUTURA DE DADOS
*	AULA 1 = 08.02.2020
*	INTRODUCAO A PROGRAMCAO EM JAVA
*
*	BOAS PRATICAS: 
*		variáveis possuem vários tipos abstratos de dados (TAD)
*		há três tipos prints, todos eles métodos de saída da classe System.
*		os dois exemplos ilustram abaixo que há vários tipos de exibição de dados (Global e Local)
*		println usa o formato global, enquanto que o printf usa o formato local de exibição
**/

public class Variaveis{
	public static void main(String args[]){
		int i = 9;
		double f = 9.6;
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		
		System.out.printf("i = %d\n", i);
		System.out.printf("f = %.2f\n", f);
	}
}
