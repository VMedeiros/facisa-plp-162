package exemploThreads;

/**
 * @author Victor
 *
 */
public class Main {

	public static void main(String[] args) {

		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		a.setPriority(10);
		b.setPriority(5);
		
		a.start();
		b.start();
	}
	
}
