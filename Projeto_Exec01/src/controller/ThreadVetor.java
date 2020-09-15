package controller;

import javax.swing.JOptionPane;

public class ThreadVetor extends Thread {
    private final int num;
    private final int vetor[];

    public ThreadVetor(final int num, final int vetor[]) {
        this.num = num;
        this.vetor = vetor;
    }

    public void run() {
        try {
            double tempoIni, tempoFim, tempoTot;
            if (num % 2 == 0) {
                tempoIni = System.nanoTime();
                for (int i = 0; i < vetor.length; i++) {
                }
                tempoFim = System.nanoTime();
                tempoTot = tempoFim - tempoIni;
                tempoTot /= Math.pow(10, 9);
                System.out.println("Tempo run Thread par (for): " + tempoTot + " seg");
            } else if (num % 2 != 0) {
                tempoIni = System.nanoTime();
                for (final int i : vetor) {
                }
                tempoFim = System.nanoTime();
                tempoTot = tempoFim - tempoIni;
                tempoTot /= Math.pow(10, 9);
                System.out.println("Tempo run Thread impar (foreach): " + tempoTot + " seg");
            }
        } catch (final Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: Deu ruim!" + e.getMessage());
        }
    }
}