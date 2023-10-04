package main;

public class Thread2 implements Runnable {

	public void run() {
		PadraoSingleton singleton = PadraoSingleton.getInstance("Thread2");
		System.out.println(singleton.value);
	}

}
