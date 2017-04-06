package exemploThreads;

/**
 * @author Victor
 *
 */
public class ThreadB extends Thread {

	@Override
	public void run() {
		super.run();
		for(int i = 0; i < 5; i++) 
			System.out.println("Em execução Thread B");
	}
}
