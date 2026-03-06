package com.example.multa;

import java.time.LocalDate;

public class Multa {
    private String nominativo;
    private String documento;
    private String numeroDocumento;
    private LocalDate rilascio;
    private LocalDate scadenza;

    public Multa(String nominativo, String documento, String numeroDocumento, LocalDate rilascio, LocalDate scadenza) {
        this.nominativo = nominativo;
        this.documento = documento;
        this.numeroDocumento = numeroDocumento;
        this.rilascio = rilascio;
        this.scadenza = scadenza;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public LocalDate getRilascio() {
        return rilascio;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }

    public String toString() {
        return "Multa:\n"
                + "Nominativo: " + nominativo + "\n"
                + "Documento: " + documento + "\n"
                + "Numero Documento: " + numeroDocumento + "\n"
                + "Data di rilascio: " + rilascio + "\n"
                + "Data di scadenza: " + scadenza;
    }
}