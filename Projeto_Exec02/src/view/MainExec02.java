package view;

/*
Objetivo:
Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número.
O número que deve ser impresso é a saída da operação int id = getId() da Thread.
*/

import javax.swing.JOptionPane;

import controller.ThreadReturnId;

public class MainExec02 {

	public static void main(String[] args) {
		try {
			for (int id = 0; id < 5; id++) {
				Thread threadId = new ThreadReturnId(id);
				threadId.start();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception: Thread interrompida!"+ e.getMessage());
		}
	}
}