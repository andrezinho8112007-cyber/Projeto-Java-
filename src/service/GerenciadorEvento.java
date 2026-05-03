package service;

import model.Evento;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorEvento {
    private List<Evento> eventos = new ArrayList<>();
    private final String ARQUIVO = "events.data"; // Nome obrigatório

    public void adicionarEvento(Evento e) {
        eventos.add(e);
        Collections.sort(eventos); // Mantém ordenado
        salvarEventos();
    }

    public List<Evento> getEventos() { return eventos; }

    public void salvarEventos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARQUIVO))) {
            oos.writeObject(eventos);
        } catch (IOException ex) {
            System.out.println("Erro ao salvar: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void carregarEventos() {
        File file = new File(ARQUIVO);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARQUIVO))) {
                eventos = (List<Evento>) ois.readObject();
            } catch (Exception ex) {
                eventos = new ArrayList<>();
            }
        }
    }
}