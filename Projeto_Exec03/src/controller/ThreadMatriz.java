package controller;

import javax.swing.JOptionPane;

public class ThreadMatriz extends Thread {
    private int vetor[];
    private int soma;
    private int linha;

    public ThreadMatriz(int vetor[], int linha) {
        this.vetor = vetor;
        this.soma = 0;
        this.linha = linha;
    }

    public void run() {
        try {
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }
            System.out.println("ThreadID #" + getId() + " ==> A soma da linha " + linha + " é igual a: " + soma);
            soma = 0;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: Deu ruim!\n" + e.getMessage());
        }
    }
}