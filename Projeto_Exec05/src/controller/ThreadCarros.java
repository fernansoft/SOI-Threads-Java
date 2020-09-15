package controller;

import java.util.Random;

import javax.swing.JOptionPane;

public class ThreadCarros extends Thread{
	private int distancia;
	private int velmaxima;
	private int carro;
	public static String vencedor="";

	public ThreadCarros(int distancia,int velmaxima, int carro){
		this.distancia = distancia;
		this.velmaxima = velmaxima;
		this.carro = carro;
	}
	
	public void run(){
		try {
			int totalPercorrido=0;
			while(totalPercorrido<distancia){
				Random rand = new Random();
				carro = rand.nextInt(velmaxima)+1;
				totalPercorrido+= carro;
				sleep(100);
			}
			if(vencedor=="") {
				vencedor = "Carro"+ getId();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception: Deu ruim!\n"+ e.getMessage());
		}
	}
}