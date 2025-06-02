# ToDoAppConsole

Uma aplicação simples de lista de tarefas (ToDo) para terminal, desenvolvida em Java. Este projeto permite criar,
listar, marcar como concluídas, excluir tarefas e exportar a lista para um arquivo `.txt`.

## ✨ Funcionalidades

- Criar novas tarefas
- Listar todas as tarefas
- Marcar tarefas como concluídas
- Excluir tarefas
- Salvar as tarefas em um arquivo de texto `.txt` na pasta **Downloads**

## 📦 Requisitos

- Java JDK 8 ou superior
- IDE ou terminal com suporte a projetos Java

## ▶️ Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/ToDoAppConsole.git

2. Navegue até a pasta do projeto:

   ```bash
   cd ToDoAppConsole****
   ```

3. Compile os arquivos `.java`:

   ```bash
   javac todoappconsole/*.java
   ```

4. Execute o programa:

   ```bash
   java todoappconsole.Main
   ```

## 🖥️ Uso da aplicação

Você verá o seguinte menu no terminal:

```
Escolha uma opção: 
1 - Listar tarefas
2 - Criar tarefa
3 - Marcar tarefa como concluída
4 - Excluir tarefa
5 - Salvar tarefas como .txt
6 - Sair
```

### Exemplos:

* Para criar uma nova tarefa:

    ````
    Digite o título e a descrição
    ````
    ````
    Em seguida, informe se a tarefa está concluída (true / false)
    ````****


* Para salvar as tarefas:
    
    ````
    Informe um nome para o arquivo (sem a extensão)
    ````
    ````
    O arquivo será salvo na pasta **Downloads** do seu usuário
    ````

## 🧠 Estrutura do projeto

* `Main.java`: ponto de entrada da aplicação
* `ToDo.java`: classe que representa uma tarefa
* `ControllerToDo.java`: responsável pelas operações (criar, marcar, excluir, salvar)
* `ConsoleScanner.java`: gerencia a interação com o usuário via terminal

## Autor

* Pedro Henrique Oliveira
* Versão: 1.0

---
