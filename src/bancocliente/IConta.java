/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocliente;

/**
 *
 * @author Bruna
 */
public abstract class IConta {
 
    abstract void sacar(double valor);
    abstract void depositar(double valor);
    abstract void transferir(double valor, IConta contaDestino);
    abstract void ImprimirExtrato();
}