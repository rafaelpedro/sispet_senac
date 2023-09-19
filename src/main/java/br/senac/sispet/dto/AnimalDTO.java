package br.senac.sispet.dto;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class AnimalDTO {

    private String nome;
    private String cor;
    private String nomeResponsavel;
    private LocalDate dataNascimento;
    private String temperamento;
    private String especie;

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public String getEspecie() {
        return especie;
    }
}
