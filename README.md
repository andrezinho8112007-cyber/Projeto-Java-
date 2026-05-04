# 🌆 Sistema de Gerenciamento de Eventos na cidade.

# 📋 Requisitos Atendidos (Enunciado)
- **Paradigma:** Orientação a Objetos.
- **Persistência:** Salvamento automático em arquivo `events.data`.
- **Interface:** CLI (Interface de Linha de Comando).
- **Atributos de Evento:** Nome, Endereço, Categoria, Horário e Descrição.
- **Ordenação:** Listagem automática por proximidade de data/hora.

# 📂 Estrutura do Projeto
- `src/model`: Contém as classes de entidade (Evento e Usuario).
- `src/service`: Contém a lógica de negócio e persistência.
- `src/Main.java`: Ponto de entrada da aplicação.

# 🚀 Como Executar
Para rodar o projeto sem conflitos de versão, utilize o comando abaixo no terminal:
```powershell
javac --release 8 -d . src/model/*.java src/service/*.java src/Main.java; java Main
