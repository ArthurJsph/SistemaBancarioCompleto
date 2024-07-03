/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocliente;

/**
 *
 * @author Bruna
 */
public class ContaCorrente extends Conta {
    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
          super.ImprimirExtrato();
    }
}


