package main;


public class Multithread {
    public static void main(String[] args) {
        System.out.println("Se você ver o mesmo valor, então o singleton foi reusado e qual objeto criou a instancia inicial!" + "\n" +
                "Se houver dois valores diferentes o singleton não foi reusado!" + "\n\n" +
                "RESULTADO:" + "\n");
        Thread Thread1 = new Thread(new Thread1());
        Thread Thread2 = new Thread(new Thread2());
        Thread1.start();
        Thread2.start();
    }
}
