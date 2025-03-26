package models;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private double saldo;
    private ArrayList<Gastos> gastos;

    public Usuario(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.gastos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Gastos> getGastos() {
        return gastos;
    }

    public void validarValores() {
        if (saldo == 0.0) {
            System.out.println("Seu saldo não pode ser menor ou igual a 0");
        } else if (saldo < 0.0) {
            System.out.println("Seu saldo não pode ser menor ou igual a 0");
        }
    }

    public void infoUsuario(double saldoInicial) {
        System.out.println("=== Informações do usuário ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo mensal: " + saldoInicial);
        System.out.println("==============================");

    }

    public void adicionarGasto(Gastos gasto) {
        gastos.add(gasto);
    }

    public void removerGasto(Gastos gasto) {
        gastos.remove(gasto);
    }

    public void infoDeGastos() {
        System.out.println("======== Lista de Gastos ========");
        for (Gastos gasto : gastos) {
            System.out.println("Descrição: " + gasto.getDescricao());
            System.out.println("Valor: " + gasto.getValor());
            System.out.println("Tipo de Gasto (Fixo/Provisório): " + gasto.getTipo());
            System.out.println("Categoria: " + gasto.getCategoria());
            System.out.println("=================================");
        }
        System.out.println("Saldo atual: " + getSaldo());
    }
}