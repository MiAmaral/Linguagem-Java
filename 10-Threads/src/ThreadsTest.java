//Threads em Java são unidades de execução concorrentes que permitem
//a execução simultânea de diferentes partes do código.
public class ThreadsTest {
    static int contador = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementarContador("t1");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                incrementarContador("t2");
            }
        }).start();
    }

    private static synchronized void incrementarContador(String nomeThread) {
        contador++;
        System.out.println("O valor do contador atual é: " + contador + ", thread: " + nomeThread);
    }
}

