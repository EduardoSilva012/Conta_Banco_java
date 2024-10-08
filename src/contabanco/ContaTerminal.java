
package contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       int numero;
       double saldo;
       String agencia, nomeCliente;
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, Digite o seu nome: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, Digite o número da Agência: ");
        agencia = sc.nextLine();
        
        System.out.println("Por favor, Digite o número da conta: ");
        numero = sc.nextInt();
        
        System.out.println("Por favor, digite seu saldo: ");
        saldo = sc.nextDouble();
        
        
        System.out.println("Olá, "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque.");
        
        
        
       
    }
    
}
