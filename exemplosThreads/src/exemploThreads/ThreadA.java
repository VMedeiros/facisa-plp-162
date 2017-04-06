package exemploThreads;

/**
 * @author Victor
 *
 */
public class ThreadA extends Thread {

	@Override
	public void run() {
		super.run();
		for(int i = 0; i < 5; i++) 
			System.out.println("Em execução Thread A");
	}
}
