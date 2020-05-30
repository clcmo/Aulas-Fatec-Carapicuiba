/**
*	MATERIA: ESTRUTURA DE DADOS
*	AULA 1 = 08.02.2020
*	INTRODUCAO A PROGRAMCAO EM JAVA
*
*	BOAS PRATICAS: 
*		a classe JOptionPane é responsável pela criação dos diálogos de interação
*		esta interação poderá ser feita pelo método showMessageDialog 
**/

import javax.swing.JOptionPane;

public class Janelas{
	public static void main(String args[]){
		double x = 3.5;
		JOptionPane.showMessageDialog(null, "Hello World, again");
		JOptionPane.showMessageDialog(null, "x = " + x);
	}
}
