package deadLock;

/**
 * @author Victor
 *
 */
public class Deadlock {

	public static void main(String[] args) {

		Deadlock a = new Deadlock();
		Threadbloqueada primeiro = new Threadbloqueada(a);
		Threadbloqueada segundo = new Threadbloqueada(a);
		primeiro.setName("Primeiro");
		segundo.setName("Segundo");
		primeiro.start();
		segundo.start();
	}
}

class Threadbloqueada extends Thread {

	Deadlock bloqueado;
	private String bloqueio = "";

	Threadbloqueada(Deadlock dl) {
		bloqueado = dl;
	}

	public void run() {

		if (getName().equals("Primeiro")) {
			synchronized (bloqueado) {
				synchronized (bloqueio) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

					}
					System.out.println("Primeira Thread");
					System.out.println("Primeiro passo");
				}
			}
		} else {
			synchronized (bloqueio) {
				synchronized (bloqueado) {
					try {
						Thread.sleep(2000);
					} catch (Exception e) {

					}

					System.out.println("Segunda Thread");
					System.out.println("Segundo Passo");
				}
			}
		}
	}
}
