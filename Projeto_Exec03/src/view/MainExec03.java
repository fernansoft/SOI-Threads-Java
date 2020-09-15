package view;
/*
Objetivo:
Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 Threads, onde cada Thread calcula a soma dos valores de cada linha, imprimindo a identificação da linha e o resultado da soma.
A main deve gerar uma matriz com números aleatórios, mas a Thread recebe um vetor (uma linha da matriz).
*/

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import controller.ThreadMatriz;

public class MainExec03 {

	public static void main(String[] args) {
		int Matriz[][] = new int[3][5];
		Random rand = new Random();
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				Matriz[linha][coluna] = rand.nextInt(50) + 1;
			}
		}
		System.out.println("Matriz gerada: \n" + Arrays.deepToString(Matriz).replace("], ", "]\n "));
		for (int i = 0; i < 3; i++) {
			Thread threadExec03 = new ThreadMatriz(Matriz[i], i);
			threadExec03.start();
		}
		JOptionPane.showMessageDialog(null, "Programa executado!\n(Output no console).");
	}
}