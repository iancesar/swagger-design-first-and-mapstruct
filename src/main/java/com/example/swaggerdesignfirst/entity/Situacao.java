package com.example.swaggerdesignfirst.entity;

public enum Situacao {
    NOVO("NOVO"),

    MATRICULADO("MATRICULADO"),

    MATRICULA_PENDENTE("MATRICULA_PENDENTE");

    private String value;

    Situacao(String value) {
        this.value = value;
    }

}
