/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocliente;

/**
 *
 * @author Bruna
 */
public abstract class Conta extends IConta {
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    void sacar(double valor) {
        saldo -= valor;
    }

    
    @Override
    void depositar(double valor) {
        saldo += valor;
    }

    void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    void ImprimirExtrato() {
        System.out.println("=== Extrato da conta ===");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
