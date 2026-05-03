import model.Evento;
import service.GerenciadorEvento;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorEvento gerenciador = new GerenciadorEvento();
        gerenciador.carregarEventos();

        while (true) {
            System.out.println("\n--- SISTEMA DE EVENTOS URBANOS ---");
            System.out.println("1. Cadastrar Novo Evento");
            System.out.println("2. Listar Eventos (Ordenados por data)");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            
            int opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 1) {
                System.out.print("Nome: "); String nome = sc.nextLine();
                System.out.print("Endereço: "); String endereco = sc.nextLine();
                System.out.print("Categoria: "); String categoria = sc.nextLine();
                System.out.print("Data (AAAA-MM-DDTHH:MM): "); String data = sc.nextLine();
                System.out.print("Descrição: "); String desc = sc.nextLine();

                try {
                    gerenciador.adicionarEvento(new Evento(nome, endereco, categoria, LocalDateTime.parse(data), desc));
                    System.out.println("Sucesso!");
                } catch (Exception e) {
                    System.out.println("Erro no formato da data!");
                }
            } else if (opcao == 2) {
                for (Evento e : gerenciador.getEventos()) {
                    System.out.println(e);
                }
            } else if (opcao == 3) break;
        }
        sc.close();
    }
}