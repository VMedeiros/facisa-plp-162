package syncrhonizedThreads;

/**
 * @author Victor
 *
 */
public class Escalonador {
	public synchronized void teste(String nome) {
		for (int i = 0; i < 10; i++) {
			Main.print(nome + " :: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				Main.print(e.getMessage());
			}
		}
	}
}
