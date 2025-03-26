package models;

public class PorcentualDeGastos extends Gastos{
    public PorcentualDeGastos(String descricao, double valor, String tipo, String categoria) {
        super(descricao, valor, tipo, categoria);
    }

    public void infoPorcentual() {
        System.out.println("O sistema trabalha na regra 60/25/15! Na qual 60% para gastos essenciais (margem para aumentos inesperados); 25% para gastos pessoais (flexibilidade); 15% para poupança (garantindo um colchão financeiro). Nesse caso sua margem de gastos ficaria entre 80% no minínimo (tentar não utrapassar esse valor) e no máximo 90% (Não utrapassar!)");
    }
}
