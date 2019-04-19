package app;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        Gasto test = new Gasto("Prueba de gasto", 200.0, true, LocalDateTime.now());
        System.out.println(test.getNombre());
        System.out.println(test.getValor());
        System.out.println(test.getEsGasto());
        System.out.println(test.getFechaDeCreacion());
    }
}