package app;

import java.time.LocalDateTime;

public class Gasto {
    public static Double balance = 0.0;
    private String nombre;
    private Double valor;
    private Boolean esGasto;
    private LocalDateTime fechaDeCreacion;

    public Gasto(String nombre, Double valor, Boolean esGasto, LocalDateTime fechaDeCreacion) {
        this.nombre = nombre;
        this.valor = valor;
        this.esGasto = esGasto;
        this.fechaDeCreacion = fechaDeCreacion;

        if (this.esGasto) {
            Gasto.balance -= this.valor;
        } else {
            Gasto.balance += this.valor;
        }
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

    public Double getBalance() {
        return Gasto.balance;
    }
}