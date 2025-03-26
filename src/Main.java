import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Gerenciador de Gastos!");

        // Criar usuário
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu saldo mensal: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer

        Usuario usuario = new Usuario(nome, saldo);

        double saldoInicial = saldo;
        usuario.infoUsuario(saldoInicial);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Gasto Fixo");
            System.out.println("2 - Adicionar Gasto Provisório");
            System.out.println("3 - Consultar Gastos");
            System.out.println("4 - Informações Porcentuais");
            System.out.println("5 - Informações do Usuário");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                case 2:
                    System.out.print("Descrição do gasto: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Valor do gasto: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Categoria do gasto: ");
                    String categoria = scanner.nextLine();

                    Gastos gasto = (opcao == 1) ?
                            new GastosFixos(descricao, valor, "Fixo", categoria) :
                            new GastosProvisorios(descricao, valor, "Provisório", categoria);

                    gasto.validarValores();
                    gasto.aplicarGasto(usuario);
                    usuario.adicionarGasto(gasto);

                    System.out.println("Gasto adicionado com sucesso!");
                    break;

                case 3:
                    usuario.infoDeGastos();
                    break;

                case 4:
                    PorcentualDeGastos info = new PorcentualDeGastos("", 0, "", "");
                    info.infoPorcentual();
                    break;

                case 5:
                    usuario.infoUsuario(saldoInicial);
                    break;

                case 6:
                    continuar = false;
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}