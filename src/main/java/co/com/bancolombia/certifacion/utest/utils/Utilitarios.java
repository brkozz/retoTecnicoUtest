package co.com.bancolombia.certifacion.utest.utils;

public class Utilitarios {

    public static void esperaExplicita(long duracion) {
        try {
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
