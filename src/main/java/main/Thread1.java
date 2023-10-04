package main;

public class Thread1 implements Runnable {

	
	public void run() {
		PadraoSingleton singleton = PadraoSingleton.getInstance("Thread1");
		System.out.println(singleton.value);
	}
}
