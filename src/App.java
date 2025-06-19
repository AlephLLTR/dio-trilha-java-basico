import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import model.Cliente;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Insira o número da Agência: ");
        var agenciaId = sc.nextLine();

        System.out.print("Insira o número da Conta: ");
        var clienteId = sc.nextInt();
        sc.nextLine();

        System.out.print("Insira o nome do titular da Conta: ");
        var clienteNome = sc.nextLine();
        
        System.out.print("Insira o saldo da Conta: ");
        var saldo = sc.nextDouble();

        var cliente = new Cliente(clienteId, agenciaId, clienteNome, BigDecimal.valueOf(saldo));

        var message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", cliente.getClienteNome(), cliente.getAgenciaId(), cliente.getclienteId(), cliente.getSaldo());
    
        System.out.println(message);
    }
}
