package br.senac.sispet.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue
    private long id;
    private LocalDateTime horarioInicial;
    private LocalDateTime horarioFinal;
    @Column(nullable = false)
    private Animal animal;
    private String observacoes;
    @Column(nullable = false)
    private ArrayList<Servico> servicos = new ArrayList<Servico>();
    public LocalDateTime getHorarioInicial(){
        return horarioInicial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalDateTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }
}
