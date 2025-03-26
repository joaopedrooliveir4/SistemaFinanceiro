package models;

public abstract class Gastos {
    private String descricao;
    private double valor;
    private String tipo;
    private String categoria;

    public Gastos(String descricao, double valor, String tipo, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void validarValores() {
        if (valor == 0.0) {
            System.out.println("Seu gasto não pode ser menor ou igual a 0");
        } else if (valor < 0.0) {
            System.out.println("Seu gasto não pode ser menor ou igual a 0");
        }
    }

    public void aplicarGasto(Usuario usuario) {
        if (usuario.getSaldo() >= valor) {
            double novoSaldo = usuario.getSaldo() - valor;
            usuario.setSaldo(novoSaldo);
            System.out.println("Gasto aplicado. Novo saldo: " + novoSaldo);

            double saldoInicial = usuario.getSaldo() + valor;
            double limite80 = saldoInicial * 0.80;
            double limite90 = saldoInicial * 0.90;

            double valorGastoTotal = saldoInicial - novoSaldo;

            if (valorGastoTotal >= limite80 && valorGastoTotal < limite90) {
                System.out.println("Atenção: Você gastou mais de 80% do seu saldo mensal. Considere controlar seus gastos.");
            }

            if (valorGastoTotal >= limite90) {
                System.out.println("ALERTA: Você atingiu 90% do seu saldo mensal. Recomendamos parar de gastar para evitar ficar no vermelho.");
            }
        } else {
        System.out.println("Saldo insuficiente. Saldo atual: " + usuario.getSaldo());
        }
    }
}