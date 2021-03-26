package controller;

public class Threads extends Thread {

	private int idCarro;
	private int posicao;
	private int idTempo;
	private int tempof;

	public Threads(int idCarro) {
		this.idCarro = idCarro;
	}

	public void run() {
		
		volta();
		if(posicao < 6) {
			colocacaoP();
		}
		colocacaof();
		
	}

	private void colocacaof() {
		// TODO Auto-generated method stub
		System.out.println("#" + idCarro + " não foi clasificado");
	}

	private void colocacaoP() {
		// TODO Auto-generated method stub
		System.out.println("#" + idCarro + " terminou em " + tempof + " e foi clasificado");
	}

	private void volta() {
		int distancia1 = 600;
		int distancia2 = 1200;
		int distancia3 = 1800;
		int distanciaPercorrida = 0;
		int deslocamento = (int)((Math.random() * 101) + 100);
		int tempo = 1000;
		idTempo++;
		while(distanciaPercorrida <= distancia1) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("#" + idCarro + " esta na 1 volta");
		while(distanciaPercorrida <= distancia2) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("#" + idCarro + " esta na 2 volta");
		while(distanciaPercorrida <= distancia3) {
			distanciaPercorrida += deslocamento;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("#" + idCarro + " terminou");
		posicao++;
	}
}
