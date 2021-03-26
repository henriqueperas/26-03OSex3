package view;

import controller.Threads;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int idCarro = 0; idCarro < 14; idCarro++) {
			Thread tCarro = new Threads(idCarro);
			tCarro.start();
		}
	}

}
