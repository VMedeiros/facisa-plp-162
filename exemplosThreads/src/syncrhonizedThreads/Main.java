package syncrhonizedThreads;

/**
 * @author Victor
 *
 */
public class Main {
	public static void print(String s) {
		System.out.println(s + "\n");
	}

	public static void main(String[] args) {
		Escalonador escolhido = new Escalonador();
		new Teste("Idoso A", escolhido);
		new Teste("Jovi B", escolhido);
		new Teste("Grávida C", escolhido);
	}
}