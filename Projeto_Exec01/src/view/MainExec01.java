package view;
/*
Objetivo:
Criar em java um projeto com uma Thread que receba um valor numérico e vetor como parâmetros.
Caso o valor numérico seja par, a thread deve percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para percorrer o vetor.
Caso o valor numérico seja impar, a thread deve percorrer o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor.
No final, ambas as possibilidades devem apresentar o tempo em segundos.
A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100.
Deve inicar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o número 2 e o mesmo vetor.
*/

import java.util.Random;
import javax.swing.JOptionPane;
import controller.ThreadVetor;

public class MainExec01 {
    public static void main(String[] args) {
        try {
            int vetor[] = new int[1000];
            Random random = new Random();
            for (int i : vetor) {
                vetor[i] = random.nextInt(100) + 1;
            }
            ThreadVetor thread1, thread2;

            thread1 = new ThreadVetor(1, vetor);
            thread2 = new ThreadVetor(2, vetor);

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
            JOptionPane.showMessageDialog(null, "Fim do programa.\n(Outputs no console.)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thread interrompida!" + e.getMessage());
        }
    }
}