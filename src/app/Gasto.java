package app;

import java.time.LocalDateTime;

public class Gasto {
    public static Double balance;
    private String nombre;
    private Double valor;
    private Boolean esGasto;
    private LocalDateTime fechaDeCreacion;

    public Gasto(String nombre, Double valor, Boolean esGasto, LocalDateTime fechaDeCreacion) {
        this.nombre = nombre;
        this.valor = valor;
        this.esGasto = esGasto;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Double getValor() {
        return this.valor;
    }

    public Boolean getEsGasto() {
        return this.esGasto;
    }

    public LocalDateTime getFechaDeCreacion() {
        return this.fechaDeCreacion;
    }
}