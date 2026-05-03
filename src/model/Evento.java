package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Evento implements Serializable, Comparable<Evento> {
    private String nome;
    private String endereco;
    private String categoria;
    private LocalDateTime horario;
    private String descricao;

    public Evento(String nome, String endereco, String categoria, LocalDateTime horario, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.categoria = categoria;
        this.horario = horario;
        this.descricao = descricao;
    }

    public LocalDateTime getHorario() { return horario; }

    @Override
    public int compareTo(Evento outro) {
        return this.horario.compareTo(outro.horario); // Requisito: Ordenação
    }

    @Override
    public String toString() {
        String status = horario.isBefore(LocalDateTime.now()) ? "[PASSADO]" : "[FUTURO]";
        return status + " " + horario + " - " + nome + " (" + categoria + ")\n   Local: " + endereco + "\n   Desc: " + descricao;
    }
}