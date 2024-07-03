/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancocliente;

import java.util.Scanner;

/**
 *
 * @author Bruna
 */
public class Main {
    public static void main(String[] args) {
        IConta contaCorrente = new ContaCorrente();
        IConta contaPoupanca = new ContaPoupanca();
        Cliente cliente = new Cliente();
        Banco banco = new Banco();
        
        contaCorrente.depositar(100);
        contaPoupanca.transferir(250, contaCorrente); 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        String senhaCorreta = "1234";
        
        if (senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido! Dados exibidos.");
            contaCorrente.ImprimirExtrato();
            contaPoupanca.ImprimirExtrato();
        } else {
            System.out.println("Senha incorreta. Operação bloqueada.");
        }
    }
}
    

 
    

