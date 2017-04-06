package syncrhonizedThreads;

/**
 * @author Victor
 *
 */
public class Teste extends Thread {
	String nome;
	Escalonador esc;

	public Teste(String nome, Escalonador esc) {
		this.esc = esc;
		this.nome = nome;
		start();
		setPriority(10);
	}

	@Override
	public void run() {
		esc.teste(nome);
	}
}
