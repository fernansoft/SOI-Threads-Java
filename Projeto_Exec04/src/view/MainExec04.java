package view;
/*
Objetivo:
Fazer uma aplicação de uma corrida de sapos, com 5 Threads, cada Thread controlando 1 sapo.
Deve haver um tamanho maximo para cada pulo do sapo (em metros) e a distância máxima para que os sapos percorram.
A cada salto, um sapo pode dar uma salto de 0 até o tamanho máximo do salto (valor aleatorio).
Apos dar um salto, a Thread, para cada sapo, deve mostrar no console, qual foi o tamanho do salto e quanto o sapo percorreu.
Assim que o sapo percorrer a distancia maxima, a Thread deve apresentar que o sapo chegou e qual sua colocacao.
O exercicio deve ser resolvido todo em console, ou seja, como se estivesse sendo narrado. Atencao para a forma de definir a ordem de chegada.
*/

import controller.ThreadSapos;

public class MainExec04 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			Thread sapo = new ThreadSapos(i);
			sapo.start();
		}
	}
}