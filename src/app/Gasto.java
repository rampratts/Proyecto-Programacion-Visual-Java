package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public String getFechaDeCreacion() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formatter.format(this.fechaDeCreacion);
    }
}