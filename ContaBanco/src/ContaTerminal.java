import java.io.PrintStream;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem conta criada

        int Numero;
        String Agencia, NomeCliente;
        double Saldo;

        try (Scanner sc = new Scanner(System.in)) {

            System.setOut(new PrintStream(System.out, true, "UTF-8"));
            
            System.out.println("Por favor, digite o número da Agência !");
            Agencia = sc.nextLine();

            System.out.println("Por favor, digite o número da Conta !");
            Numero = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha após a entrada do número da conta

            System.out.println("Por favor, digite o nome do Cliente !");
            NomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o saldo da Conta !");
            Saldo = sc.nextDouble();

            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

            sc.close();
        }
    }

    }

