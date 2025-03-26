# Gerenciador de Gastos

O Gerenciador de Gastos é um sistema simples em Java para controlar os gastos mensais de um usuário. O sistema permite que o usuário registre gastos fixos e provisórios, consulte os gastos, e tenha alertas sobre o percentual de seu orçamento gasto.

## Funcionalidades

- **Cadastro de Usuário**: O usuário pode informar seu nome e saldo mensal inicial.
- **Adição de Gastos**: O usuário pode adicionar gastos fixos ou provisórios, informando descrição, valor e categoria.
- **Consulta de Gastos**: O sistema exibe uma lista dos gastos já registrados.
- **Informações do Usuário**: Exibe o saldo mensal inicial e o saldo atual do usuário.
- **Alertas de Gastos**: O sistema alerta quando o usuário atinge 80% ou 90% do seu saldo mensal.

## Estrutura do Projeto

- **models/Usuario.java**: Classe que representa o usuário, contendo informações sobre o nome, saldo e a lista de gastos.
- **models/Gastos.java**: Classe abstrata que define os atributos e comportamentos comuns a todos os tipos de gastos.
- **models/GastosFixos.java**: Classe que representa um gasto fixo.
- **models/GastosProvisorios.java**: Classe que representa um gasto provisório.
- **models/PorcentualDeGastos.java**: Classe que define o percentual de divisão do orçamento em 60/25/15 para essencial, pessoal e poupança.
- **Main.java**: Classe principal que executa o sistema, permitindo a interação com o usuário.

## Como Rodar o Projeto

### Requisitos
- JDK 8 ou superior.

### Passos

1. Clone o repositório para sua máquina local:

    ```bash
    git clone https://github.com/SEU-USUARIO/gerenciador-de-gastos.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd gerenciador-de-gastos
    ```

3. Compile o código:

    ```bash
    javac -d bin src/*.java
    ```

4. Execute o projeto:

    ```bash
    java -cp bin Main
    ```

### Fluxo do Sistema

1. O sistema solicita que o usuário informe seu nome e saldo inicial.
2. O usuário pode adicionar gastos fixos ou provisórios.
3. O sistema irá calcular os alertas e mostrar os percentuais de gastos, com base na regra **60/25/15**:
   - 60% para gastos essenciais.
   - 25% para gastos pessoais.
   - 15% para poupança.
4. O usuário pode consultar os gastos e visualizar os alertas sobre o saldo.

## Exemplo de Execução

Ao rodar o sistema, o terminal irá exibir as seguintes opções:

Bem-vindo ao Gerenciador de Gastos! Informe seu nome: João Informe seu saldo mensal: 1000.0 === Informações do usuário === Nome: João Saldo mensal inicial: 1000.0 Saldo atual: 1000.0
Escolha uma opção: 1 - Adicionar Gasto Fixo 2 - Adicionar Gasto Provisório 3 - Consultar Gastos 4 - Informações Porcentuais 5 - Informações do Usuário 6 - Sair


O usuário pode então adicionar gastos, consultar gastos, ver os alertas de percentual de gastos, ou sair do sistema.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, fique à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
