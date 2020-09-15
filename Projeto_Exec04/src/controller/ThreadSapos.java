package controller;

import java.util.Random;

import javax.swing.JOptionPane;

public class ThreadSapos extends Thread {
    private int TamanhoCorrida;
    private int puloDoSapo;
    private int qtdePercorrida;
    private int idSapo;
    private static int colocacao = 0;

    public ThreadSapos(int idSapo) {
        this.idSapo = idSapo;
    }

    public void run() {
        try {
            TamanhoCorrida = 60;
            Random rand = new Random();
            while (qtdePercorrida < TamanhoCorrida) {
                puloDoSapo = rand.nextInt(11);
                qtdePercorrida += puloDoSapo;
                System.out.println("Sapo #" + idSapo + "==> Pulou " + puloDoSapo
                        + " metros. Distancia total percorrida: " + qtdePercorrida);
            }
            colocacao++;
            System.out.println("Sapo #" + idSapo + "=> Chegou na posicao " + colocacao + "!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception: Deu ruim!\n" + e.getMessage());
        }
    }
}