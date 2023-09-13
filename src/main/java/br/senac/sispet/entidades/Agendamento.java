package br.senac.sispet.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue
    private long id;

    private LocalDateTime horarioInicial;
}
