package controller;

import javax.swing.JOptionPane;

public class ThreadReturnId extends Thread{
	private int id;
	
	public ThreadReturnId(int id) {
		this.id = id;
	}
	
	public void run() {
		try {
			System.out.println("Thread id: "+ id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Exception: Deu ruim!"+ e.getMessage());
		}
	}
}